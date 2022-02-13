package com.charlsgod.moviestest.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0014J\u0006\u0010\u0018\u001a\u00020\u0014J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lcom/charlsgod/moviestest/ui/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/charlsgod/moviestest/repository/MovieRepository;", "(Lcom/charlsgod/moviestest/repository/MovieRepository;)V", "_showTrailerEvent", "Landroidx/lifecycle/MutableLiveData;", "Lcom/charlsgod/moviestest/util/SingleEvent;", "", "isFavourite", "Landroidx/lifecycle/LiveData;", "", "()Landroidx/lifecycle/LiveData;", "movie", "Lcom/charlsgod/moviestest/model/Movie;", "getMovie", "getRepository", "()Lcom/charlsgod/moviestest/repository/MovieRepository;", "showTrailerEvent", "getShowTrailerEvent", "", "id", "", "onTrailerClicked", "setFavorite", "update", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.charlsgod.moviestest.model.Movie> movie = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isFavourite = null;
    private final androidx.lifecycle.MutableLiveData<com.charlsgod.moviestest.util.SingleEvent<java.lang.String>> _showTrailerEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.charlsgod.moviestest.util.SingleEvent<java.lang.String>> showTrailerEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final com.charlsgod.moviestest.repository.MovieRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.charlsgod.moviestest.model.Movie> getMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isFavourite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.charlsgod.moviestest.util.SingleEvent<java.lang.String>> getShowTrailerEvent() {
        return null;
    }
    
    /**
     * Init selected movie via repository.
     */
    public final void getMovie(int id) {
    }
    
    /**
     * Executes once add_remove_action ImageButton is clicked.
     *
     * Triggers changes of the [Movie.isFavourite]to the
     * database via update() and sets the appropriate icon of the
     * add_remove_action ImageButton via BindingAdapter.
     */
    public final void setFavorite() {
    }
    
    /**
     * Executes once trailer Button is clicked.
     * Triggers navigation to the movie trailer.
     */
    public final void onTrailerClicked() {
    }
    
    /**
     * Helper method to update the changes
     * to the Movie via repository.
     */
    private final void update(com.charlsgod.moviestest.model.Movie movie) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.charlsgod.moviestest.repository.MovieRepository getRepository() {
        return null;
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.charlsgod.moviestest.repository.MovieRepository repository) {
        super();
    }
}