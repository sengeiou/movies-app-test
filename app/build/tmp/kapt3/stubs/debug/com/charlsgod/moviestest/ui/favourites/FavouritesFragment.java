package com.charlsgod.moviestest.ui.favourites;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0002J\u0012\u0010\u001e\u001a\u00020\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J$\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010\'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020)H\u0002J\u0012\u0010*\u001a\u00020\u00182\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\f\u0010-\u001a\u00020\u0018*\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006."}, d2 = {"Lcom/charlsgod/moviestest/ui/favourites/FavouritesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "actionMode", "Landroid/view/ActionMode;", "binding", "Lcom/charlsgod/moviestest/databinding/FragmentFavouritesBinding;", "getBinding", "()Lcom/charlsgod/moviestest/databinding/FragmentFavouritesBinding;", "binding$delegate", "Lkotlin/Lazy;", "favouritesViewModel", "Lcom/charlsgod/moviestest/ui/favourites/FavouritesViewModel;", "getFavouritesViewModel", "()Lcom/charlsgod/moviestest/ui/favourites/FavouritesViewModel;", "favouritesViewModel$delegate", "homeAdapter", "Lcom/charlsgod/moviestest/ui/common/MovieAdapter;", "sharedPrefs", "Landroid/content/SharedPreferences;", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "sharedPrefs$delegate", "displayContextualMenuWithDelete", "", "movie", "Lcom/charlsgod/moviestest/model/Movie;", "displaySnackBarWithUndoRemove", "getSavedPrefsAndStartViewModel", "initAdapter", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "saveColumnCountToSharedPrefs", "columnCount", "", "saveSortToSharedPrefs", "sort", "", "setupToolbar", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FavouritesFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy favouritesViewModel$delegate = null;
    private final kotlin.Lazy binding$delegate = null;
    private final kotlin.Lazy sharedPrefs$delegate = null;
    private com.charlsgod.moviestest.ui.common.MovieAdapter homeAdapter;
    private android.view.ActionMode actionMode;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.charlsgod.moviestest.ui.favourites.FavouritesViewModel getFavouritesViewModel() {
        return null;
    }
    
    private final com.charlsgod.moviestest.databinding.FragmentFavouritesBinding getBinding() {
        return null;
    }
    
    private final android.content.SharedPreferences getSharedPrefs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Returns last set sort type and column count.
     * Ensures that's properly initialized with the default value
     * when this method is called for the first time.
     */
    private final void getSavedPrefsAndStartViewModel() {
    }
    
    /**
     * Init adapter with onClick and onLongClick listeners.
     */
    private final com.charlsgod.moviestest.ui.common.MovieAdapter initAdapter() {
        return null;
    }
    
    private final void setupToolbar(com.charlsgod.moviestest.databinding.FragmentFavouritesBinding $this$setupToolbar) {
    }
    
    /**
     * Invoked when the changes on the [FavouritesViewModel.contextualMenuEvent] observed.
     * Displays contextual menu with an option to delete.
     */
    private final void displayContextualMenuWithDelete(com.charlsgod.moviestest.model.Movie movie) {
    }
    
    /**
     * Invoked when the changes on the [FavouritesViewModel.snackBarEvent] observed.
     * Displays a SnackBar with an option to undo delete.
     */
    private final void displaySnackBarWithUndoRemove(com.charlsgod.moviestest.model.Movie movie) {
    }
    
    /**
     * Invoked when the changes on the [FavouritesViewModel.sortType] observed.
     * Saves a new sort to the shared preferences.
     */
    private final void saveSortToSharedPrefs(java.lang.String sort) {
    }
    
    /**
     * Invoked when the changes on the [FavouritesViewModel.columnCount] observed.
     * Saves a new column count to the shared preferences.
     */
    private final void saveColumnCountToSharedPrefs(int columnCount) {
    }
    
    public FavouritesFragment() {
        super();
    }
}