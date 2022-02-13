package com.charlsgod.moviestest.ui.search;

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
public final class SearchViewModel_AssistedFactory_Factory implements Factory<SearchViewModel_AssistedFactory> {
  private final Provider<MovieRepository> repositoryProvider;

  public SearchViewModel_AssistedFactory_Factory(Provider<MovieRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SearchViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static SearchViewModel_AssistedFactory_Factory create(
      Provider<MovieRepository> repositoryProvider) {
    return new SearchViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static SearchViewModel_AssistedFactory newInstance(Provider<MovieRepository> repository) {
    return new SearchViewModel_AssistedFactory(repository);
  }
}
