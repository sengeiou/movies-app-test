package com.charlsgod.moviestest.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.charlsgod.moviestest.model.Movie;
import com.charlsgod.moviestest.util.GenreConverter;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MovieDao_Impl implements MovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Movie> __insertionAdapterOfMovie;

  private final GenreConverter __genreConverter = new GenreConverter();

  private final EntityDeletionOrUpdateAdapter<Movie> __updateAdapterOfMovie;

  public MovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMovie = new EntityInsertionAdapter<Movie>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `movies_table` (`movie_id`,`movie_title`,`movie_overview`,`movie_rating`,`movie_poster_url`,`movie_language`,`movie_release_date`,`movie_popularity`,`movie_genres`,`is_favourite`,`saved_date`,`genre_names`,`movie_trailer`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Movie value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getOverview());
        }
        if (value.getRating() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindDouble(4, value.getRating());
        }
        if (value.getPosterUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPosterUrl());
        }
        if (value.getLanguage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getLanguage());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getReleaseDate());
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindDouble(8, value.getPopularity());
        }
        final String _tmp;
        _tmp = __genreConverter.genreListToString(value.getGenreIds());
        if (_tmp == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp);
        }
        final int _tmp_1;
        _tmp_1 = value.isFavourite() ? 1 : 0;
        stmt.bindLong(10, _tmp_1);
        if (value.getSaveDate() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, value.getSaveDate());
        }
        final String _tmp_2;
        _tmp_2 = __genreConverter.genreNameListToString(value.getGenreNames());
        if (_tmp_2 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, _tmp_2);
        }
        if (value.getTrailerUrl() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getTrailerUrl());
        }
      }
    };
    this.__updateAdapterOfMovie = new EntityDeletionOrUpdateAdapter<Movie>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `movies_table` SET `movie_id` = ?,`movie_title` = ?,`movie_overview` = ?,`movie_rating` = ?,`movie_poster_url` = ?,`movie_language` = ?,`movie_release_date` = ?,`movie_popularity` = ?,`movie_genres` = ?,`is_favourite` = ?,`saved_date` = ?,`genre_names` = ?,`movie_trailer` = ? WHERE `movie_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Movie value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getOverview() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getOverview());
        }
        if (value.getRating() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindDouble(4, value.getRating());
        }
        if (value.getPosterUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPosterUrl());
        }
        if (value.getLanguage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getLanguage());
        }
        if (value.getReleaseDate() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getReleaseDate());
        }
        if (value.getPopularity() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindDouble(8, value.getPopularity());
        }
        final String _tmp;
        _tmp = __genreConverter.genreListToString(value.getGenreIds());
        if (_tmp == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp);
        }
        final int _tmp_1;
        _tmp_1 = value.isFavourite() ? 1 : 0;
        stmt.bindLong(10, _tmp_1);
        if (value.getSaveDate() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, value.getSaveDate());
        }
        final String _tmp_2;
        _tmp_2 = __genreConverter.genreNameListToString(value.getGenreNames());
        if (_tmp_2 == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, _tmp_2);
        }
        if (value.getTrailerUrl() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getTrailerUrl());
        }
        stmt.bindLong(14, value.getId());
      }
    };
  }

  @Override
  public Object insert(final List<Movie> list, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMovie.insert(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final Movie movie, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfMovie.handle(movie);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getMovies(final String query, final Continuation<? super List<Movie>> p1) {
    final String _sql = "SELECT * FROM movies_table WHERE movie_title LIKE '%' || ? || '%' ORDER BY movie_popularity DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (query == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, query);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Movie>>() {
      @Override
      public List<Movie> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_title");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_overview");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_rating");
          final int _cursorIndexOfPosterUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_poster_url");
          final int _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_language");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_release_date");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_popularity");
          final int _cursorIndexOfGenreIds = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_genres");
          final int _cursorIndexOfIsFavourite = CursorUtil.getColumnIndexOrThrow(_cursor, "is_favourite");
          final int _cursorIndexOfSaveDate = CursorUtil.getColumnIndexOrThrow(_cursor, "saved_date");
          final int _cursorIndexOfGenreNames = CursorUtil.getColumnIndexOrThrow(_cursor, "genre_names");
          final int _cursorIndexOfTrailerUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_trailer");
          final List<Movie> _result = new ArrayList<Movie>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Movie _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final Double _tmpRating;
            if (_cursor.isNull(_cursorIndexOfRating)) {
              _tmpRating = null;
            } else {
              _tmpRating = _cursor.getDouble(_cursorIndexOfRating);
            }
            final String _tmpPosterUrl;
            _tmpPosterUrl = _cursor.getString(_cursorIndexOfPosterUrl);
            final String _tmpLanguage;
            _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            final Double _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            }
            final List<Integer> _tmpGenreIds;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfGenreIds);
            _tmpGenreIds = __genreConverter.stringToGenreList(_tmp);
            final boolean _tmpIsFavourite;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsFavourite);
            _tmpIsFavourite = _tmp_1 != 0;
            final Long _tmpSaveDate;
            if (_cursor.isNull(_cursorIndexOfSaveDate)) {
              _tmpSaveDate = null;
            } else {
              _tmpSaveDate = _cursor.getLong(_cursorIndexOfSaveDate);
            }
            final List<String> _tmpGenreNames;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfGenreNames);
            _tmpGenreNames = __genreConverter.stringToGenreNameList(_tmp_2);
            final String _tmpTrailerUrl;
            _tmpTrailerUrl = _cursor.getString(_cursorIndexOfTrailerUrl);
            _item = new Movie(_tmpId,_tmpTitle,_tmpOverview,_tmpRating,_tmpPosterUrl,_tmpLanguage,_tmpReleaseDate,_tmpPopularity,_tmpGenreIds,_tmpIsFavourite,_tmpSaveDate,_tmpGenreNames,_tmpTrailerUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Object getTopRatedMovies(final Continuation<? super List<Movie>> p0) {
    final String _sql = "SELECT * FROM movies_table ORDER BY movie_rating DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Movie>>() {
      @Override
      public List<Movie> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_title");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_overview");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_rating");
          final int _cursorIndexOfPosterUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_poster_url");
          final int _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_language");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_release_date");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_popularity");
          final int _cursorIndexOfGenreIds = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_genres");
          final int _cursorIndexOfIsFavourite = CursorUtil.getColumnIndexOrThrow(_cursor, "is_favourite");
          final int _cursorIndexOfSaveDate = CursorUtil.getColumnIndexOrThrow(_cursor, "saved_date");
          final int _cursorIndexOfGenreNames = CursorUtil.getColumnIndexOrThrow(_cursor, "genre_names");
          final int _cursorIndexOfTrailerUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_trailer");
          final List<Movie> _result = new ArrayList<Movie>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Movie _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final Double _tmpRating;
            if (_cursor.isNull(_cursorIndexOfRating)) {
              _tmpRating = null;
            } else {
              _tmpRating = _cursor.getDouble(_cursorIndexOfRating);
            }
            final String _tmpPosterUrl;
            _tmpPosterUrl = _cursor.getString(_cursorIndexOfPosterUrl);
            final String _tmpLanguage;
            _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            final Double _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            }
            final List<Integer> _tmpGenreIds;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfGenreIds);
            _tmpGenreIds = __genreConverter.stringToGenreList(_tmp);
            final boolean _tmpIsFavourite;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsFavourite);
            _tmpIsFavourite = _tmp_1 != 0;
            final Long _tmpSaveDate;
            if (_cursor.isNull(_cursorIndexOfSaveDate)) {
              _tmpSaveDate = null;
            } else {
              _tmpSaveDate = _cursor.getLong(_cursorIndexOfSaveDate);
            }
            final List<String> _tmpGenreNames;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfGenreNames);
            _tmpGenreNames = __genreConverter.stringToGenreNameList(_tmp_2);
            final String _tmpTrailerUrl;
            _tmpTrailerUrl = _cursor.getString(_cursorIndexOfTrailerUrl);
            _item = new Movie(_tmpId,_tmpTitle,_tmpOverview,_tmpRating,_tmpPosterUrl,_tmpLanguage,_tmpReleaseDate,_tmpPopularity,_tmpGenreIds,_tmpIsFavourite,_tmpSaveDate,_tmpGenreNames,_tmpTrailerUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getPopularMovies(final Continuation<? super List<Movie>> p0) {
    final String _sql = "SELECT * FROM movies_table ORDER BY movie_popularity DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Movie>>() {
      @Override
      public List<Movie> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_title");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_overview");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_rating");
          final int _cursorIndexOfPosterUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_poster_url");
          final int _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_language");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_release_date");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_popularity");
          final int _cursorIndexOfGenreIds = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_genres");
          final int _cursorIndexOfIsFavourite = CursorUtil.getColumnIndexOrThrow(_cursor, "is_favourite");
          final int _cursorIndexOfSaveDate = CursorUtil.getColumnIndexOrThrow(_cursor, "saved_date");
          final int _cursorIndexOfGenreNames = CursorUtil.getColumnIndexOrThrow(_cursor, "genre_names");
          final int _cursorIndexOfTrailerUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_trailer");
          final List<Movie> _result = new ArrayList<Movie>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Movie _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final Double _tmpRating;
            if (_cursor.isNull(_cursorIndexOfRating)) {
              _tmpRating = null;
            } else {
              _tmpRating = _cursor.getDouble(_cursorIndexOfRating);
            }
            final String _tmpPosterUrl;
            _tmpPosterUrl = _cursor.getString(_cursorIndexOfPosterUrl);
            final String _tmpLanguage;
            _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            final Double _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            }
            final List<Integer> _tmpGenreIds;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfGenreIds);
            _tmpGenreIds = __genreConverter.stringToGenreList(_tmp);
            final boolean _tmpIsFavourite;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsFavourite);
            _tmpIsFavourite = _tmp_1 != 0;
            final Long _tmpSaveDate;
            if (_cursor.isNull(_cursorIndexOfSaveDate)) {
              _tmpSaveDate = null;
            } else {
              _tmpSaveDate = _cursor.getLong(_cursorIndexOfSaveDate);
            }
            final List<String> _tmpGenreNames;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfGenreNames);
            _tmpGenreNames = __genreConverter.stringToGenreNameList(_tmp_2);
            final String _tmpTrailerUrl;
            _tmpTrailerUrl = _cursor.getString(_cursorIndexOfTrailerUrl);
            _item = new Movie(_tmpId,_tmpTitle,_tmpOverview,_tmpRating,_tmpPosterUrl,_tmpLanguage,_tmpReleaseDate,_tmpPopularity,_tmpGenreIds,_tmpIsFavourite,_tmpSaveDate,_tmpGenreNames,_tmpTrailerUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getMovie(final int id, final Continuation<? super Movie> p1) {
    final String _sql = "SELECT * FROM movies_table WHERE movie_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Movie>() {
      @Override
      public Movie call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_title");
          final int _cursorIndexOfOverview = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_overview");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_rating");
          final int _cursorIndexOfPosterUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_poster_url");
          final int _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_language");
          final int _cursorIndexOfReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_release_date");
          final int _cursorIndexOfPopularity = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_popularity");
          final int _cursorIndexOfGenreIds = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_genres");
          final int _cursorIndexOfIsFavourite = CursorUtil.getColumnIndexOrThrow(_cursor, "is_favourite");
          final int _cursorIndexOfSaveDate = CursorUtil.getColumnIndexOrThrow(_cursor, "saved_date");
          final int _cursorIndexOfGenreNames = CursorUtil.getColumnIndexOrThrow(_cursor, "genre_names");
          final int _cursorIndexOfTrailerUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "movie_trailer");
          final Movie _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpOverview;
            _tmpOverview = _cursor.getString(_cursorIndexOfOverview);
            final Double _tmpRating;
            if (_cursor.isNull(_cursorIndexOfRating)) {
              _tmpRating = null;
            } else {
              _tmpRating = _cursor.getDouble(_cursorIndexOfRating);
            }
            final String _tmpPosterUrl;
            _tmpPosterUrl = _cursor.getString(_cursorIndexOfPosterUrl);
            final String _tmpLanguage;
            _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
            final String _tmpReleaseDate;
            _tmpReleaseDate = _cursor.getString(_cursorIndexOfReleaseDate);
            final Double _tmpPopularity;
            if (_cursor.isNull(_cursorIndexOfPopularity)) {
              _tmpPopularity = null;
            } else {
              _tmpPopularity = _cursor.getDouble(_cursorIndexOfPopularity);
            }
            final List<Integer> _tmpGenreIds;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfGenreIds);
            _tmpGenreIds = __genreConverter.stringToGenreList(_tmp);
            final boolean _tmpIsFavourite;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsFavourite);
            _tmpIsFavourite = _tmp_1 != 0;
            final Long _tmpSaveDate;
            if (_cursor.isNull(_cursorIndexOfSaveDate)) {
              _tmpSaveDate = null;
            } else {
              _tmpSaveDate = _cursor.getLong(_cursorIndexOfSaveDate);
            }
            final List<String> _tmpGenreNames;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfGenreNames);
            _tmpGenreNames = __genreConverter.stringToGenreNameList(_tmp_2);
            final String _tmpTrailerUrl;
            _tmpTrailerUrl = _cursor.getString(_cursorIndexOfTrailerUrl);
            _result = new Movie(_tmpId,_tmpTitle,_tmpOverview,_tmpRating,_tmpPosterUrl,_tmpLanguage,_tmpReleaseDate,_tmpPopularity,_tmpGenreIds,_tmpIsFavourite,_tmpSaveDate,_tmpGenreNames,_tmpTrailerUrl);
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

  @Override
  public LiveData<List<Movie>> getFavouriteMovies(final SupportSQLiteQuery query) {
    final SupportSQLiteQuery _internalQuery = query;
    return __db.getInvalidationTracker().createLiveData(new String[]{"movies_table"}, false, new Callable<List<Movie>>() {
      @Override
      public List<Movie> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _internalQuery, false, null);
        try {
          final List<Movie> _result = new ArrayList<Movie>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Movie _item;
            _item = __entityCursorConverter_comCharlsgodMoviestestModelMovie(_cursor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }
    });
  }

  private Movie __entityCursorConverter_comCharlsgodMoviestestModelMovie(Cursor cursor) {
    final Movie _entity;
    final int _cursorIndexOfId = cursor.getColumnIndex("movie_id");
    final int _cursorIndexOfTitle = cursor.getColumnIndex("movie_title");
    final int _cursorIndexOfOverview = cursor.getColumnIndex("movie_overview");
    final int _cursorIndexOfRating = cursor.getColumnIndex("movie_rating");
    final int _cursorIndexOfPosterUrl = cursor.getColumnIndex("movie_poster_url");
    final int _cursorIndexOfLanguage = cursor.getColumnIndex("movie_language");
    final int _cursorIndexOfReleaseDate = cursor.getColumnIndex("movie_release_date");
    final int _cursorIndexOfPopularity = cursor.getColumnIndex("movie_popularity");
    final int _cursorIndexOfGenreIds = cursor.getColumnIndex("movie_genres");
    final int _cursorIndexOfIsFavourite = cursor.getColumnIndex("is_favourite");
    final int _cursorIndexOfSaveDate = cursor.getColumnIndex("saved_date");
    final int _cursorIndexOfGenreNames = cursor.getColumnIndex("genre_names");
    final int _cursorIndexOfTrailerUrl = cursor.getColumnIndex("movie_trailer");
    final int _tmpId;
    if (_cursorIndexOfId == -1) {
      _tmpId = 0;
    } else {
      _tmpId = cursor.getInt(_cursorIndexOfId);
    }
    final String _tmpTitle;
    if (_cursorIndexOfTitle == -1) {
      _tmpTitle = null;
    } else {
      _tmpTitle = cursor.getString(_cursorIndexOfTitle);
    }
    final String _tmpOverview;
    if (_cursorIndexOfOverview == -1) {
      _tmpOverview = null;
    } else {
      _tmpOverview = cursor.getString(_cursorIndexOfOverview);
    }
    final Double _tmpRating;
    if (_cursorIndexOfRating == -1) {
      _tmpRating = null;
    } else {
      if (cursor.isNull(_cursorIndexOfRating)) {
        _tmpRating = null;
      } else {
        _tmpRating = cursor.getDouble(_cursorIndexOfRating);
      }
    }
    final String _tmpPosterUrl;
    if (_cursorIndexOfPosterUrl == -1) {
      _tmpPosterUrl = null;
    } else {
      _tmpPosterUrl = cursor.getString(_cursorIndexOfPosterUrl);
    }
    final String _tmpLanguage;
    if (_cursorIndexOfLanguage == -1) {
      _tmpLanguage = null;
    } else {
      _tmpLanguage = cursor.getString(_cursorIndexOfLanguage);
    }
    final String _tmpReleaseDate;
    if (_cursorIndexOfReleaseDate == -1) {
      _tmpReleaseDate = null;
    } else {
      _tmpReleaseDate = cursor.getString(_cursorIndexOfReleaseDate);
    }
    final Double _tmpPopularity;
    if (_cursorIndexOfPopularity == -1) {
      _tmpPopularity = null;
    } else {
      if (cursor.isNull(_cursorIndexOfPopularity)) {
        _tmpPopularity = null;
      } else {
        _tmpPopularity = cursor.getDouble(_cursorIndexOfPopularity);
      }
    }
    final List<Integer> _tmpGenreIds;
    if (_cursorIndexOfGenreIds == -1) {
      _tmpGenreIds = null;
    } else {
      final String _tmp;
      _tmp = cursor.getString(_cursorIndexOfGenreIds);
      _tmpGenreIds = __genreConverter.stringToGenreList(_tmp);
    }
    final boolean _tmpIsFavourite;
    if (_cursorIndexOfIsFavourite == -1) {
      _tmpIsFavourite = false;
    } else {
      final int _tmp_1;
      _tmp_1 = cursor.getInt(_cursorIndexOfIsFavourite);
      _tmpIsFavourite = _tmp_1 != 0;
    }
    final Long _tmpSaveDate;
    if (_cursorIndexOfSaveDate == -1) {
      _tmpSaveDate = null;
    } else {
      if (cursor.isNull(_cursorIndexOfSaveDate)) {
        _tmpSaveDate = null;
      } else {
        _tmpSaveDate = cursor.getLong(_cursorIndexOfSaveDate);
      }
    }
    final List<String> _tmpGenreNames;
    if (_cursorIndexOfGenreNames == -1) {
      _tmpGenreNames = null;
    } else {
      final String _tmp_2;
      _tmp_2 = cursor.getString(_cursorIndexOfGenreNames);
      _tmpGenreNames = __genreConverter.stringToGenreNameList(_tmp_2);
    }
    final String _tmpTrailerUrl;
    if (_cursorIndexOfTrailerUrl == -1) {
      _tmpTrailerUrl = null;
    } else {
      _tmpTrailerUrl = cursor.getString(_cursorIndexOfTrailerUrl);
    }
    _entity = new Movie(_tmpId,_tmpTitle,_tmpOverview,_tmpRating,_tmpPosterUrl,_tmpLanguage,_tmpReleaseDate,_tmpPopularity,_tmpGenreIds,_tmpIsFavourite,_tmpSaveDate,_tmpGenreNames,_tmpTrailerUrl);
    return _entity;
  }
}
