package com.charlsgod.moviestest.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001b0\u000f2\u0006\u0010\u001c\u001a\u00020\u0015J\u0011\u0010\u001d\u001a\u00020\u001eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ%\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0019\u0010\u0012\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J#\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001b0\'0\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ#\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001b0\'0\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0019\u0010)\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0019\u0010*\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\"H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J+\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001b0\'0\u000f2\u0006\u0010,\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u001a\u0010.\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u0015H\u0002J\u0018\u0010.\u001a\u00020\t2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001bH\u0002J\u0019\u00103\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00065"}, d2 = {"Lcom/charlsgod/moviestest/repository/MovieRepository;", "", "service", "Lcom/charlsgod/moviestest/api/MoviesService;", "database", "Lcom/charlsgod/moviestest/db/MoviesDatabase;", "(Lcom/charlsgod/moviestest/api/MoviesService;Lcom/charlsgod/moviestest/db/MoviesDatabase;)V", "_isFavourite", "Landroidx/lifecycle/MutableLiveData;", "", "_movie", "Lcom/charlsgod/moviestest/model/Movie;", "databaseQuery", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "isFavourite", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "movie", "getMovie", "rateLimiter", "Lcom/charlsgod/moviestest/util/RateLimiter;", "", "getRateLimiter", "()Lcom/charlsgod/moviestest/util/RateLimiter;", "getService", "()Lcom/charlsgod/moviestest/api/MoviesService;", "getFavouriteMovies", "", "sort", "getGenresFromNetwork", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGenresNames", "ids", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPopularMovies", "Lcom/charlsgod/moviestest/util/Resource;", "getTopRatedMovies", "getTrailer", "getTrailerFromNetwork", "searchMovies", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldFetch", "trailer", "Lcom/charlsgod/moviestest/model/Trailer;", "key", "data", "update", "(Lcom/charlsgod/moviestest/model/Movie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MovieRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.charlsgod.moviestest.util.RateLimiter<java.lang.String> rateLimiter = null;
    private final androidx.lifecycle.MutableLiveData<com.charlsgod.moviestest.model.Movie> _movie = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isFavourite = null;
    private final androidx.lifecycle.MutableLiveData<androidx.sqlite.db.SimpleSQLiteQuery> databaseQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final com.charlsgod.moviestest.api.MoviesService service = null;
    private final com.charlsgod.moviestest.db.MoviesDatabase database = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.charlsgod.moviestest.util.RateLimiter<java.lang.String> getRateLimiter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.charlsgod.moviestest.model.Movie> getMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isFavourite() {
        return null;
    }
    
    /**
     * Room and network operations to get list of searched movies
     * from the network and insert to database. Use a coroutine
     * suspend functions to run in a background thread.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.charlsgod.moviestest.util.Resource<java.util.List<com.charlsgod.moviestest.model.Movie>>>> p1) {
        return null;
    }
    
    /**
     * Room and network operations to get list of top rated movies
     * from the network and insert to database. Use a coroutine
     * suspend functions to run in a background thread.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTopRatedMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.charlsgod.moviestest.util.Resource<java.util.List<com.charlsgod.moviestest.model.Movie>>>> p0) {
        return null;
    }
    
    /**
     * Room and network operations to get list of popular movies
     * from the network and insert to database. Use a coroutine
     * suspend functions to run in a background thread.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPopularMovies(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.charlsgod.moviestest.util.Resource<java.util.List<com.charlsgod.moviestest.model.Movie>>>> p0) {
        return null;
    }
    
    /**
     * Room operation. Updates value of [Movie.isFavourite].
     * Uses a coroutine suspend function to run in a background thread.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.charlsgod.moviestest.model.Movie movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    /**
     * Room query operation. Returns instance of [Movie]
     * of the given [id]. Uses a coroutine suspend function
     * to run in a background thread.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMovie(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    /**
     * Room query operation. Returns list of favourite
     * movies wrapped in LiveData. Automatically runs
     * the query asynchronously on a background thread.
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.charlsgod.moviestest.model.Movie>> getFavouriteMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String sort) {
        return null;
    }
    
    /**
     * Check whether we should fetch genre data from the network or not.
     */
    private final boolean shouldFetch(java.util.List<java.lang.String> data) {
        return false;
    }
    
    /**
     * Get movie's trailer from the database.
     * If the trailers is null get from network.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTrailer(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1) {
        return null;
    }
    
    /**
     * Check whether we should fetch trailer from the network or not.
     */
    private final boolean shouldFetch(com.charlsgod.moviestest.model.Trailer trailer, java.lang.String key) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.charlsgod.moviestest.api.MoviesService getService() {
        return null;
    }
    
    @javax.inject.Inject()
    public MovieRepository(@org.jetbrains.annotations.NotNull()
    com.charlsgod.moviestest.api.MoviesService service, @org.jetbrains.annotations.NotNull()
    com.charlsgod.moviestest.db.MoviesDatabase database) {
        super();
    }
}