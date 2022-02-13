package com.charlsgod.moviestest.di;

import com.charlsgod.moviestest.db.MovieDao;
import com.charlsgod.moviestest.db.MoviesDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideMovieDaoFactory implements Factory<MovieDao> {
  private final Provider<MoviesDatabase> dbProvider;

  public DatabaseModule_ProvideMovieDaoFactory(Provider<MoviesDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public MovieDao get() {
    return provideMovieDao(dbProvider.get());
  }

  public static DatabaseModule_ProvideMovieDaoFactory create(Provider<MoviesDatabase> dbProvider) {
    return new DatabaseModule_ProvideMovieDaoFactory(dbProvider);
  }

  public static MovieDao provideMovieDao(MoviesDatabase db) {
    return Preconditions.checkNotNull(DatabaseModule.INSTANCE.provideMovieDao(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
