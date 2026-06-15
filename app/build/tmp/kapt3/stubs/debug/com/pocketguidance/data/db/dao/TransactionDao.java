package com.pocketguidance.data.db.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\r2\u0006\u0010\t\u001a\u00020\nH\'J,\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\'J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\r2\u0006\u0010\t\u001a\u00020\nH\'J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ$\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0010H\'J,\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0002\u0010\u0017J,\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\'J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u00a7@\u00a2\u0006\u0002\u0010\u001cJ\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ(\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0002\u0010\u0017J\u0018\u0010\"\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010#\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0002\u0010\'\u00a8\u0006("}, d2 = {"Lcom/pocketguidance/data/db/dao/TransactionDao;", "", "delete", "", "transaction", "Lcom/pocketguidance/data/db/entities/TransactionEntity;", "(Lcom/pocketguidance/data/db/entities/TransactionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllExpensesOnce", "", "userId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllForUser", "Lkotlinx/coroutines/flow/Flow;", "getByDateRange", "startDate", "", "endDate", "getExpenses", "getExpensesByCategory", "Lcom/pocketguidance/data/db/dao/CategoryTotal;", "category", "getExpensesByCategoryInRange", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getExpensesByDateRange", "getRecent", "limit", "", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTotalExpenses", "", "getTotalExpensesInRange", "start", "end", "getTotalIncome", "insert", "updateReceiptPhoto", "txId", "path", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface TransactionDao {
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.data.db.entities.TransactionEntity transaction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.data.db.entities.TransactionEntity transaction, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM transactions WHERE userId = :userId ORDER BY date DESC, createdAt DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.pocketguidance.data.db.entities.TransactionEntity>> getAllForUser(long userId);
    
    @androidx.room.Query(value = "\n        SELECT * FROM transactions \n        WHERE userId = :userId AND date BETWEEN :startDate AND :endDate \n        ORDER BY date DESC, createdAt DESC\n    ")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.pocketguidance.data.db.entities.TransactionEntity>> getByDateRange(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String startDate, @org.jetbrains.annotations.NotNull()
    java.lang.String endDate);
    
    @androidx.room.Query(value = "\n        SELECT * FROM transactions \n        WHERE userId = :userId AND type = \'expense\' \n        ORDER BY date DESC, createdAt DESC\n    ")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.pocketguidance.data.db.entities.TransactionEntity>> getExpenses(long userId);
    
    @androidx.room.Query(value = "\n        SELECT * FROM transactions \n        WHERE userId = :userId AND type = \'expense\' AND date BETWEEN :startDate AND :endDate \n        ORDER BY date DESC, createdAt DESC\n    ")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.pocketguidance.data.db.entities.TransactionEntity>> getExpensesByDateRange(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String startDate, @org.jetbrains.annotations.NotNull()
    java.lang.String endDate);
    
    @androidx.room.Query(value = "\n        SELECT * FROM transactions \n        WHERE userId = :userId AND type = \'expense\' AND category = :category \n        ORDER BY date DESC\n    ")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.pocketguidance.data.db.entities.TransactionEntity>> getExpensesByCategory(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String category);
    
    @androidx.room.Query(value = "SELECT SUM(amount) FROM transactions WHERE userId = :userId AND type = \'expense\'")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTotalExpenses(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion);
    
    @androidx.room.Query(value = "SELECT SUM(amount) FROM transactions WHERE userId = :userId AND type = \'expense\' AND date BETWEEN :start AND :end")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTotalExpensesInRange(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String start, @org.jetbrains.annotations.NotNull()
    java.lang.String end, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion);
    
    @androidx.room.Query(value = "SELECT SUM(amount) FROM transactions WHERE userId = :userId AND type = \'income\'")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTotalIncome(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion);
    
    @androidx.room.Query(value = "\n        SELECT category, SUM(amount) as total \n        FROM transactions \n        WHERE userId = :userId AND type = \'expense\' \n        GROUP BY category \n        ORDER BY total DESC\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getExpensesByCategory(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.pocketguidance.data.db.dao.CategoryTotal>> $completion);
    
    @androidx.room.Query(value = "\n        SELECT category, SUM(amount) as total \n        FROM transactions \n        WHERE userId = :userId AND type = \'expense\' AND date BETWEEN :startDate AND :endDate\n        GROUP BY category \n        ORDER BY total DESC\n    ")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getExpensesByCategoryInRange(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String startDate, @org.jetbrains.annotations.NotNull()
    java.lang.String endDate, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.pocketguidance.data.db.dao.CategoryTotal>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM transactions WHERE userId = :userId ORDER BY date DESC, createdAt DESC LIMIT :limit")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRecent(long userId, int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.pocketguidance.data.db.entities.TransactionEntity>> $completion);
    
    @androidx.room.Query(value = "UPDATE transactions SET receiptPhotoPath = :path WHERE id = :txId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateReceiptPhoto(long txId, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM transactions WHERE userId = :userId AND type = \'expense\' ORDER BY date DESC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllExpensesOnce(long userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.pocketguidance.data.db.entities.TransactionEntity>> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}