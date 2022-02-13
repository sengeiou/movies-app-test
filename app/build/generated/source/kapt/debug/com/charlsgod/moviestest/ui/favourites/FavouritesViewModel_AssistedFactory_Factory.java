package com.charlsgod.moviestest.ui.favourites;

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
public final class FavouritesViewModel_AssistedFactory_Factory implements Factory<FavouritesViewModel_AssistedFactory> {
  private final Provider<MovieRepository> repositoryProvider;

  public FavouritesViewModel_AssistedFactory_Factory(Provider<MovieRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public FavouritesViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static FavouritesViewModel_AssistedFactory_Factory create(
      Provider<MovieRepository> repositoryProvider) {
    return new FavouritesViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static FavouritesViewModel_AssistedFactory newInstance(
      Provider<MovieRepository> repository) {
    return new FavouritesViewModel_AssistedFactory(repository);
  }
}
