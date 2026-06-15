package com.pocketguidance.ui.activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.pocketguidance.data.db.AppDatabase
import com.pocketguidance.data.repository.AuthRepository
import com.pocketguidance.databinding.ActivityForgotPasswordBinding
import com.pocketguidance.utils.ValidationUtils
import kotlinx.coroutines.launch

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var binding: ActivityForgotPasswordBinding
    private lateinit var authRepo: AuthRepository
    private val TAG = "ForgotPasswordActivity"

    // Tracks which step the user is on
    private var currentStep = Step.EMAIL
    private var verifiedEmail = ""

    private enum class Step { EMAIL, SECURITY_QUESTION, NEW_PASSWORD }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.apply {
            title = "Reset Password"
            setDisplayHomeAsUpEnabled(true)
        }

        val db = AppDatabase.getInstance(this)
        authRepo = AuthRepository(db)

        showStep(Step.EMAIL)
        setupListeners()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }

    private fun setupListeners() {
        binding.btnNext.setOnClickListener {
            when (currentStep) {
                Step.EMAIL             -> handleEmailStep()
                Step.SECURITY_QUESTION -> handleSecurityQuestionStep()
                Step.NEW_PASSWORD      -> handleNewPasswordStep()
            }
        }

        // Contact support link (alternative if user has no security question set)
        binding.tvContactSupport.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, arrayOf("support@pocketguidance.app"))
                putExtra(Intent.EXTRA_SUBJECT, "Account Password Reset Request")
                putExtra(
                    Intent.EXTRA_TEXT,
                    "Hello Pocket Guidance Support,\n\n" +
                            "I am unable to reset my password using my security question " +
                            "and require manual account assistance.\n\n" +
                            "Registered email: ${binding.etEmail.text.toString().trim()}\n\n" +
                            "Thank you."
                )
            }
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(
                    this,
                    "No email app available. Contact support@pocketguidance.app",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }

    //validate email and retrieve security question
    private fun handleEmailStep() {
        val email = binding.etEmail.text.toString().trim()

        if (!ValidationUtils.isValidEmail(email)) {
            binding.tilEmail.error = "Enter a valid email address"
            return
        }
        binding.tilEmail.error = null

        setLoading(true)
        lifecycleScope.launch {
            val question = authRepo.getSecurityQuestion(email)
            setLoading(false)

            if (question == null) {
                binding.tilEmail.error =
                    "No account found with this email address"
                Log.w(TAG, "Reset attempt for unregistered email: $email")
                return@launch
            }

            if (question.isBlank()) {
                // Account exists but no security question was set at signup
                binding.tvStepDescription.text =
                    "This account does not have a security question set. " +
                            "Please contact our support team for manual account recovery."
                binding.tvContactSupport.visibility = View.VISIBLE
                binding.btnNext.isEnabled = false
                Log.w(TAG, "No security question set for: $email")
                return@launch
            }

            verifiedEmail = email
            binding.tvSecurityQuestion.text = question
            showStep(Step.SECURITY_QUESTION)
            Log.d(TAG, "Security question retrieved for: $email")
        }
    }

    // verify the security answer
    private fun handleSecurityQuestionStep() {
        val answer = binding.etSecurityAnswer.text.toString().trim()

        if (answer.isBlank()) {
            binding.tilSecurityAnswer.error = "Please enter your security answer"
            return
        }
        binding.tilSecurityAnswer.error = null

        setLoading(true)
        lifecycleScope.launch {
            val correct = authRepo.verifySecurityAnswer(verifiedEmail, answer)
            setLoading(false)

            if (!correct) {
                binding.tilSecurityAnswer.error = "Incorrect answer. Please try again."
                Log.w(TAG, "Wrong security answer for: $verifiedEmail")
                return@launch
            }

            showStep(Step.NEW_PASSWORD)
            Log.d(TAG, "Security answer verified for: $verifiedEmail")
        }
    }

    // set the new password
    private fun handleNewPasswordStep() {
        val newPassword     = binding.etNewPassword.text.toString()
        val confirmPassword = binding.etConfirmNewPassword.text.toString()

        if (!ValidationUtils.isValidPassword(newPassword)) {
            binding.tilNewPassword.error = "Password must be at least 6 characters"
            return
        }
        binding.tilNewPassword.error = null

        if (newPassword != confirmPassword) {
            binding.tilConfirmNewPassword.error = "Passwords do not match"
            return
        }
        binding.tilConfirmNewPassword.error = null

        setLoading(true)
        lifecycleScope.launch {
            val success = authRepo.resetPassword(verifiedEmail, newPassword)
            setLoading(false)

            if (success) {
                Toast.makeText(
                    this@ForgotPasswordActivity,
                    "Password reset successfully. Please log in.",
                    Toast.LENGTH_LONG
                ).show()
                Log.i(TAG, "Password reset completed for: $verifiedEmail")
                finish()
            } else {
                Toast.makeText(
                    this@ForgotPasswordActivity,
                    "Reset failed. Please try again.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun showStep(step: Step) {
        currentStep = step

        // Hide all sections first
        binding.layoutEmail.visibility          = View.GONE
        binding.layoutSecurityQuestion.visibility = View.GONE
        binding.layoutNewPassword.visibility    = View.GONE
        binding.btnNext.isEnabled               = true
        binding.tvContactSupport.visibility     = View.GONE

        when (step) {
            Step.EMAIL -> {
                binding.tvStepTitle.text       = "Reset Password"
                binding.tvStepDescription.text =
                    "Enter the email address registered to your account. " +
                            "You will be asked to answer your security question to verify your identity."
                binding.layoutEmail.visibility = View.VISIBLE
                binding.btnNext.text           = "Continue"
            }
            Step.SECURITY_QUESTION -> {
                binding.tvStepTitle.text             = "Security Verification"
                binding.tvStepDescription.text       =
                    "Answer the security question you set when registering your account."
                binding.layoutSecurityQuestion.visibility = View.VISIBLE
                binding.btnNext.text                 = "Verify Answer"
            }
            Step.NEW_PASSWORD -> {
                binding.tvStepTitle.text          = "Set New Password"
                binding.tvStepDescription.text    =
                    "Choose a new password for your account. " +
                            "It must be at least 6 characters long."
                binding.layoutNewPassword.visibility = View.VISIBLE
                binding.btnNext.text              = "Reset Password"
            }
        }
    }

    private fun setLoading(loading: Boolean) {
        binding.btnNext.isEnabled      = !loading
        binding.progressBar.visibility = if (loading) View.VISIBLE else View.GONE
    }
}
