package com.charlsgod.moviestest.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0006H\u0002J\u0012\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020(H\u0002J\f\u0010)\u001a\u00020\u0018*\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006*"}, d2 = {"Lcom/charlsgod/moviestest/ui/search/SearchFragment;", "Landroidx/fragment/app/Fragment;", "()V", "actionMode", "Landroid/view/ActionMode;", "adapter", "Lcom/charlsgod/moviestest/ui/common/MovieAdapter;", "binding", "Lcom/charlsgod/moviestest/databinding/FragmentSearchBinding;", "getBinding", "()Lcom/charlsgod/moviestest/databinding/FragmentSearchBinding;", "binding$delegate", "Lkotlin/Lazy;", "searchViewModel", "Lcom/charlsgod/moviestest/ui/search/SearchViewModel;", "getSearchViewModel", "()Lcom/charlsgod/moviestest/ui/search/SearchViewModel;", "searchViewModel$delegate", "sharedPrefs", "Landroid/content/SharedPreferences;", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "sharedPrefs$delegate", "displayContextualMenuWithDelete", "", "movie", "Lcom/charlsgod/moviestest/model/Movie;", "getSavedPrefsAndStartViewModel", "initAdapter", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "saveColumnCountToSharedPrefs", "columnCount", "", "setupToolbar", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SearchFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy searchViewModel$delegate = null;
    private com.charlsgod.moviestest.ui.common.MovieAdapter adapter;
    private android.view.ActionMode actionMode;
    private final kotlin.Lazy binding$delegate = null;
    private final kotlin.Lazy sharedPrefs$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.charlsgod.moviestest.ui.search.SearchViewModel getSearchViewModel() {
        return null;
    }
    
    private final com.charlsgod.moviestest.databinding.FragmentSearchBinding getBinding() {
        return null;
    }
    
    private final android.content.SharedPreferences getSharedPrefs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * Setup custom toolbar with NavigationIcon, which opens a drawer.
     */
    private final void setupToolbar(com.charlsgod.moviestest.databinding.FragmentSearchBinding $this$setupToolbar) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Init adapter with onClick listener.
     */
    private final com.charlsgod.moviestest.ui.common.MovieAdapter initAdapter() {
        return null;
    }
    
    /**
     * Returns last saved column count. Ensures that's
     * properly initialized with the default value
     * when this method is called for the first time.
     *
     * Updates ViewModel so it triggers setting of
     * recyclerview's span count via BindingAdapter.
     */
    private final void getSavedPrefsAndStartViewModel() {
    }
    
    /**
     * Invoked when the changes on the [SearchViewModel.columnCount] observed.
     * Saves a new column count to the shared preferences.
     */
    private final void saveColumnCountToSharedPrefs(int columnCount) {
    }
    
    /**
     * Invoked when the changes on the [SearchViewModel.contextualMenuEvent] observed.
     * Displays contextual menu with an option to delete.
     */
    private final void displayContextualMenuWithDelete(com.charlsgod.moviestest.model.Movie movie) {
    }
    
    public SearchFragment() {
        super();
    }
}