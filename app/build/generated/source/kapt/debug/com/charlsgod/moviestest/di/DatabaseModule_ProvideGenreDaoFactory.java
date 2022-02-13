package com.charlsgod.moviestest.di;

import com.charlsgod.moviestest.db.GenreDao;
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
public final class DatabaseModule_ProvideGenreDaoFactory implements Factory<GenreDao> {
  private final Provider<MoviesDatabase> dbProvider;

  public DatabaseModule_ProvideGenreDaoFactory(Provider<MoviesDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public GenreDao get() {
    return provideGenreDao(dbProvider.get());
  }

  public static DatabaseModule_ProvideGenreDaoFactory create(Provider<MoviesDatabase> dbProvider) {
    return new DatabaseModule_ProvideGenreDaoFactory(dbProvider);
  }

  public static GenreDao provideGenreDao(MoviesDatabase db) {
    return Preconditions.checkNotNull(DatabaseModule.INSTANCE.provideGenreDao(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
