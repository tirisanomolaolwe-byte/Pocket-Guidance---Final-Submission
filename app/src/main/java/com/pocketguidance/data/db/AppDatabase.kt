package com.pocketguidance.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.pocketguidance.data.db.dao.*
import com.pocketguidance.data.db.entities.*


@Database(
    entities = [
        UserEntity::class,
        TransactionEntity::class,
        BudgetEntity::class,
        GoalEntity::class,
        CategoryEntity::class,
        UserPrefsEntity::class,
        BadgeEntity::class,
        InvestmentEntity::class,

    ],
    version = 3,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao
    abstract fun transactionDao(): TransactionDao
    abstract fun budgetDao(): BudgetDao
    abstract fun goalDao(): GoalDao
    abstract fun categoryDao(): CategoryDao
    abstract fun userPrefsDao(): UserPrefsDao
    abstract fun badgeDao(): BadgeDao


    companion object {
        private const val DATABASE_NAME = "pocket_guidance.db"

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    DATABASE_NAME
                )
                    .fallbackToDestructiveMigration()
                    .build()
                    .also { INSTANCE = it }
            }

        // Alias for any file that calls getDatabase() instead of getInstance()
        fun getDatabase(context: Context): AppDatabase = getInstance(context)
    }
}
