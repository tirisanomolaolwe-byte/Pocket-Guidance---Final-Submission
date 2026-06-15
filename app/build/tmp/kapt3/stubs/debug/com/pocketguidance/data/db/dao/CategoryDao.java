package com.pocketguidance.data.db.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ \u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000f2\u0006\u0010\b\u001a\u00020\tH\'J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0014\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u00a7@\u00a2\u0006\u0002\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/pocketguidance/data/db/dao/CategoryDao;", "", "delete", "", "category", "Lcom/pocketguidance/data/db/entities/CategoryEntity;", "(Lcom/pocketguidance/data/db/entities/CategoryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteByName", "userId", "", "name", "", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findByName", "getAllForUser", "Lkotlinx/coroutines/flow/Flow;", "", "getAllForUserOnce", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "insertAll", "categories", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface CategoryDao {
    
    @androidx.room.Insert(onConflict = 5)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.data.db.entities.CategoryEntity category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Insert(onConflict = 5)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.pocketguidance.data.db.entities.CategoryEntity> categories, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.data.db.entities.CategoryEntity category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM categories WHERE userId = :userId ORDER BY isCustom ASC, name ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.pocketguidance.data.db.entities.CategoryEntity>> getAllForUser(long userId);
    
    @androidx.room.Query(value = "SELECT * FROM categories WHERE userId = :userId ORDER BY isCustom ASC, name ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllForUserOnce(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.pocketguidance.data.db.entities.CategoryEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM categories WHERE userId = :userId AND name = :name LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object findByName(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.pocketguidance.data.db.entities.CategoryEntity> $completion);
    
    @androidx.room.Query(value = "DELETE FROM categories WHERE userId = :userId AND name = :name AND isCustom = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteByName(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}