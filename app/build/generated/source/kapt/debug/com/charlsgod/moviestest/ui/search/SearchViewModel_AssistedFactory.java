package com.charlsgod.moviestest.ui.search;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.charlsgod.moviestest.repository.MovieRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class SearchViewModel_AssistedFactory implements ViewModelAssistedFactory<SearchViewModel> {
  private final Provider<MovieRepository> repository;

  @Inject
  SearchViewModel_AssistedFactory(Provider<MovieRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public SearchViewModel create(SavedStateHandle arg0) {
    return new SearchViewModel(repository.get());
  }
}
