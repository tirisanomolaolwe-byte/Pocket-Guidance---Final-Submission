package com.pocketguidance.data.db.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0005H\'J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\u0013\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0015\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\u0016\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/pocketguidance/data/db/dao/GoalDao;", "", "addContribution", "", "goalId", "", "amount", "", "(JDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "goal", "Lcom/pocketguidance/data/db/entities/GoalEntity;", "(Lcom/pocketguidance/data/db/entities/GoalEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findById", "id", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllForUser", "Lkotlinx/coroutines/flow/Flow;", "", "userId", "getAllOnce", "insert", "update", "app_release"})
@androidx.room.Dao()
public abstract interface GoalDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.data.db.entities.GoalEntity goal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.data.db.entities.GoalEntity goal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.data.db.entities.GoalEntity goal, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM goals WHERE userId = :userId ORDER BY completed ASC, deadline ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.pocketguidance.data.db.entities.GoalEntity>> getAllForUser(long userId);
    
    @androidx.room.Query(value = "SELECT * FROM goals WHERE userId = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllOnce(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.pocketguidance.data.db.entities.GoalEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM goals WHERE id = :id LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.pocketguidance.data.db.entities.GoalEntity> $completion);
    
    @androidx.room.Query(value = "\n        UPDATE goals \n        SET currentAmount = currentAmount + :amount,\n            completed = CASE WHEN currentAmount + :amount >= targetAmount THEN 1 ELSE 0 END\n        WHERE id = :goalId\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addContribution(long goalId, double amount, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}