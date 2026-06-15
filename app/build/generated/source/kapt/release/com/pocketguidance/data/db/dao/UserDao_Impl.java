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
import com.pocketguidance.data.db.entities.UserEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
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

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UserEntity> __insertionAdapterOfUserEntity;

  private final EntityDeletionOrUpdateAdapter<UserEntity> __updateAdapterOfUserEntity;

  private final SharedSQLiteStatement __preparedStmtOfUpdateAvatar;

  private final SharedSQLiteStatement __preparedStmtOfUpdateUsername;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePassword;

  private final SharedSQLiteStatement __preparedStmtOfUpdateSecurityQuestion;

  public UserDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUserEntity = new EntityInsertionAdapter<UserEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `users` (`id`,`email`,`username`,`passwordHash`,`securityQuestion`,`securityAnswerHash`,`avatarPath`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final UserEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getEmail() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getEmail());
        }
        if (entity.getUsername() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getUsername());
        }
        if (entity.getPasswordHash() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getPasswordHash());
        }
        if (entity.getSecurityQuestion() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getSecurityQuestion());
        }
        if (entity.getSecurityAnswerHash() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getSecurityAnswerHash());
        }
        if (entity.getAvatarPath() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getAvatarPath());
        }
      }
    };
    this.__updateAdapterOfUserEntity = new EntityDeletionOrUpdateAdapter<UserEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `users` SET `id` = ?,`email` = ?,`username` = ?,`passwordHash` = ?,`securityQuestion` = ?,`securityAnswerHash` = ?,`avatarPath` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final UserEntity entity) {
        statement.bindLong(1, entity.getId());
        if (entity.getEmail() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getEmail());
        }
        if (entity.getUsername() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getUsername());
        }
        if (entity.getPasswordHash() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getPasswordHash());
        }
        if (entity.getSecurityQuestion() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getSecurityQuestion());
        }
        if (entity.getSecurityAnswerHash() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getSecurityAnswerHash());
        }
        if (entity.getAvatarPath() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getAvatarPath());
        }
        statement.bindLong(8, entity.getId());
      }
    };
    this.__preparedStmtOfUpdateAvatar = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE users SET avatarPath = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateUsername = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE users SET username = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdatePassword = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE users SET passwordHash = ? WHERE email = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateSecurityQuestion = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE users SET securityQuestion = ?, securityAnswerHash = ? WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final UserEntity user, final Continuation<? super Long> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      @NonNull
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          final Long _result = __insertionAdapterOfUserEntity.insertAndReturnId(user);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object update(final UserEntity user, final Continuation<? super Integer> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        int _total = 0;
        __db.beginTransaction();
        try {
          _total += __updateAdapterOfUserEntity.handle(user);
          __db.setTransactionSuccessful();
          return _total;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateAvatar(final long userId, final String path,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateAvatar.acquire();
        int _argIndex = 1;
        if (path == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, path);
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
          __preparedStmtOfUpdateAvatar.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateUsername(final long userId, final String username,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateUsername.acquire();
        int _argIndex = 1;
        if (username == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, username);
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
          __preparedStmtOfUpdateUsername.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updatePassword(final String email, final String newHash,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePassword.acquire();
        int _argIndex = 1;
        if (newHash == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, newHash);
        }
        _argIndex = 2;
        if (email == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, email);
        }
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
          __preparedStmtOfUpdatePassword.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateSecurityQuestion(final long userId, final String question,
      final String answerHash, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateSecurityQuestion.acquire();
        int _argIndex = 1;
        if (question == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, question);
        }
        _argIndex = 2;
        if (answerHash == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, answerHash);
        }
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
          __preparedStmtOfUpdateSecurityQuestion.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object findByEmail(final String email,
      final Continuation<? super UserEntity> $completion) {
    final String _sql = "SELECT * FROM users WHERE email = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (email == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, email);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<UserEntity>() {
      @Override
      @Nullable
      public UserEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfPasswordHash = CursorUtil.getColumnIndexOrThrow(_cursor, "passwordHash");
          final int _cursorIndexOfSecurityQuestion = CursorUtil.getColumnIndexOrThrow(_cursor, "securityQuestion");
          final int _cursorIndexOfSecurityAnswerHash = CursorUtil.getColumnIndexOrThrow(_cursor, "securityAnswerHash");
          final int _cursorIndexOfAvatarPath = CursorUtil.getColumnIndexOrThrow(_cursor, "avatarPath");
          final UserEntity _result;
          if (_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpEmail;
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _tmpEmail = null;
            } else {
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            }
            final String _tmpUsername;
            if (_cursor.isNull(_cursorIndexOfUsername)) {
              _tmpUsername = null;
            } else {
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            }
            final String _tmpPasswordHash;
            if (_cursor.isNull(_cursorIndexOfPasswordHash)) {
              _tmpPasswordHash = null;
            } else {
              _tmpPasswordHash = _cursor.getString(_cursorIndexOfPasswordHash);
            }
            final String _tmpSecurityQuestion;
            if (_cursor.isNull(_cursorIndexOfSecurityQuestion)) {
              _tmpSecurityQuestion = null;
            } else {
              _tmpSecurityQuestion = _cursor.getString(_cursorIndexOfSecurityQuestion);
            }
            final String _tmpSecurityAnswerHash;
            if (_cursor.isNull(_cursorIndexOfSecurityAnswerHash)) {
              _tmpSecurityAnswerHash = null;
            } else {
              _tmpSecurityAnswerHash = _cursor.getString(_cursorIndexOfSecurityAnswerHash);
            }
            final String _tmpAvatarPath;
            if (_cursor.isNull(_cursorIndexOfAvatarPath)) {
              _tmpAvatarPath = null;
            } else {
              _tmpAvatarPath = _cursor.getString(_cursorIndexOfAvatarPath);
            }
            _result = new UserEntity(_tmpId,_tmpEmail,_tmpUsername,_tmpPasswordHash,_tmpSecurityQuestion,_tmpSecurityAnswerHash,_tmpAvatarPath);
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

  @Override
  public Object findById(final long id, final Continuation<? super UserEntity> $completion) {
    final String _sql = "SELECT * FROM users WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<UserEntity>() {
      @Override
      @Nullable
      public UserEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfPasswordHash = CursorUtil.getColumnIndexOrThrow(_cursor, "passwordHash");
          final int _cursorIndexOfSecurityQuestion = CursorUtil.getColumnIndexOrThrow(_cursor, "securityQuestion");
          final int _cursorIndexOfSecurityAnswerHash = CursorUtil.getColumnIndexOrThrow(_cursor, "securityAnswerHash");
          final int _cursorIndexOfAvatarPath = CursorUtil.getColumnIndexOrThrow(_cursor, "avatarPath");
          final UserEntity _result;
          if (_cursor.moveToFirst()) {
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpEmail;
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _tmpEmail = null;
            } else {
              _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            }
            final String _tmpUsername;
            if (_cursor.isNull(_cursorIndexOfUsername)) {
              _tmpUsername = null;
            } else {
              _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            }
            final String _tmpPasswordHash;
            if (_cursor.isNull(_cursorIndexOfPasswordHash)) {
              _tmpPasswordHash = null;
            } else {
              _tmpPasswordHash = _cursor.getString(_cursorIndexOfPasswordHash);
            }
            final String _tmpSecurityQuestion;
            if (_cursor.isNull(_cursorIndexOfSecurityQuestion)) {
              _tmpSecurityQuestion = null;
            } else {
              _tmpSecurityQuestion = _cursor.getString(_cursorIndexOfSecurityQuestion);
            }
            final String _tmpSecurityAnswerHash;
            if (_cursor.isNull(_cursorIndexOfSecurityAnswerHash)) {
              _tmpSecurityAnswerHash = null;
            } else {
              _tmpSecurityAnswerHash = _cursor.getString(_cursorIndexOfSecurityAnswerHash);
            }
            final String _tmpAvatarPath;
            if (_cursor.isNull(_cursorIndexOfAvatarPath)) {
              _tmpAvatarPath = null;
            } else {
              _tmpAvatarPath = _cursor.getString(_cursorIndexOfAvatarPath);
            }
            _result = new UserEntity(_tmpId,_tmpEmail,_tmpUsername,_tmpPasswordHash,_tmpSecurityQuestion,_tmpSecurityAnswerHash,_tmpAvatarPath);
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
