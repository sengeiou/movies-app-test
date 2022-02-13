package com.charlsgod.moviestest.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%H\u0002J\f\u0010&\u001a\u00020\u001a*\u00020\nH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\'"}, d2 = {"Lcom/charlsgod/moviestest/ui/detail/DetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lcom/charlsgod/moviestest/ui/detail/DetailFragmentArgs;", "getArgs", "()Lcom/charlsgod/moviestest/ui/detail/DetailFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/charlsgod/moviestest/databinding/FragmentDetailBinding;", "getBinding", "()Lcom/charlsgod/moviestest/databinding/FragmentDetailBinding;", "binding$delegate", "Lkotlin/Lazy;", "detailViewModel", "Lcom/charlsgod/moviestest/ui/detail/DetailViewModel;", "getDetailViewModel", "()Lcom/charlsgod/moviestest/ui/detail/DetailViewModel;", "detailViewModel$delegate", "movie", "Lcom/charlsgod/moviestest/model/Movie;", "getMovie", "()Lcom/charlsgod/moviestest/model/Movie;", "movie$delegate", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "showMovieTrailer", "url", "", "setupToolbar", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class DetailFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy binding$delegate = null;
    private final kotlin.Lazy detailViewModel$delegate = null;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy movie$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.charlsgod.moviestest.databinding.FragmentDetailBinding getBinding() {
        return null;
    }
    
    private final com.charlsgod.moviestest.ui.detail.DetailViewModel getDetailViewModel() {
        return null;
    }
    
    private final com.charlsgod.moviestest.ui.detail.DetailFragmentArgs getArgs() {
        return null;
    }
    
    private final com.charlsgod.moviestest.model.Movie getMovie() {
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
    
    private final void setupToolbar(com.charlsgod.moviestest.databinding.FragmentDetailBinding $this$setupToolbar) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Invoked when the changes on the
     * [DetailViewModel.showTrailerEvent] observed.
     *
     * Opens the movie trial on YouTube.
     */
    private final void showMovieTrailer(java.lang.String url) {
    }
    
    public DetailFragment() {
        super();
    }
}