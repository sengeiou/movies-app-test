package com.charlsgod.moviestest.di;

import android.app.Application;
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
public final class DatabaseModule_ProvideDatabaseFactory implements Factory<MoviesDatabase> {
  private final Provider<Application> appProvider;

  public DatabaseModule_ProvideDatabaseFactory(Provider<Application> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public MoviesDatabase get() {
    return provideDatabase(appProvider.get());
  }

  public static DatabaseModule_ProvideDatabaseFactory create(Provider<Application> appProvider) {
    return new DatabaseModule_ProvideDatabaseFactory(appProvider);
  }

  public static MoviesDatabase provideDatabase(Application app) {
    return Preconditions.checkNotNull(DatabaseModule.INSTANCE.provideDatabase(app), "Cannot return null from a non-@Nullable @Provides method");
  }
}
