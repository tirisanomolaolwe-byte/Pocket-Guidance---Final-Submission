package com.pocketguidance.data.db.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00130\u00122\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u0018\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/pocketguidance/data/db/dao/BudgetDao;", "", "addSpent", "", "userId", "", "category", "", "amount", "", "(JLjava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "budget", "Lcom/pocketguidance/data/db/entities/BudgetEntity;", "(Lcom/pocketguidance/data/db/entities/BudgetEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findByCategory", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllForUser", "Lkotlinx/coroutines/flow/Flow;", "", "getAllForUserOnce", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "resetAllSpent", "update", "app_release"})
@androidx.room.Dao()
public abstract interface BudgetDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.data.db.entities.BudgetEntity budget, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.data.db.entities.BudgetEntity budget, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.data.db.entities.BudgetEntity budget, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM budgets WHERE userId = :userId ORDER BY category ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.pocketguidance.data.db.entities.BudgetEntity>> getAllForUser(long userId);
    
    @androidx.room.Query(value = "SELECT * FROM budgets WHERE userId = :userId ORDER BY category ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllForUserOnce(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.pocketguidance.data.db.entities.BudgetEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM budgets WHERE userId = :userId AND category = :category LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findByCategory(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.pocketguidance.data.db.entities.BudgetEntity> $completion);
    
    @androidx.room.Query(value = "UPDATE budgets SET spent = spent + :amount WHERE userId = :userId AND category = :category")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addSpent(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String category, double amount, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE budgets SET spent = 0 WHERE userId = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object resetAllSpent(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}