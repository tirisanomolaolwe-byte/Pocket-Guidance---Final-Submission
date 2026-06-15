package com.pocketguidance.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val email: String,
    val username: String,
    val passwordHash: String,

    // Security question and answer for password reset
    // Answer is stored as SHA-256 hash — same as password

    val securityQuestion: String = "",
    val securityAnswerHash: String = "",
    val avatarPath: String? = null
)
