package com.pocketguidance.data.db.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.pocketguidance.data.db.entities.UserPrefsEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class UserPrefsDao_Impl implements UserPrefsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserPrefsEntity> __insertionAdapterOfUserPrefsEntity;

  private final SharedSQLiteStatement __preparedStmtOfUpdateMonthlyIncome;

  private final SharedSQLiteStatement __preparedStmtOfUpdateBudgetGoal;

  private final SharedSQLiteStatement __preparedStmtOfUpdateSpendingGoals;

  private final SharedSQLiteStatement __preparedStmtOfUpdateCurrency;

  private final SharedSQLiteStatement __preparedStmtOfUpdateDarkMode;

  private final SharedSQLiteStatement __preparedStmtOfMarkOnboarded;

  public UserPrefsDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserPrefsEntity = new EntityInsertionAdapter<UserPrefsEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `user_prefs` (`id`,`userId`,`currency`,`monthlyIncome`,`monthlyBudgetGoal`,`minMonthlySpendingGoal`,`maxMonthlySpendingGoal`,`onboarded`,`darkMode`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final UserPrefsEntity entity) {
        statement.bindLong(1, entity.getId());
        statement.bindLong(2, entity.getUserId());
        if (entity.getCurrency() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getCurrency());
        }
        statement.bindDouble(4, entity.getMonthlyIncome());
        statement.bindDouble(5, entity.getMonthlyBudgetGoal());
        statement.bindDouble(6, entity.getMinMonthlySpendingGoal());
        statement.bindDouble(7, entity.getMaxMonthlySpendingGoal());
        final int _tmp = entity.getOnboarded() ? 1 : 0;
        statement.bindLong(8, _tmp);
        final int _tmp_1 = entity.getDarkMode() ? 1 : 0;
        statement.bindLong(9, _tmp_1);
      }
    };
    this.__preparedStmtOfUpdateMonthlyIncome = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE user_prefs SET monthlyIncome = ? WHERE userId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateBudgetGoal = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE user_prefs SET monthlyBudgetGoal = ? WHERE userId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateSpendingGoals = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE user_prefs SET minMonthlySpendingGoal = ?, maxMonthlySpendingGoal = ? WHERE userId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateCurrency = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE user_prefs SET currency = ? WHERE userId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateDarkMode = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE user_prefs SET darkMode = ? WHERE userId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfMarkOnboarded = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE user_prefs SET onboarded = 1 WHERE userId = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final UserPrefsEntity prefs, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUserPrefsEntity.insert(prefs);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateMonthlyIncome(final long userId, final double income,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateMonthlyIncome.acquire();
        int _argIndex = 1;
        _stmt.bindDouble(_argIndex, income);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, userId);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateMonthlyIncome.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateBudgetGoal(final long userId, final double goal,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateBudgetGoal.acquire();
        int _argIndex = 1;
        _stmt.bindDouble(_argIndex, goal);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, userId);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateBudgetGoal.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateSpendingGoals(final long userId, final double min, final double max,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateSpendingGoals.acquire();
        int _argIndex = 1;
        _stmt.bindDouble(_argIndex, min);
        _argIndex = 2;
        _stmt.bindDouble(_argIndex, max);
        _argIndex = 3;
        _stmt.bindLong(_argIndex, userId);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateSpendingGoals.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateCurrency(final long userId, final String currency,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateCurrency.acquire();
        int _argIndex = 1;
        if (currency == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, currency);
        }
        _argIndex = 2;
        _stmt.bindLong(_argIndex, userId);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateCurrency.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateDarkMode(final long userId, final boolean dark,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateDarkMode.acquire();
        int _argIndex = 1;
        final int _tmp = dark ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, userId);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateDarkMode.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object markOnboarded(final long userId, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfMarkOnboarded.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, userId);
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfMarkOnboarded.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<UserPrefsEntity> getForUser(final long userId) {
    final String _sql = "SELECT * FROM user_prefs WHERE userId = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userId);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"user_prefs"}, new Callable<UserPrefsEntity>() {
      @Override
      @Nullable
      public UserPrefsEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "currency");
          final int _cursorIndexOfMonthlyIncome = CursorUtil.getColumnIndexOrThrow(_cursor, "monthlyIncome");
          final int _cursorIndexOfMonthlyBudgetGoal = CursorUtil.getColumnIndexOrThrow(_cursor, "monthlyBudgetGoal");
          final int _cursorIndexOfMinMonthlySpendingGoal = CursorUtil.getColumnIndexOrThrow(_cursor, "minMonthlySpendingGoal");
          final int _cursorIndexOfMaxMonthlySpendingGoal = CursorUtil.getColumnIndexOrThrow(_cursor, "maxMonthlySpendingGoal");
          final int _cursorIndexOfOnboarded = CursorUtil.getColumnIndexOrThrow(_cursor, "onboarded");
          final int _cursorIndexOfDarkMode = CursorUtil.getColumnIndexOrThrow(_cursor, "darkMode");
          final UserPrefsEntity _result;
          if (_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final long _tmpUserId;
            _tmpUserId = _cursor.getLong(_cursorIndexOfUserId);
            final String _tmpCurrency;
            if (_cursor.isNull(_cursorIndexOfCurrency)) {
              _tmpCurrency = null;
            } else {
              _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
            }
            final double _tmpMonthlyIncome;
            _tmpMonthlyIncome = _cursor.getDouble(_cursorIndexOfMonthlyIncome);
            final double _tmpMonthlyBudgetGoal;
            _tmpMonthlyBudgetGoal = _cursor.getDouble(_cursorIndexOfMonthlyBudgetGoal);
            final double _tmpMinMonthlySpendingGoal;
            _tmpMinMonthlySpendingGoal = _cursor.getDouble(_cursorIndexOfMinMonthlySpendingGoal);
            final double _tmpMaxMonthlySpendingGoal;
            _tmpMaxMonthlySpendingGoal = _cursor.getDouble(_cursorIndexOfMaxMonthlySpendingGoal);
            final boolean _tmpOnboarded;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfOnboarded);
            _tmpOnboarded = _tmp != 0;
            final boolean _tmpDarkMode;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfDarkMode);
            _tmpDarkMode = _tmp_1 != 0;
            _result = new UserPrefsEntity(_tmpId,_tmpUserId,_tmpCurrency,_tmpMonthlyIncome,_tmpMonthlyBudgetGoal,_tmpMinMonthlySpendingGoal,_tmpMaxMonthlySpendingGoal,_tmpOnboarded,_tmpDarkMode);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getForUserOnce(final long userId,
      final Continuation<? super UserPrefsEntity> $completion) {
    final String _sql = "SELECT * FROM user_prefs WHERE userId = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<UserPrefsEntity>() {
      @Override
      @Nullable
      public UserPrefsEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "currency");
          final int _cursorIndexOfMonthlyIncome = CursorUtil.getColumnIndexOrThrow(_cursor, "monthlyIncome");
          final int _cursorIndexOfMonthlyBudgetGoal = CursorUtil.getColumnIndexOrThrow(_cursor, "monthlyBudgetGoal");
          final int _cursorIndexOfMinMonthlySpendingGoal = CursorUtil.getColumnIndexOrThrow(_cursor, "minMonthlySpendingGoal");
          final int _cursorIndexOfMaxMonthlySpendingGoal = CursorUtil.getColumnIndexOrThrow(_cursor, "maxMonthlySpendingGoal");
          final int _cursorIndexOfOnboarded = CursorUtil.getColumnIndexOrThrow(_cursor, "onboarded");
          final int _cursorIndexOfDarkMode = CursorUtil.getColumnIndexOrThrow(_cursor, "darkMode");
          final UserPrefsEntity _result;
          if (_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final long _tmpUserId;
            _tmpUserId = _cursor.getLong(_cursorIndexOfUserId);
            final String _tmpCurrency;
            if (_cursor.isNull(_cursorIndexOfCurrency)) {
              _tmpCurrency = null;
            } else {
              _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
            }
            final double _tmpMonthlyIncome;
            _tmpMonthlyIncome = _cursor.getDouble(_cursorIndexOfMonthlyIncome);
            final double _tmpMonthlyBudgetGoal;
            _tmpMonthlyBudgetGoal = _cursor.getDouble(_cursorIndexOfMonthlyBudgetGoal);
            final double _tmpMinMonthlySpendingGoal;
            _tmpMinMonthlySpendingGoal = _cursor.getDouble(_cursorIndexOfMinMonthlySpendingGoal);
            final double _tmpMaxMonthlySpendingGoal;
            _tmpMaxMonthlySpendingGoal = _cursor.getDouble(_cursorIndexOfMaxMonthlySpendingGoal);
            final boolean _tmpOnboarded;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfOnboarded);
            _tmpOnboarded = _tmp != 0;
            final boolean _tmpDarkMode;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfDarkMode);
            _tmpDarkMode = _tmp_1 != 0;
            _result = new UserPrefsEntity(_tmpId,_tmpUserId,_tmpCurrency,_tmpMonthlyIncome,_tmpMonthlyBudgetGoal,_tmpMinMonthlySpendingGoal,_tmpMaxMonthlySpendingGoal,_tmpOnboarded,_tmpDarkMode);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
