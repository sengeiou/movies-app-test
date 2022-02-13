package com.charlsgod.moviestest.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MoviesDatabase_Impl extends MoviesDatabase {
  private volatile MovieDao _movieDao;

  private volatile GenreDao _genreDao;

  private volatile TrailerDao _trailerDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `movies_table` (`movie_id` INTEGER NOT NULL, `movie_title` TEXT, `movie_overview` TEXT, `movie_rating` REAL, `movie_poster_url` TEXT, `movie_language` TEXT, `movie_release_date` TEXT, `movie_popularity` REAL, `movie_genres` TEXT, `is_favourite` INTEGER NOT NULL, `saved_date` INTEGER, `genre_names` TEXT, `movie_trailer` TEXT NOT NULL, PRIMARY KEY(`movie_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `genres_table` (`genre_id` INTEGER NOT NULL, `genre_name` TEXT, PRIMARY KEY(`genre_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `movie_trailer` (`movie_id` INTEGER NOT NULL, `trailer_url` TEXT NOT NULL, PRIMARY KEY(`movie_id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '98afe4d9438bf767cf3288fcbc327d6c')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `movies_table`");
        _db.execSQL("DROP TABLE IF EXISTS `genres_table`");
        _db.execSQL("DROP TABLE IF EXISTS `movie_trailer`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMoviesTable = new HashMap<String, TableInfo.Column>(13);
        _columnsMoviesTable.put("movie_id", new TableInfo.Column("movie_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("movie_title", new TableInfo.Column("movie_title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("movie_overview", new TableInfo.Column("movie_overview", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("movie_rating", new TableInfo.Column("movie_rating", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("movie_poster_url", new TableInfo.Column("movie_poster_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("movie_language", new TableInfo.Column("movie_language", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("movie_release_date", new TableInfo.Column("movie_release_date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("movie_popularity", new TableInfo.Column("movie_popularity", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("movie_genres", new TableInfo.Column("movie_genres", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("is_favourite", new TableInfo.Column("is_favourite", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("saved_date", new TableInfo.Column("saved_date", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("genre_names", new TableInfo.Column("genre_names", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("movie_trailer", new TableInfo.Column("movie_trailer", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMoviesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMoviesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMoviesTable = new TableInfo("movies_table", _columnsMoviesTable, _foreignKeysMoviesTable, _indicesMoviesTable);
        final TableInfo _existingMoviesTable = TableInfo.read(_db, "movies_table");
        if (! _infoMoviesTable.equals(_existingMoviesTable)) {
          return new RoomOpenHelper.ValidationResult(false, "movies_table(com.charlsgod.moviestest.model.Movie).\n"
                  + " Expected:\n" + _infoMoviesTable + "\n"
                  + " Found:\n" + _existingMoviesTable);
        }
        final HashMap<String, TableInfo.Column> _columnsGenresTable = new HashMap<String, TableInfo.Column>(2);
        _columnsGenresTable.put("genre_id", new TableInfo.Column("genre_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGenresTable.put("genre_name", new TableInfo.Column("genre_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGenresTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGenresTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGenresTable = new TableInfo("genres_table", _columnsGenresTable, _foreignKeysGenresTable, _indicesGenresTable);
        final TableInfo _existingGenresTable = TableInfo.read(_db, "genres_table");
        if (! _infoGenresTable.equals(_existingGenresTable)) {
          return new RoomOpenHelper.ValidationResult(false, "genres_table(com.charlsgod.moviestest.model.Genre).\n"
                  + " Expected:\n" + _infoGenresTable + "\n"
                  + " Found:\n" + _existingGenresTable);
        }
        final HashMap<String, TableInfo.Column> _columnsMovieTrailer = new HashMap<String, TableInfo.Column>(2);
        _columnsMovieTrailer.put("movie_id", new TableInfo.Column("movie_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMovieTrailer.put("trailer_url", new TableInfo.Column("trailer_url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMovieTrailer = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMovieTrailer = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMovieTrailer = new TableInfo("movie_trailer", _columnsMovieTrailer, _foreignKeysMovieTrailer, _indicesMovieTrailer);
        final TableInfo _existingMovieTrailer = TableInfo.read(_db, "movie_trailer");
        if (! _infoMovieTrailer.equals(_existingMovieTrailer)) {
          return new RoomOpenHelper.ValidationResult(false, "movie_trailer(com.charlsgod.moviestest.model.Trailer).\n"
                  + " Expected:\n" + _infoMovieTrailer + "\n"
                  + " Found:\n" + _existingMovieTrailer);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "98afe4d9438bf767cf3288fcbc327d6c", "d2f99b94f3a7f580e961ec2084d0398f");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "movies_table","genres_table","movie_trailer");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `movies_table`");
      _db.execSQL("DELETE FROM `genres_table`");
      _db.execSQL("DELETE FROM `movie_trailer`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public MovieDao getMovieDao() {
    if (_movieDao != null) {
      return _movieDao;
    } else {
      synchronized(this) {
        if(_movieDao == null) {
          _movieDao = new MovieDao_Impl(this);
        }
        return _movieDao;
      }
    }
  }

  @Override
  public GenreDao getGenreDao() {
    if (_genreDao != null) {
      return _genreDao;
    } else {
      synchronized(this) {
        if(_genreDao == null) {
          _genreDao = new GenreDao_Impl(this);
        }
        return _genreDao;
      }
    }
  }

  @Override
  public TrailerDao getTrailerDao() {
    if (_trailerDao != null) {
      return _trailerDao;
    } else {
      synchronized(this) {
        if(_trailerDao == null) {
          _trailerDao = new TrailerDao_Impl(this);
        }
        return _trailerDao;
      }
    }
  }
}
