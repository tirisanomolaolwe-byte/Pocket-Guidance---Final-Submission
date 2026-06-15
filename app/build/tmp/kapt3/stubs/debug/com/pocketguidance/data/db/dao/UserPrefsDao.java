package com.pocketguidance.data.db.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u00a7@\u00a2\u0006\u0002\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u00a7@\u00a2\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0002\u0010\u0011J&\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0002\u0010\u001f\u00a8\u0006 "}, d2 = {"Lcom/pocketguidance/data/db/dao/UserPrefsDao;", "", "getForUser", "Lkotlinx/coroutines/flow/Flow;", "Lcom/pocketguidance/data/db/entities/UserPrefsEntity;", "userId", "", "getForUserOnce", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "prefs", "(Lcom/pocketguidance/data/db/entities/UserPrefsEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markOnboarded", "updateBudgetGoal", "goal", "", "(JDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCurrency", "currency", "", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDarkMode", "dark", "", "(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMonthlyIncome", "income", "updateSpendingGoals", "min", "max", "(JDDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface UserPrefsDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.data.db.entities.UserPrefsEntity prefs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM user_prefs WHERE userId = :userId LIMIT 1")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.pocketguidance.data.db.entities.UserPrefsEntity> getForUser(long userId);
    
    @androidx.room.Query(value = "SELECT * FROM user_prefs WHERE userId = :userId LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getForUserOnce(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.pocketguidance.data.db.entities.UserPrefsEntity> $completion);
    
    @androidx.room.Query(value = "UPDATE user_prefs SET monthlyIncome = :income WHERE userId = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateMonthlyIncome(long userId, double income, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE user_prefs SET monthlyBudgetGoal = :goal WHERE userId = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateBudgetGoal(long userId, double goal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE user_prefs SET minMonthlySpendingGoal = :min, maxMonthlySpendingGoal = :max WHERE userId = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateSpendingGoals(long userId, double min, double max, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE user_prefs SET currency = :currency WHERE userId = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateCurrency(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE user_prefs SET darkMode = :dark WHERE userId = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateDarkMode(long userId, boolean dark, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE user_prefs SET onboarded = 1 WHERE userId = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object markOnboarded(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}