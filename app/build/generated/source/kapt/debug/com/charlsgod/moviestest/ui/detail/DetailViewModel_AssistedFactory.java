package com.charlsgod.moviestest.ui.detail;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.charlsgod.moviestest.repository.MovieRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class DetailViewModel_AssistedFactory implements ViewModelAssistedFactory<DetailViewModel> {
  private final Provider<MovieRepository> repository;

  @Inject
  DetailViewModel_AssistedFactory(Provider<MovieRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public DetailViewModel create(SavedStateHandle arg0) {
    return new DetailViewModel(repository.get());
  }
}
