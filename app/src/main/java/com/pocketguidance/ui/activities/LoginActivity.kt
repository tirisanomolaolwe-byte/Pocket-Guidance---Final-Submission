package com.pocketguidance.ui.activities

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.pocketguidance.databinding.ActivityLoginBinding
import com.pocketguidance.utils.SessionManager
import com.pocketguidance.utils.ValidationUtils
import kotlinx.coroutines.launch

class LoginActivity : BaseActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val TAG = "LoginActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupListeners()
        Log.d(TAG, "LoginActivity created")
    }

    private fun setupListeners() {
        binding.btnLogin.setOnClickListener { attemptLogin() }
        binding.tvSignup.setOnClickListener { navigateTo(SignupActivity::class.java) }
        // Navigates to the dedicated 3-step reset screen
        binding.tvForgotPassword.setOnClickListener {
            navigateTo(ForgotPasswordActivity::class.java)
        }
    }

    private fun attemptLogin() {
        val email    = binding.etEmail.text.toString().trim()
        val password = binding.etPassword.text.toString()

        if (!ValidationUtils.isValidEmail(email)) {
            binding.tilEmail.error = "Enter a valid email address"
            return
        }
        binding.tilEmail.error = null

        if (!ValidationUtils.isValidPassword(password)) {
            binding.tilPassword.error = "Password must be at least 6 characters"
            return
        }
        binding.tilPassword.error = null

        setLoading(true)

        lifecycleScope.launch {
            val userId = authRepo.login(email, password)
            setLoading(false)

            if (userId != null) {
                val user = authRepo.getUserById(userId)
                SessionManager.saveSession(
                    context  = this@LoginActivity,
                    userId   = userId,
                    username = user?.username ?: "",
                    email    = user?.email    ?: ""
                )
                Log.i(TAG, "Login success for userId=$userId")

                val prefs = financeRepo.getUserPrefsOnce(userId)
                if (prefs == null || !prefs.onboarded) {
                    navigateTo(OnboardingActivity::class.java, finish = true)
                } else {
                    navigateTo(DashboardActivity::class.java, finish = true)
                }
            } else {
                Log.w(TAG, "Login failed for email=$email")
                Toast.makeText(
                    this@LoginActivity,
                    "Invalid email or password",
                    Toast.LENGTH_SHORT
                ).show()
                binding.tilPassword.error = "Incorrect email or password"
            }
        }
    }

    private fun setLoading(loading: Boolean) {
        binding.btnLogin.isEnabled     = !loading
        binding.progressBar.visibility = if (loading) View.VISIBLE else View.GONE
    }
}
