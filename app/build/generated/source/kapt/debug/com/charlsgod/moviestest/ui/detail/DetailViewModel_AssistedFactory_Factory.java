package com.charlsgod.moviestest.ui.detail;

import com.charlsgod.moviestest.repository.MovieRepository;
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
public final class DetailViewModel_AssistedFactory_Factory implements Factory<DetailViewModel_AssistedFactory> {
  private final Provider<MovieRepository> repositoryProvider;

  public DetailViewModel_AssistedFactory_Factory(Provider<MovieRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public DetailViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static DetailViewModel_AssistedFactory_Factory create(
      Provider<MovieRepository> repositoryProvider) {
    return new DetailViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static DetailViewModel_AssistedFactory newInstance(Provider<MovieRepository> repository) {
    return new DetailViewModel_AssistedFactory(repository);
  }
}
