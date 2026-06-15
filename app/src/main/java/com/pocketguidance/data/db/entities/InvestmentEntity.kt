package com.pocketguidance.data.db.entities

import androidx.room.*

@Entity(
    tableName = "investments",
    foreignKeys = [ForeignKey(
        entity     = UserEntity::class,
        parentColumns = ["id"],
        childColumns  = ["userId"],
        onDelete   = ForeignKey.CASCADE
    )],
    indices = [Index("userId")]
)
data class InvestmentEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val userId: Long,
    val name: String,
    val type: String,
    val invested: Double,
    val currentValue: Double,
    val date: String
)