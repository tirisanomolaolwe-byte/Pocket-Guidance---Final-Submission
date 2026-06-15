package com.pocketguidance.data.repository

import android.util.Log
import com.pocketguidance.data.db.AppDatabase
import com.pocketguidance.data.db.entities.UserEntity
import java.security.MessageDigest

class AuthRepository(private val db: AppDatabase) {

    private val TAG = "AuthRepository"

    private fun sha256(input: String): String {
        val bytes = MessageDigest.getInstance("SHA-256").digest(input.toByteArray())
        return bytes.joinToString("") { "%02x".format(it) }
    }

    suspend fun login(email: String, password: String): Long? {
        val user = db.userDao().findByEmail(email.lowercase().trim())
        if (user == null) {
            Log.w(TAG, "Login failed: email not found")
            return null
        }
        if (user.passwordHash != sha256(password)) {
            Log.w(TAG, "Login failed: wrong password")
            return null
        }
        Log.i(TAG, "Login success for userId=${user.id}")
        return user.id
    }

    suspend fun signup(
        email: String,
        password: String,
        username: String,
        securityQuestion: String = "",
        securityAnswer: String = ""
    ): Long? {
        val existing = db.userDao().findByEmail(email.lowercase().trim())
        if (existing != null) {
            Log.w(TAG, "Signup failed: email already registered")
            return null
        }
        val user = UserEntity(
            email              = email.lowercase().trim(),
            username           = username.trim(),
            passwordHash       = sha256(password),
            securityQuestion   = securityQuestion,
            securityAnswerHash = if (securityAnswer.isNotBlank()) sha256(securityAnswer.lowercase().trim()) else ""
        )
        val id = db.userDao().insert(user)
        Log.i(TAG, "Signup success: userId=$id")
        return id
    }

    suspend fun getUserById(id: Long): UserEntity? = db.userDao().findById(id)

    // Step 1 of reset: verify the email exists and return the security question
    suspend fun getSecurityQuestion(email: String): String? {
        val user = db.userDao().findByEmail(email.lowercase().trim())
        if (user == null || user.securityQuestion.isBlank()) {
            Log.w(TAG, "Password reset: email not found or no security question set")
            return null
        }
        return user.securityQuestion
    }

    // Step 2 of reset: verify the security answer
    suspend fun verifySecurityAnswer(email: String, answer: String): Boolean {
        val user = db.userDao().findByEmail(email.lowercase().trim()) ?: return false
        val matches = user.securityAnswerHash == sha256(answer.lowercase().trim())
        Log.d(TAG, "Security answer verification for $email: $matches")
        return matches
    }

    // Step 3 of reset: update to new password after answer verified
    suspend fun resetPassword(email: String, newPassword: String): Boolean {
        return try {
            db.userDao().updatePassword(email.lowercase().trim(), sha256(newPassword))
            Log.i(TAG, "Password reset successful for $email")
            true
        } catch (e: Exception) {
            Log.e(TAG, "Password reset failed: ${e.message}")
            false
        }
    }

    suspend fun updateUsername(userId: Long, username: String) {
        db.userDao().updateUsername(userId, username)
    }

    suspend fun updateAvatar(userId: Long, path: String) {
        db.userDao().updateAvatar(userId, path)
    }

    suspend fun updateSecurityQuestion(userId: Long, question: String, answer: String) {
        db.userDao().updateSecurityQuestion(userId, question, sha256(answer.lowercase().trim()))
    }
}
