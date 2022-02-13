package com.charlsgod.moviestest.api

import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MoviesService {
    @GET("search/movie")
    fun getMoviesAsync(
        @Query("query") title: String
    ): Deferred<MovieResponse>

    @GET("movie/top_rated")
    fun getTopRatedMoviesAsync(): Deferred<MovieResponse>

    @GET("movie/popular")
    fun getPopularMoviesAsync(): Deferred<MovieResponse>


    @GET("genre/movie/list")
    fun getGenresAsync(): Deferred<GenreSearchResponse>


    @GET("movie/{movie_id}/videos")
    fun getTrailerAsync(
        @Path("movie_id") id: Int
    ): Deferred<TrailerSearchResponse>
}