package com.pocketguidance.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010\u000fJ\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@\u00a2\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010\u001cJ6\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010$J\u001e\u0010%\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010&\u001a\u00020\'H\u0086@\u00a2\u0006\u0002\u0010(J.\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\'2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010,\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010-J\u0016\u0010.\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010$J\u0016\u0010/\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010\u000fJ\u001e\u00100\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u0014J\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u0006\u0010\u0012\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010$J\u001a\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\b032\u0006\u0010\u0012\u001a\u00020\fJ\u001a\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\b032\u0006\u0010\u0012\u001a\u00020\fJ\u001c\u00106\u001a\b\u0012\u0004\u0012\u0002050\b2\u0006\u0010\u0012\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010$J\u001a\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b032\u0006\u0010\u0012\u001a\u00020\fJ\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u0012\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010$J\u001a\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0\b032\u0006\u0010\u0012\u001a\u00020\fJ\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\b2\u0006\u0010\u0012\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010$J\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\b2\u0006\u0010\u0012\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010$J,\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\b2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010AJ\u001a\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\b032\u0006\u0010\u0012\u001a\u00020\fJ*\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\b032\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0006J\u001a\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\b032\u0006\u0010\u0012\u001a\u00020\fJ\u001c\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\u0006\u0010\u0012\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010$J&\u0010F\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u0006\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010G\u001a\u00020HH\u0086@\u00a2\u0006\u0002\u0010IJ\u0016\u0010J\u001a\u00020\'2\u0006\u0010\u0012\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010$J\u0016\u0010K\u001a\u00020\'2\u0006\u0010\u0012\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010$J*\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\b032\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0006J\u0016\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010N032\u0006\u0010\u0012\u001a\u00020\fJ\u0018\u0010O\u001a\u0004\u0018\u00010N2\u0006\u0010\u0012\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010$J\u0016\u0010P\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010$J\u0016\u0010Q\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010$J\b\u0010R\u001a\u00020\u0006H\u0002J\u0016\u0010S\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010\u000fJ\u001e\u0010T\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\'H\u0086@\u00a2\u0006\u0002\u0010(J\u001e\u0010U\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010V\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u0014J\u001e\u0010W\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010X\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010YJ\u001e\u0010Z\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010[\u001a\u00020\'H\u0086@\u00a2\u0006\u0002\u0010(J\u001e\u0010\\\u001a\u00020\u001e2\u0006\u0010]\u001a\u00020\f2\u0006\u0010^\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u0014J&\u0010_\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010`\u001a\u00020\'2\u0006\u0010a\u001a\u00020\'H\u0086@\u00a2\u0006\u0002\u0010bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006c"}, d2 = {"Lcom/pocketguidance/data/repository/FinanceRepository;", "", "db", "Lcom/pocketguidance/data/db/AppDatabase;", "(Lcom/pocketguidance/data/db/AppDatabase;)V", "TAG", "", "defaultCategories", "", "getDefaultCategories", "()Ljava/util/List;", "addBudget", "", "budget", "Lcom/pocketguidance/data/db/entities/BudgetEntity;", "(Lcom/pocketguidance/data/db/entities/BudgetEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addCustomCategory", "", "userId", "name", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addGoal", "goal", "Lcom/pocketguidance/data/db/entities/GoalEntity;", "(Lcom/pocketguidance/data/db/entities/GoalEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addTransaction", "tx", "Lcom/pocketguidance/data/db/entities/TransactionEntity;", "(Lcom/pocketguidance/data/db/entities/TransactionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awardBadge", "", "type", "desc", "icon", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkAndAwardBadges", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeOnboarding", "monthlyIncome", "", "(JDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contributeToGoal", "goalId", "amount", "goalName", "(JDJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createDefaultPrefs", "deleteBudget", "deleteCustomCategory", "getAllExpensesOnce", "getAllTransactions", "Lkotlinx/coroutines/flow/Flow;", "getBadges", "Lcom/pocketguidance/data/db/entities/BadgeEntity;", "getBadgesOnce", "getBudgets", "getBudgetsOnce", "getCategories", "Lcom/pocketguidance/data/db/entities/CategoryEntity;", "getCategoriesOnce", "getCategoryBreakdown", "Lcom/pocketguidance/data/db/dao/CategoryTotal;", "getCategoryBreakdownInRange", "start", "end", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExpenses", "getExpensesByDateRange", "getGoals", "getGoalsOnce", "getRecentTransactions", "limit", "", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTotalExpenses", "getTotalIncome", "getTransactionsByDateRange", "getUserPrefs", "Lcom/pocketguidance/data/db/entities/UserPrefsEntity;", "getUserPrefsOnce", "markOnboarded", "seedDefaultCategories", "today", "updateBudget", "updateBudgetGoal", "updateCurrency", "currency", "updateDarkMode", "dark", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMonthlyIncome", "income", "updateReceiptPhoto", "txId", "path", "updateSpendingGoals", "min", "max", "(JDDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class FinanceRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.pocketguidance.data.db.AppDatabase db = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "FinanceRepository";
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> defaultCategories = null;
    
    public FinanceRepository(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.data.db.AppDatabase db) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDefaultCategories() {
        return null;
    }
    
    private final java.lang.String today() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addTransaction(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.data.db.entities.TransactionEntity tx, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.pocketguidance.data.db.entities.TransactionEntity>> getAllTransactions(long userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.pocketguidance.data.db.entities.TransactionEntity>> getTransactionsByDateRange(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String start, @org.jetbrains.annotations.NotNull()
    java.lang.String end) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.pocketguidance.data.db.entities.TransactionEntity>> getExpenses(long userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.pocketguidance.data.db.entities.TransactionEntity>> getExpensesByDateRange(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String start, @org.jetbrains.annotations.NotNull()
    java.lang.String end) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTotalIncome(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTotalExpenses(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCategoryBreakdown(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.pocketguidance.data.db.dao.CategoryTotal>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCategoryBreakdownInRange(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String start, @org.jetbrains.annotations.NotNull()
    java.lang.String end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.pocketguidance.data.db.dao.CategoryTotal>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getRecentTransactions(long userId, int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.pocketguidance.data.db.entities.TransactionEntity>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateReceiptPhoto(long txId, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllExpensesOnce(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.pocketguidance.data.db.entities.TransactionEntity>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addBudget(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.data.db.entities.BudgetEntity budget, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.pocketguidance.data.db.entities.BudgetEntity>> getBudgets(long userId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBudgetsOnce(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.pocketguidance.data.db.entities.BudgetEntity>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateBudget(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.data.db.entities.BudgetEntity budget, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteBudget(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.data.db.entities.BudgetEntity budget, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addGoal(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.data.db.entities.GoalEntity goal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.pocketguidance.data.db.entities.GoalEntity>> getGoals(long userId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getGoalsOnce(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.pocketguidance.data.db.entities.GoalEntity>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object contributeToGoal(long goalId, double amount, long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String goalName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object seedDefaultCategories(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.pocketguidance.data.db.entities.CategoryEntity>> getCategories(long userId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCategoriesOnce(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.pocketguidance.data.db.entities.CategoryEntity>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addCustomCategory(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteCustomCategory(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.pocketguidance.data.db.entities.UserPrefsEntity> getUserPrefs(long userId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserPrefsOnce(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.pocketguidance.data.db.entities.UserPrefsEntity> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createDefaultPrefs(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateMonthlyIncome(long userId, double income, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateBudgetGoal(long userId, double goal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateSpendingGoals(long userId, double min, double max, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateCurrency(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateDarkMode(long userId, boolean dark, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object markOnboarded(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.pocketguidance.data.db.entities.BadgeEntity>> getBadges(long userId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBadgesOnce(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.pocketguidance.data.db.entities.BadgeEntity>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object awardBadge(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String desc, @org.jetbrains.annotations.NotNull()
    java.lang.String icon, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object checkAndAwardBadges(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object completeOnboarding(long userId, double monthlyIncome, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}