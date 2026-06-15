package com.pocketguidance.data.repository

import android.util.Log

import com.pocketguidance.data.db.AppDatabase
import com.pocketguidance.data.db.dao.CategoryTotal
import com.pocketguidance.data.db.entities.*
import com.pocketguidance.utils.FormatUtils
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class FinanceRepository(private val db: AppDatabase) {

    private val TAG  = "FinanceRepository"


    val defaultCategories = listOf(
        "Food", "Transport", "Rent", "Entertainment",
        "Shopping", "Health", "Education", "Utilities", "Other"
    )

    private fun today() = FormatUtils.todayIso()

    // Transactions

    suspend fun addTransaction(tx: TransactionEntity): Long {
        Log.d(TAG, "addTransaction type=${tx.type} amount=${tx.amount} cat=${tx.category}")
        val id = db.transactionDao().insert(tx)
        if (tx.type == "expense") db.budgetDao().addSpent(tx.userId, tx.category, tx.amount)
        return id
    }

    fun getAllTransactions(userId: Long): Flow<List<TransactionEntity>> =
        db.transactionDao().getAllForUser(userId)

    fun getTransactionsByDateRange(userId: Long, start: String, end: String): Flow<List<TransactionEntity>> =
        db.transactionDao().getByDateRange(userId, start, end)

    fun getExpenses(userId: Long): Flow<List<TransactionEntity>> =
        db.transactionDao().getExpenses(userId)

    fun getExpensesByDateRange(userId: Long, start: String, end: String): Flow<List<TransactionEntity>> =
        db.transactionDao().getExpensesByDateRange(userId, start, end)

    suspend fun getTotalIncome(userId: Long): Double =
        db.transactionDao().getTotalIncome(userId) ?: 0.0

    suspend fun getTotalExpenses(userId: Long): Double =
        db.transactionDao().getTotalExpenses(userId) ?: 0.0

    suspend fun getCategoryBreakdown(userId: Long): List<CategoryTotal> =
        db.transactionDao().getExpensesByCategory(userId)

    suspend fun getCategoryBreakdownInRange(userId: Long, start: String, end: String): List<CategoryTotal> =
        db.transactionDao().getExpensesByCategoryInRange(userId, start, end)

    suspend fun getRecentTransactions(userId: Long, limit: Int = 5): List<TransactionEntity> =
        db.transactionDao().getRecent(userId, limit)

    suspend fun updateReceiptPhoto(txId: Long, path: String) =
        db.transactionDao().updateReceiptPhoto(txId, path)

    suspend fun getAllExpensesOnce(userId: Long): List<TransactionEntity> =
        db.transactionDao().getAllExpensesOnce(userId)

    // Budgets

    suspend fun addBudget(budget: BudgetEntity): Long {
        Log.d(TAG, "addBudget category=${budget.category} limit=${budget.limitAmount}")
        return db.budgetDao().insert(budget)
    }

    fun getBudgets(userId: Long): Flow<List<BudgetEntity>> =
        db.budgetDao().getAllForUser(userId)

    suspend fun getBudgetsOnce(userId: Long): List<BudgetEntity> =
        db.budgetDao().getAllForUserOnce(userId)

    suspend fun updateBudget(budget: BudgetEntity) = db.budgetDao().update(budget)

    suspend fun deleteBudget(budget: BudgetEntity) = db.budgetDao().delete(budget)

    // Goals

    suspend fun addGoal(goal: GoalEntity): Long {
        Log.d(TAG, "addGoal name=${goal.name} target=${goal.targetAmount}")
        return db.goalDao().insert(goal)
    }

    fun getGoals(userId: Long): Flow<List<GoalEntity>> =
        db.goalDao().getAllForUser(userId)

    suspend fun getGoalsOnce(userId: Long): List<GoalEntity> =
        db.goalDao().getAllOnce(userId)

    suspend fun contributeToGoal(goalId: Long, amount: Double, userId: Long, goalName: String) {
        Log.d(TAG, "contributeToGoal goalId=$goalId amount=$amount")
        db.goalDao().addContribution(goalId, amount)
        db.transactionDao().insert(
            TransactionEntity(
                userId      = userId,
                type        = "goal_contribution",
                amount      = amount,
                category    = "Savings",
                description = "Contribution to $goalName",
                date        = today()
            )
        )
    }

    // Categories

    suspend fun seedDefaultCategories(userId: Long) {
        Log.d(TAG, "seedDefaultCategories userId=$userId")
        db.categoryDao().insertAll(
            defaultCategories.map { CategoryEntity(userId = userId, name = it, isCustom = false) }
        )
    }

    fun getCategories(userId: Long): Flow<List<CategoryEntity>> =
        db.categoryDao().getAllForUser(userId)

    suspend fun getCategoriesOnce(userId: Long): List<CategoryEntity> =
        db.categoryDao().getAllForUserOnce(userId)

    suspend fun addCustomCategory(userId: Long, name: String): Boolean {
        if (db.categoryDao().findByName(userId, name) != null) {
            Log.w(TAG, "Category '$name' already exists")
            return false
        }
        db.categoryDao().insert(CategoryEntity(userId = userId, name = name, isCustom = true))
        Log.d(TAG, "addCustomCategory name=$name")
        return true
    }

    suspend fun deleteCustomCategory(userId: Long, name: String) {
        db.categoryDao().deleteByName(userId, name)
        Log.d(TAG, "deleteCustomCategory name=$name")
    }

    // User Prefs

    fun getUserPrefs(userId: Long): Flow<UserPrefsEntity?> =
        db.userPrefsDao().getForUser(userId)

    suspend fun getUserPrefsOnce(userId: Long): UserPrefsEntity? =
        db.userPrefsDao().getForUserOnce(userId)

    suspend fun createDefaultPrefs(userId: Long) =
        db.userPrefsDao().insert(UserPrefsEntity(userId = userId))

    suspend fun updateMonthlyIncome(userId: Long, income: Double) =
        db.userPrefsDao().updateMonthlyIncome(userId, income)

    suspend fun updateBudgetGoal(userId: Long, goal: Double) =
        db.userPrefsDao().updateBudgetGoal(userId, goal)

    suspend fun updateSpendingGoals(userId: Long, min: Double, max: Double) =
        db.userPrefsDao().updateSpendingGoals(userId, min, max)

    suspend fun updateCurrency(userId: Long, currency: String) =
        db.userPrefsDao().updateCurrency(userId, currency)

    suspend fun updateDarkMode(userId: Long, dark: Boolean) =
        db.userPrefsDao().updateDarkMode(userId, dark)

    suspend fun markOnboarded(userId: Long) =
        db.userPrefsDao().markOnboarded(userId)

    // Gamification

    fun getBadges(userId: Long): Flow<List<BadgeEntity>> =
        db.badgeDao().getForUser(userId)

    suspend fun getBadgesOnce(userId: Long): List<BadgeEntity> =
        db.badgeDao().getForUserOnce(userId)

    suspend fun awardBadge(userId: Long, type: String, name: String, desc: String, icon: String) {
        if (!db.badgeDao().hasBadge(userId, type)) {
            db.badgeDao().insert(
                BadgeEntity(userId = userId, badgeType = type, name = name, description = desc, icon = icon)
            )
            Log.d(TAG, "Badge awarded: $name for userId=$userId")
        }
    }

    suspend fun checkAndAwardBadges(userId: Long) {
        val today  = LocalDate.now()
        val sdf    = DateTimeFormatter.ISO_DATE
        val all    = getAllExpensesOnce(userId)
        val prefs  = getUserPrefsOnce(userId)

        if (all.isNotEmpty()) {
            awardBadge(userId, "FIRST_ENTRY", "Welcome Aboard!",
                "Logged your first transaction.", "rocket")
        }
        if (all.size > 10) {
            awardBadge(userId, "ACTIVE_USER", "Data Collector",
                "Logged more than 10 transactions.", "chart")
        }

        val currentMonth = today.format(DateTimeFormatter.ofPattern("yyyy-MM"))
        val monthlySpent = db.transactionDao()
            .getTotalExpensesInRange(userId, "$currentMonth-01", "$currentMonth-31") ?: 0.0

        if (prefs != null && prefs.maxMonthlySpendingGoal > 0 && monthlySpent < prefs.maxMonthlySpendingGoal) {
            awardBadge(userId, "BUDGET_MASTER", "Budget Master",
                "Stayed under your max spending goal this month.", "trophy")
        }
        if (monthlySpent in 1.0..999.99) {
            awardBadge(userId, "SAVER", "Saver Badge",
                "Spent less than R1,000 this month.", "piggy")
        }

        val distinctCats = all.map { it.category }.distinct()
        if (distinctCats.size >= 5) {
            awardBadge(userId, "CATEGORY_PRO", "Category Explorer",
                "Used 5 or more spending categories.", "tag")
        }

        val expenseDates = all.map { it.date }.toSet()
        val has7DayStreak = (0..6).all { offset ->
            today.minusDays(offset.toLong()).format(sdf) in expenseDates
        }
        if (has7DayStreak) {
            awardBadge(userId, "STREAK_7", "7-Day Streak",
                "Logged expenses 7 days in a row.", "calendar")
        }

        val has30DayStreak = (0..29).all { offset ->
            today.minusDays(offset.toLong()).format(sdf) in expenseDates
        }
        if (has30DayStreak) {
            awardBadge(userId, "STREAK_30", "30-Day Streak",
                "Logged expenses 30 days in a row.", "fire")
        }
    }

    //Onboarding

    suspend fun completeOnboarding(userId: Long, monthlyIncome: Double) {
        Log.i(TAG, "completeOnboarding userId=$userId income=$monthlyIncome")
        db.transactionDao().insert(
            TransactionEntity(
                userId      = userId,
                type        = "income",
                amount      = monthlyIncome,
                category    = "Salary",
                description = "Monthly salary",
                date        = today()
            )
        )
        db.userPrefsDao().updateMonthlyIncome(userId, monthlyIncome)
        db.userPrefsDao().updateBudgetGoal(userId, monthlyIncome)
        db.userPrefsDao().markOnboarded(userId)
    }
}
