package com.charlsgod.moviestest.ui.favourites;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = FavouritesViewModel.class
)
public interface FavouritesViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.charlsgod.moviestest.ui.favourites.FavouritesViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(FavouritesViewModel_AssistedFactory factory);
}
