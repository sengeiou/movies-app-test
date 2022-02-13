package com.charlsgod.moviestest.di;

import com.charlsgod.moviestest.api.MoviesService;
import com.charlsgod.moviestest.db.MoviesDatabase;
import com.charlsgod.moviestest.repository.MovieRepository;
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
public final class RepoModule_ProvideRepositoryFactory implements Factory<MovieRepository> {
  private final Provider<MoviesService> serviceProvider;

  private final Provider<MoviesDatabase> dbProvider;

  public RepoModule_ProvideRepositoryFactory(Provider<MoviesService> serviceProvider,
      Provider<MoviesDatabase> dbProvider) {
    this.serviceProvider = serviceProvider;
    this.dbProvider = dbProvider;
  }

  @Override
  public MovieRepository get() {
    return provideRepository(serviceProvider.get(), dbProvider.get());
  }

  public static RepoModule_ProvideRepositoryFactory create(Provider<MoviesService> serviceProvider,
      Provider<MoviesDatabase> dbProvider) {
    return new RepoModule_ProvideRepositoryFactory(serviceProvider, dbProvider);
  }

  public static MovieRepository provideRepository(MoviesService service, MoviesDatabase db) {
    return Preconditions.checkNotNull(RepoModule.INSTANCE.provideRepository(service, db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
