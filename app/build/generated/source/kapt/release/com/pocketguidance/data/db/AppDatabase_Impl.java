package com.pocketguidance.data.db;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.pocketguidance.data.db.dao.BadgeDao;
import com.pocketguidance.data.db.dao.BadgeDao_Impl;
import com.pocketguidance.data.db.dao.BudgetDao;
import com.pocketguidance.data.db.dao.BudgetDao_Impl;
import com.pocketguidance.data.db.dao.CategoryDao;
import com.pocketguidance.data.db.dao.CategoryDao_Impl;
import com.pocketguidance.data.db.dao.GoalDao;
import com.pocketguidance.data.db.dao.GoalDao_Impl;
import com.pocketguidance.data.db.dao.TransactionDao;
import com.pocketguidance.data.db.dao.TransactionDao_Impl;
import com.pocketguidance.data.db.dao.UserDao;
import com.pocketguidance.data.db.dao.UserDao_Impl;
import com.pocketguidance.data.db.dao.UserPrefsDao;
import com.pocketguidance.data.db.dao.UserPrefsDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile UserDao _userDao;

  private volatile TransactionDao _transactionDao;

  private volatile BudgetDao _budgetDao;

  private volatile GoalDao _goalDao;

  private volatile CategoryDao _categoryDao;

  private volatile UserPrefsDao _userPrefsDao;

  private volatile BadgeDao _badgeDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(3) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `users` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `email` TEXT NOT NULL, `username` TEXT NOT NULL, `passwordHash` TEXT NOT NULL, `securityQuestion` TEXT NOT NULL, `securityAnswerHash` TEXT NOT NULL, `avatarPath` TEXT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `transactions` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` INTEGER NOT NULL, `type` TEXT NOT NULL, `amount` REAL NOT NULL, `category` TEXT NOT NULL, `description` TEXT NOT NULL, `date` TEXT NOT NULL, `receiptPhotoPath` TEXT, `createdAt` INTEGER NOT NULL, FOREIGN KEY(`userId`) REFERENCES `users`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_transactions_userId` ON `transactions` (`userId`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_transactions_date` ON `transactions` (`date`)");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_transactions_category` ON `transactions` (`category`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `budgets` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` INTEGER NOT NULL, `category` TEXT NOT NULL, `limitAmount` REAL NOT NULL, `spent` REAL NOT NULL, FOREIGN KEY(`userId`) REFERENCES `users`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_budgets_userId` ON `budgets` (`userId`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `goals` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` INTEGER NOT NULL, `name` TEXT NOT NULL, `targetAmount` REAL NOT NULL, `currentAmount` REAL NOT NULL, `deadline` TEXT NOT NULL, `frequency` TEXT NOT NULL, `completed` INTEGER NOT NULL, FOREIGN KEY(`userId`) REFERENCES `users`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_goals_userId` ON `goals` (`userId`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `categories` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` INTEGER NOT NULL, `name` TEXT NOT NULL, `isCustom` INTEGER NOT NULL, FOREIGN KEY(`userId`) REFERENCES `users`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_categories_userId` ON `categories` (`userId`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `user_prefs` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` INTEGER NOT NULL, `currency` TEXT NOT NULL, `monthlyIncome` REAL NOT NULL, `monthlyBudgetGoal` REAL NOT NULL, `minMonthlySpendingGoal` REAL NOT NULL, `maxMonthlySpendingGoal` REAL NOT NULL, `onboarded` INTEGER NOT NULL, `darkMode` INTEGER NOT NULL, FOREIGN KEY(`userId`) REFERENCES `users`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_user_prefs_userId` ON `user_prefs` (`userId`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `badges` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` INTEGER NOT NULL, `badgeType` TEXT NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `icon` TEXT NOT NULL, `dateEarned` INTEGER NOT NULL, FOREIGN KEY(`userId`) REFERENCES `users`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_badges_userId` ON `badges` (`userId`)");
        db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_badges_badgeType` ON `badges` (`badgeType`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `investments` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` INTEGER NOT NULL, `name` TEXT NOT NULL, `type` TEXT NOT NULL, `invested` REAL NOT NULL, `currentValue` REAL NOT NULL, `date` TEXT NOT NULL, FOREIGN KEY(`userId`) REFERENCES `users`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_investments_userId` ON `investments` (`userId`)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f189907816ab23dab3cfd21a4066332d')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `users`");
        db.execSQL("DROP TABLE IF EXISTS `transactions`");
        db.execSQL("DROP TABLE IF EXISTS `budgets`");
        db.execSQL("DROP TABLE IF EXISTS `goals`");
        db.execSQL("DROP TABLE IF EXISTS `categories`");
        db.execSQL("DROP TABLE IF EXISTS `user_prefs`");
        db.execSQL("DROP TABLE IF EXISTS `badges`");
        db.execSQL("DROP TABLE IF EXISTS `investments`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsUsers = new HashMap<String, TableInfo.Column>(7);
        _columnsUsers.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("username", new TableInfo.Column("username", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("passwordHash", new TableInfo.Column("passwordHash", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("securityQuestion", new TableInfo.Column("securityQuestion", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("securityAnswerHash", new TableInfo.Column("securityAnswerHash", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("avatarPath", new TableInfo.Column("avatarPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUsers = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUsers = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUsers = new TableInfo("users", _columnsUsers, _foreignKeysUsers, _indicesUsers);
        final TableInfo _existingUsers = TableInfo.read(db, "users");
        if (!_infoUsers.equals(_existingUsers)) {
          return new RoomOpenHelper.ValidationResult(false, "users(com.pocketguidance.data.db.entities.UserEntity).\n"
                  + " Expected:\n" + _infoUsers + "\n"
                  + " Found:\n" + _existingUsers);
        }
        final HashMap<String, TableInfo.Column> _columnsTransactions = new HashMap<String, TableInfo.Column>(9);
        _columnsTransactions.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactions.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactions.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactions.put("amount", new TableInfo.Column("amount", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactions.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactions.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactions.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactions.put("receiptPhotoPath", new TableInfo.Column("receiptPhotoPath", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTransactions.put("createdAt", new TableInfo.Column("createdAt", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTransactions = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysTransactions.add(new TableInfo.ForeignKey("users", "CASCADE", "NO ACTION", Arrays.asList("userId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesTransactions = new HashSet<TableInfo.Index>(3);
        _indicesTransactions.add(new TableInfo.Index("index_transactions_userId", false, Arrays.asList("userId"), Arrays.asList("ASC")));
        _indicesTransactions.add(new TableInfo.Index("index_transactions_date", false, Arrays.asList("date"), Arrays.asList("ASC")));
        _indicesTransactions.add(new TableInfo.Index("index_transactions_category", false, Arrays.asList("category"), Arrays.asList("ASC")));
        final TableInfo _infoTransactions = new TableInfo("transactions", _columnsTransactions, _foreignKeysTransactions, _indicesTransactions);
        final TableInfo _existingTransactions = TableInfo.read(db, "transactions");
        if (!_infoTransactions.equals(_existingTransactions)) {
          return new RoomOpenHelper.ValidationResult(false, "transactions(com.pocketguidance.data.db.entities.TransactionEntity).\n"
                  + " Expected:\n" + _infoTransactions + "\n"
                  + " Found:\n" + _existingTransactions);
        }
        final HashMap<String, TableInfo.Column> _columnsBudgets = new HashMap<String, TableInfo.Column>(5);
        _columnsBudgets.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgets.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgets.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgets.put("limitAmount", new TableInfo.Column("limitAmount", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBudgets.put("spent", new TableInfo.Column("spent", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBudgets = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysBudgets.add(new TableInfo.ForeignKey("users", "CASCADE", "NO ACTION", Arrays.asList("userId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesBudgets = new HashSet<TableInfo.Index>(1);
        _indicesBudgets.add(new TableInfo.Index("index_budgets_userId", false, Arrays.asList("userId"), Arrays.asList("ASC")));
        final TableInfo _infoBudgets = new TableInfo("budgets", _columnsBudgets, _foreignKeysBudgets, _indicesBudgets);
        final TableInfo _existingBudgets = TableInfo.read(db, "budgets");
        if (!_infoBudgets.equals(_existingBudgets)) {
          return new RoomOpenHelper.ValidationResult(false, "budgets(com.pocketguidance.data.db.entities.BudgetEntity).\n"
                  + " Expected:\n" + _infoBudgets + "\n"
                  + " Found:\n" + _existingBudgets);
        }
        final HashMap<String, TableInfo.Column> _columnsGoals = new HashMap<String, TableInfo.Column>(8);
        _columnsGoals.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGoals.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGoals.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGoals.put("targetAmount", new TableInfo.Column("targetAmount", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGoals.put("currentAmount", new TableInfo.Column("currentAmount", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGoals.put("deadline", new TableInfo.Column("deadline", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGoals.put("frequency", new TableInfo.Column("frequency", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGoals.put("completed", new TableInfo.Column("completed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGoals = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysGoals.add(new TableInfo.ForeignKey("users", "CASCADE", "NO ACTION", Arrays.asList("userId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesGoals = new HashSet<TableInfo.Index>(1);
        _indicesGoals.add(new TableInfo.Index("index_goals_userId", false, Arrays.asList("userId"), Arrays.asList("ASC")));
        final TableInfo _infoGoals = new TableInfo("goals", _columnsGoals, _foreignKeysGoals, _indicesGoals);
        final TableInfo _existingGoals = TableInfo.read(db, "goals");
        if (!_infoGoals.equals(_existingGoals)) {
          return new RoomOpenHelper.ValidationResult(false, "goals(com.pocketguidance.data.db.entities.GoalEntity).\n"
                  + " Expected:\n" + _infoGoals + "\n"
                  + " Found:\n" + _existingGoals);
        }
        final HashMap<String, TableInfo.Column> _columnsCategories = new HashMap<String, TableInfo.Column>(4);
        _columnsCategories.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategories.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategories.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategories.put("isCustom", new TableInfo.Column("isCustom", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCategories = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysCategories.add(new TableInfo.ForeignKey("users", "CASCADE", "NO ACTION", Arrays.asList("userId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesCategories = new HashSet<TableInfo.Index>(1);
        _indicesCategories.add(new TableInfo.Index("index_categories_userId", false, Arrays.asList("userId"), Arrays.asList("ASC")));
        final TableInfo _infoCategories = new TableInfo("categories", _columnsCategories, _foreignKeysCategories, _indicesCategories);
        final TableInfo _existingCategories = TableInfo.read(db, "categories");
        if (!_infoCategories.equals(_existingCategories)) {
          return new RoomOpenHelper.ValidationResult(false, "categories(com.pocketguidance.data.db.entities.CategoryEntity).\n"
                  + " Expected:\n" + _infoCategories + "\n"
                  + " Found:\n" + _existingCategories);
        }
        final HashMap<String, TableInfo.Column> _columnsUserPrefs = new HashMap<String, TableInfo.Column>(9);
        _columnsUserPrefs.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserPrefs.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserPrefs.put("currency", new TableInfo.Column("currency", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserPrefs.put("monthlyIncome", new TableInfo.Column("monthlyIncome", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserPrefs.put("monthlyBudgetGoal", new TableInfo.Column("monthlyBudgetGoal", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserPrefs.put("minMonthlySpendingGoal", new TableInfo.Column("minMonthlySpendingGoal", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserPrefs.put("maxMonthlySpendingGoal", new TableInfo.Column("maxMonthlySpendingGoal", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserPrefs.put("onboarded", new TableInfo.Column("onboarded", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserPrefs.put("darkMode", new TableInfo.Column("darkMode", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserPrefs = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysUserPrefs.add(new TableInfo.ForeignKey("users", "CASCADE", "NO ACTION", Arrays.asList("userId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesUserPrefs = new HashSet<TableInfo.Index>(1);
        _indicesUserPrefs.add(new TableInfo.Index("index_user_prefs_userId", true, Arrays.asList("userId"), Arrays.asList("ASC")));
        final TableInfo _infoUserPrefs = new TableInfo("user_prefs", _columnsUserPrefs, _foreignKeysUserPrefs, _indicesUserPrefs);
        final TableInfo _existingUserPrefs = TableInfo.read(db, "user_prefs");
        if (!_infoUserPrefs.equals(_existingUserPrefs)) {
          return new RoomOpenHelper.ValidationResult(false, "user_prefs(com.pocketguidance.data.db.entities.UserPrefsEntity).\n"
                  + " Expected:\n" + _infoUserPrefs + "\n"
                  + " Found:\n" + _existingUserPrefs);
        }
        final HashMap<String, TableInfo.Column> _columnsBadges = new HashMap<String, TableInfo.Column>(7);
        _columnsBadges.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBadges.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBadges.put("badgeType", new TableInfo.Column("badgeType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBadges.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBadges.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBadges.put("icon", new TableInfo.Column("icon", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBadges.put("dateEarned", new TableInfo.Column("dateEarned", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBadges = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysBadges.add(new TableInfo.ForeignKey("users", "CASCADE", "NO ACTION", Arrays.asList("userId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesBadges = new HashSet<TableInfo.Index>(2);
        _indicesBadges.add(new TableInfo.Index("index_badges_userId", false, Arrays.asList("userId"), Arrays.asList("ASC")));
        _indicesBadges.add(new TableInfo.Index("index_badges_badgeType", true, Arrays.asList("badgeType"), Arrays.asList("ASC")));
        final TableInfo _infoBadges = new TableInfo("badges", _columnsBadges, _foreignKeysBadges, _indicesBadges);
        final TableInfo _existingBadges = TableInfo.read(db, "badges");
        if (!_infoBadges.equals(_existingBadges)) {
          return new RoomOpenHelper.ValidationResult(false, "badges(com.pocketguidance.data.db.entities.BadgeEntity).\n"
                  + " Expected:\n" + _infoBadges + "\n"
                  + " Found:\n" + _existingBadges);
        }
        final HashMap<String, TableInfo.Column> _columnsInvestments = new HashMap<String, TableInfo.Column>(7);
        _columnsInvestments.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInvestments.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInvestments.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInvestments.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInvestments.put("invested", new TableInfo.Column("invested", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInvestments.put("currentValue", new TableInfo.Column("currentValue", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsInvestments.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysInvestments = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysInvestments.add(new TableInfo.ForeignKey("users", "CASCADE", "NO ACTION", Arrays.asList("userId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesInvestments = new HashSet<TableInfo.Index>(1);
        _indicesInvestments.add(new TableInfo.Index("index_investments_userId", false, Arrays.asList("userId"), Arrays.asList("ASC")));
        final TableInfo _infoInvestments = new TableInfo("investments", _columnsInvestments, _foreignKeysInvestments, _indicesInvestments);
        final TableInfo _existingInvestments = TableInfo.read(db, "investments");
        if (!_infoInvestments.equals(_existingInvestments)) {
          return new RoomOpenHelper.ValidationResult(false, "investments(com.pocketguidance.data.db.entities.InvestmentEntity).\n"
                  + " Expected:\n" + _infoInvestments + "\n"
                  + " Found:\n" + _existingInvestments);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "f189907816ab23dab3cfd21a4066332d", "073413907cbb322c4262c381febec26e");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "users","transactions","budgets","goals","categories","user_prefs","badges","investments");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    final boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `users`");
      _db.execSQL("DELETE FROM `transactions`");
      _db.execSQL("DELETE FROM `budgets`");
      _db.execSQL("DELETE FROM `goals`");
      _db.execSQL("DELETE FROM `categories`");
      _db.execSQL("DELETE FROM `user_prefs`");
      _db.execSQL("DELETE FROM `badges`");
      _db.execSQL("DELETE FROM `investments`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(UserDao.class, UserDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(TransactionDao.class, TransactionDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(BudgetDao.class, BudgetDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(GoalDao.class, GoalDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(CategoryDao.class, CategoryDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(UserPrefsDao.class, UserPrefsDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(BadgeDao.class, BadgeDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public TransactionDao transactionDao() {
    if (_transactionDao != null) {
      return _transactionDao;
    } else {
      synchronized(this) {
        if(_transactionDao == null) {
          _transactionDao = new TransactionDao_Impl(this);
        }
        return _transactionDao;
      }
    }
  }

  @Override
  public BudgetDao budgetDao() {
    if (_budgetDao != null) {
      return _budgetDao;
    } else {
      synchronized(this) {
        if(_budgetDao == null) {
          _budgetDao = new BudgetDao_Impl(this);
        }
        return _budgetDao;
      }
    }
  }

  @Override
  public GoalDao goalDao() {
    if (_goalDao != null) {
      return _goalDao;
    } else {
      synchronized(this) {
        if(_goalDao == null) {
          _goalDao = new GoalDao_Impl(this);
        }
        return _goalDao;
      }
    }
  }

  @Override
  public CategoryDao categoryDao() {
    if (_categoryDao != null) {
      return _categoryDao;
    } else {
      synchronized(this) {
        if(_categoryDao == null) {
          _categoryDao = new CategoryDao_Impl(this);
        }
        return _categoryDao;
      }
    }
  }

  @Override
  public UserPrefsDao userPrefsDao() {
    if (_userPrefsDao != null) {
      return _userPrefsDao;
    } else {
      synchronized(this) {
        if(_userPrefsDao == null) {
          _userPrefsDao = new UserPrefsDao_Impl(this);
        }
        return _userPrefsDao;
      }
    }
  }

  @Override
  public BadgeDao badgeDao() {
    if (_badgeDao != null) {
      return _badgeDao;
    } else {
      synchronized(this) {
        if(_badgeDao == null) {
          _badgeDao = new BadgeDao_Impl(this);
        }
        return _badgeDao;
      }
    }
  }
}
