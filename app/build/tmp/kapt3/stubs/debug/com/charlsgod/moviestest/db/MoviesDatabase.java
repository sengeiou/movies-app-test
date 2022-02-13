package com.charlsgod.moviestest.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.charlsgod.moviestest.util.GenreConverter.class})
@androidx.room.Database(entities = {com.charlsgod.moviestest.model.Movie.class, com.charlsgod.moviestest.model.Genre.class, com.charlsgod.moviestest.model.Trailer.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/charlsgod/moviestest/db/MoviesDatabase;", "Landroidx/room/RoomDatabase;", "()V", "genreDao", "Lcom/charlsgod/moviestest/db/GenreDao;", "getGenreDao", "()Lcom/charlsgod/moviestest/db/GenreDao;", "movieDao", "Lcom/charlsgod/moviestest/db/MovieDao;", "getMovieDao", "()Lcom/charlsgod/moviestest/db/MovieDao;", "trailerDao", "Lcom/charlsgod/moviestest/db/TrailerDao;", "getTrailerDao", "()Lcom/charlsgod/moviestest/db/TrailerDao;", "app_debug"})
public abstract class MoviesDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.charlsgod.moviestest.db.MovieDao getMovieDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.charlsgod.moviestest.db.GenreDao getGenreDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.charlsgod.moviestest.db.TrailerDao getTrailerDao();
    
    public MoviesDatabase() {
        super();
    }
}