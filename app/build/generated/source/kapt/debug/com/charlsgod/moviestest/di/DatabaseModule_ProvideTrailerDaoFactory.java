package com.charlsgod.moviestest.di;

import com.charlsgod.moviestest.db.MoviesDatabase;
import com.charlsgod.moviestest.db.TrailerDao;
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
public final class DatabaseModule_ProvideTrailerDaoFactory implements Factory<TrailerDao> {
  private final Provider<MoviesDatabase> dbProvider;

  public DatabaseModule_ProvideTrailerDaoFactory(Provider<MoviesDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public TrailerDao get() {
    return provideTrailerDao(dbProvider.get());
  }

  public static DatabaseModule_ProvideTrailerDaoFactory create(
      Provider<MoviesDatabase> dbProvider) {
    return new DatabaseModule_ProvideTrailerDaoFactory(dbProvider);
  }

  public static TrailerDao provideTrailerDao(MoviesDatabase db) {
    return Preconditions.checkNotNull(DatabaseModule.INSTANCE.provideTrailerDao(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
