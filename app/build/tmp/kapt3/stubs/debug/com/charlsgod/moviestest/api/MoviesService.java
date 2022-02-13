package com.charlsgod.moviestest.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/charlsgod/moviestest/api/MoviesService;", "", "getGenresAsync", "Lkotlinx/coroutines/Deferred;", "Lcom/charlsgod/moviestest/api/GenreSearchResponse;", "getMoviesAsync", "Lcom/charlsgod/moviestest/api/MovieResponse;", "title", "", "getPopularMoviesAsync", "getTopRatedMoviesAsync", "getTrailerAsync", "Lcom/charlsgod/moviestest/api/TrailerSearchResponse;", "id", "", "app_debug"})
public abstract interface MoviesService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/movie")
    public abstract kotlinx.coroutines.Deferred<com.charlsgod.moviestest.api.MovieResponse> getMoviesAsync(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String title);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/top_rated")
    public abstract kotlinx.coroutines.Deferred<com.charlsgod.moviestest.api.MovieResponse> getTopRatedMoviesAsync();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/popular")
    public abstract kotlinx.coroutines.Deferred<com.charlsgod.moviestest.api.MovieResponse> getPopularMoviesAsync();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "genre/movie/list")
    public abstract kotlinx.coroutines.Deferred<com.charlsgod.moviestest.api.GenreSearchResponse> getGenresAsync();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{movie_id}/videos")
    public abstract kotlinx.coroutines.Deferred<com.charlsgod.moviestest.api.TrailerSearchResponse> getTrailerAsync(@retrofit2.http.Path(value = "movie_id")
    int id);
}