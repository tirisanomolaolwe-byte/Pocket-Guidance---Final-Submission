package com.pocketguidance.data.db.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/pocketguidance/data/db/dao/BadgeDao;", "", "getForUser", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/pocketguidance/data/db/entities/BadgeEntity;", "userId", "", "getForUserOnce", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasBadge", "", "type", "", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "badge", "(Lcom/pocketguidance/data/db/entities/BadgeEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
@androidx.room.Dao()
public abstract interface BadgeDao {
    
    @androidx.room.Insert(onConflict = 5)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.data.db.entities.BadgeEntity badge, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM badges WHERE userId = :userId")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.pocketguidance.data.db.entities.BadgeEntity>> getForUser(long userId);
    
    @androidx.room.Query(value = "SELECT * FROM badges WHERE userId = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getForUserOnce(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.pocketguidance.data.db.entities.BadgeEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT EXISTS(SELECT 1 FROM badges WHERE userId = :userId AND badgeType = :type)")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object hasBadge(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
}