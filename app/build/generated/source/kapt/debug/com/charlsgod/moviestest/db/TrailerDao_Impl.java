package com.charlsgod.moviestest.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.charlsgod.moviestest.model.Trailer;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class TrailerDao_Impl implements TrailerDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Trailer> __insertionAdapterOfTrailer;

  public TrailerDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTrailer = new EntityInsertionAdapter<Trailer>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `movie_trailer` (`movie_id`,`trailer_url`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Trailer value) {
        stmt.bindLong(1, value.getMovieId());
        if (value.getUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUrl());
        }
      }
    };
  }

  @Override
  public Object insert(final Trailer trailer, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfTrailer.insert(trailer);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getTrailer(final int id, final Continuation<? super Trailer> p1) {
    final String _sql = "SELECT * FROM movie_trailer WHERE movie_id= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Trailer>() {
      @Override
      public Trailer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfMovieId = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_id");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "trailer_url");
          final Trailer _result;
          if(_cursor.moveToFirst()) {
            final int _tmpMovieId;
            _tmpMovieId = _cursor.getInt(_cursorIndexOfMovieId);
            final String _tmpUrl;
            _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            _result = new Trailer(_tmpMovieId,_tmpUrl);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }
}
