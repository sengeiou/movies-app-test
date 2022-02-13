package com.charlsgod.moviestest.repository;

import com.charlsgod.moviestest.api.MoviesService;
import com.charlsgod.moviestest.db.MoviesDatabase;
import dagger.internal.Factory;
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
public final class MovieRepository_Factory implements Factory<MovieRepository> {
  private final Provider<MoviesService> serviceProvider;

  private final Provider<MoviesDatabase> databaseProvider;

  public MovieRepository_Factory(Provider<MoviesService> serviceProvider,
      Provider<MoviesDatabase> databaseProvider) {
    this.serviceProvider = serviceProvider;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public MovieRepository get() {
    return newInstance(serviceProvider.get(), databaseProvider.get());
  }

  public static MovieRepository_Factory create(Provider<MoviesService> serviceProvider,
      Provider<MoviesDatabase> databaseProvider) {
    return new MovieRepository_Factory(serviceProvider, databaseProvider);
  }

  public static MovieRepository newInstance(MoviesService service, MoviesDatabase database) {
    return new MovieRepository(service, database);
  }
}
