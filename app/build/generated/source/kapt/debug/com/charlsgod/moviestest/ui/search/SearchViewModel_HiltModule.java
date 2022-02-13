package com.charlsgod.moviestest.ui.search;

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
    topLevelClass = SearchViewModel.class
)
public interface SearchViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.charlsgod.moviestest.ui.search.SearchViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(SearchViewModel_AssistedFactory factory);
}
