package com.pocketguidance.data.db;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0012"}, d2 = {"Lcom/pocketguidance/data/db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "badgeDao", "Lcom/pocketguidance/data/db/dao/BadgeDao;", "budgetDao", "Lcom/pocketguidance/data/db/dao/BudgetDao;", "categoryDao", "Lcom/pocketguidance/data/db/dao/CategoryDao;", "goalDao", "Lcom/pocketguidance/data/db/dao/GoalDao;", "transactionDao", "Lcom/pocketguidance/data/db/dao/TransactionDao;", "userDao", "Lcom/pocketguidance/data/db/dao/UserDao;", "userPrefsDao", "Lcom/pocketguidance/data/db/dao/UserPrefsDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.pocketguidance.data.db.entities.UserEntity.class, com.pocketguidance.data.db.entities.TransactionEntity.class, com.pocketguidance.data.db.entities.BudgetEntity.class, com.pocketguidance.data.db.entities.GoalEntity.class, com.pocketguidance.data.db.entities.CategoryEntity.class, com.pocketguidance.data.db.entities.UserPrefsEntity.class, com.pocketguidance.data.db.entities.BadgeEntity.class, com.pocketguidance.data.db.entities.InvestmentEntity.class}, version = 3, exportSchema = false)
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DATABASE_NAME = "pocket_guidance.db";
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile com.pocketguidance.data.db.AppDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull()
    public static final com.pocketguidance.data.db.AppDatabase.Companion Companion = null;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.pocketguidance.data.db.dao.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.pocketguidance.data.db.dao.TransactionDao transactionDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.pocketguidance.data.db.dao.BudgetDao budgetDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.pocketguidance.data.db.dao.GoalDao goalDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.pocketguidance.data.db.dao.CategoryDao categoryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.pocketguidance.data.db.dao.UserPrefsDao userPrefsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.pocketguidance.data.db.dao.BadgeDao badgeDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/pocketguidance/data/db/AppDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "INSTANCE", "Lcom/pocketguidance/data/db/AppDatabase;", "getDatabase", "context", "Landroid/content/Context;", "getInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.pocketguidance.data.db.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.pocketguidance.data.db.AppDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}