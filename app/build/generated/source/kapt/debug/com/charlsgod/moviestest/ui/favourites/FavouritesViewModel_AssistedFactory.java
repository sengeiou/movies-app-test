package com.charlsgod.moviestest.ui.favourites;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.charlsgod.moviestest.repository.MovieRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class FavouritesViewModel_AssistedFactory implements ViewModelAssistedFactory<FavouritesViewModel> {
  private final Provider<MovieRepository> repository;

  @Inject
  FavouritesViewModel_AssistedFactory(Provider<MovieRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public FavouritesViewModel create(SavedStateHandle arg0) {
    return new FavouritesViewModel(repository.get());
  }
}
