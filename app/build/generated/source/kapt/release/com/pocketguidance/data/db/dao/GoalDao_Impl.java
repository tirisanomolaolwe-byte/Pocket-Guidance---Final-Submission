package com.pocketguidance.data.db.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.pocketguidance.data.db.entities.GoalEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class GoalDao_Impl implements GoalDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GoalEntity> __insertionAdapterOfGoalEntity;

  private final EntityDeletionOrUpdateAdapter<GoalEntity> __deletionAdapterOfGoalEntity;

  private final EntityDeletionOrUpdateAdapter<GoalEntity> __updateAdapterOfGoalEntity;

  private final SharedSQLiteStatement __preparedStmtOfAddContribution;

  public GoalDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGoalEntity = new EntityInsertionAdapter<GoalEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `goals` (`id`,`userId`,`name`,`targetAmount`,`currentAmount`,`deadline`,`frequency`,`completed`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final GoalEntity entity) {
        statement.bindLong(1, entity.getId());
        statement.bindLong(2, entity.getUserId());
        if (entity.getName() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getName());
        }
        statement.bindDouble(4, entity.getTargetAmount());
        statement.bindDouble(5, entity.getCurrentAmount());
        if (entity.getDeadline() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getDeadline());
        }
        if (entity.getFrequency() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getFrequency());
        }
        final int _tmp = entity.getCompleted() ? 1 : 0;
        statement.bindLong(8, _tmp);
      }
    };
    this.__deletionAdapterOfGoalEntity = new EntityDeletionOrUpdateAdapter<GoalEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `goals` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final GoalEntity entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfGoalEntity = new EntityDeletionOrUpdateAdapter<GoalEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `goals` SET `id` = ?,`userId` = ?,`name` = ?,`targetAmount` = ?,`currentAmount` = ?,`deadline` = ?,`frequency` = ?,`completed` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final GoalEntity entity) {
        statement.bindLong(1, entity.getId());
        statement.bindLong(2, entity.getUserId());
        if (entity.getName() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getName());
        }
        statement.bindDouble(4, entity.getTargetAmount());
        statement.bindDouble(5, entity.getCurrentAmount());
        if (entity.getDeadline() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getDeadline());
        }
        if (entity.getFrequency() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getFrequency());
        }
        final int _tmp = entity.getCompleted() ? 1 : 0;
        statement.bindLong(8, _tmp);
        statement.bindLong(9, entity.getId());
      }
    };
    this.__preparedStmtOfAddContribution = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "\n"
                + "        UPDATE goals \n"
                + "        SET currentAmount = currentAmount + ?,\n"
                + "            completed = CASE WHEN currentAmount + ? >= targetAmount THEN 1 ELSE 0 END\n"
                + "        WHERE id = ?\n"
                + "    ";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final GoalEntity goal, final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfGoalEntity.insertAndReturnId(goal);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object delete(final GoalEntity goal, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfGoalEntity.handle(goal);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final GoalEntity goal, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfGoalEntity.handle(goal);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object addContribution(final long goalId, final double amount,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfAddContribution.acquire();
        int _argIndex = 1;
        _stmt.bindDouble(_argIndex, amount);
        _argIndex = 2;
        _stmt.bindDouble(_argIndex, amount);
        _argIndex = 3;
        _stmt.bindLong(_argIndex, goalId);
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
          __preparedStmtOfAddContribution.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<GoalEntity>> getAllForUser(final long userId) {
    final String _sql = "SELECT * FROM goals WHERE userId = ? ORDER BY completed ASC, deadline ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userId);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"goals"}, new Callable<List<GoalEntity>>() {
      @Override
      @NonNull
      public List<GoalEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTargetAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "targetAmount");
          final int _cursorIndexOfCurrentAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "currentAmount");
          final int _cursorIndexOfDeadline = CursorUtil.getColumnIndexOrThrow(_cursor, "deadline");
          final int _cursorIndexOfFrequency = CursorUtil.getColumnIndexOrThrow(_cursor, "frequency");
          final int _cursorIndexOfCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "completed");
          final List<GoalEntity> _result = new ArrayList<GoalEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final GoalEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final long _tmpUserId;
            _tmpUserId = _cursor.getLong(_cursorIndexOfUserId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final double _tmpTargetAmount;
            _tmpTargetAmount = _cursor.getDouble(_cursorIndexOfTargetAmount);
            final double _tmpCurrentAmount;
            _tmpCurrentAmount = _cursor.getDouble(_cursorIndexOfCurrentAmount);
            final String _tmpDeadline;
            if (_cursor.isNull(_cursorIndexOfDeadline)) {
              _tmpDeadline = null;
            } else {
              _tmpDeadline = _cursor.getString(_cursorIndexOfDeadline);
            }
            final String _tmpFrequency;
            if (_cursor.isNull(_cursorIndexOfFrequency)) {
              _tmpFrequency = null;
            } else {
              _tmpFrequency = _cursor.getString(_cursorIndexOfFrequency);
            }
            final boolean _tmpCompleted;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCompleted);
            _tmpCompleted = _tmp != 0;
            _item = new GoalEntity(_tmpId,_tmpUserId,_tmpName,_tmpTargetAmount,_tmpCurrentAmount,_tmpDeadline,_tmpFrequency,_tmpCompleted);
            _result.add(_item);
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
  public Object getAllOnce(final long userId,
      final Continuation<? super List<GoalEntity>> $completion) {
    final String _sql = "SELECT * FROM goals WHERE userId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userId);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<GoalEntity>>() {
      @Override
      @NonNull
      public List<GoalEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTargetAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "targetAmount");
          final int _cursorIndexOfCurrentAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "currentAmount");
          final int _cursorIndexOfDeadline = CursorUtil.getColumnIndexOrThrow(_cursor, "deadline");
          final int _cursorIndexOfFrequency = CursorUtil.getColumnIndexOrThrow(_cursor, "frequency");
          final int _cursorIndexOfCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "completed");
          final List<GoalEntity> _result = new ArrayList<GoalEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final GoalEntity _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final long _tmpUserId;
            _tmpUserId = _cursor.getLong(_cursorIndexOfUserId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final double _tmpTargetAmount;
            _tmpTargetAmount = _cursor.getDouble(_cursorIndexOfTargetAmount);
            final double _tmpCurrentAmount;
            _tmpCurrentAmount = _cursor.getDouble(_cursorIndexOfCurrentAmount);
            final String _tmpDeadline;
            if (_cursor.isNull(_cursorIndexOfDeadline)) {
              _tmpDeadline = null;
            } else {
              _tmpDeadline = _cursor.getString(_cursorIndexOfDeadline);
            }
            final String _tmpFrequency;
            if (_cursor.isNull(_cursorIndexOfFrequency)) {
              _tmpFrequency = null;
            } else {
              _tmpFrequency = _cursor.getString(_cursorIndexOfFrequency);
            }
            final boolean _tmpCompleted;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCompleted);
            _tmpCompleted = _tmp != 0;
            _item = new GoalEntity(_tmpId,_tmpUserId,_tmpName,_tmpTargetAmount,_tmpCurrentAmount,_tmpDeadline,_tmpFrequency,_tmpCompleted);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object findById(final long id, final Continuation<? super GoalEntity> $completion) {
    final String _sql = "SELECT * FROM goals WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<GoalEntity>() {
      @Override
      @Nullable
      public GoalEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfTargetAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "targetAmount");
          final int _cursorIndexOfCurrentAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "currentAmount");
          final int _cursorIndexOfDeadline = CursorUtil.getColumnIndexOrThrow(_cursor, "deadline");
          final int _cursorIndexOfFrequency = CursorUtil.getColumnIndexOrThrow(_cursor, "frequency");
          final int _cursorIndexOfCompleted = CursorUtil.getColumnIndexOrThrow(_cursor, "completed");
          final GoalEntity _result;
          if (_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final long _tmpUserId;
            _tmpUserId = _cursor.getLong(_cursorIndexOfUserId);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final double _tmpTargetAmount;
            _tmpTargetAmount = _cursor.getDouble(_cursorIndexOfTargetAmount);
            final double _tmpCurrentAmount;
            _tmpCurrentAmount = _cursor.getDouble(_cursorIndexOfCurrentAmount);
            final String _tmpDeadline;
            if (_cursor.isNull(_cursorIndexOfDeadline)) {
              _tmpDeadline = null;
            } else {
              _tmpDeadline = _cursor.getString(_cursorIndexOfDeadline);
            }
            final String _tmpFrequency;
            if (_cursor.isNull(_cursorIndexOfFrequency)) {
              _tmpFrequency = null;
            } else {
              _tmpFrequency = _cursor.getString(_cursorIndexOfFrequency);
            }
            final boolean _tmpCompleted;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCompleted);
            _tmpCompleted = _tmp != 0;
            _result = new GoalEntity(_tmpId,_tmpUserId,_tmpName,_tmpTargetAmount,_tmpCurrentAmount,_tmpDeadline,_tmpFrequency,_tmpCompleted);
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
