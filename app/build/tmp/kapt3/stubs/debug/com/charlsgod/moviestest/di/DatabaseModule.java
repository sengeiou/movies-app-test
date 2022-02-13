package com.charlsgod.moviestest.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/charlsgod/moviestest/di/DatabaseModule;", "", "()V", "provideDatabase", "Lcom/charlsgod/moviestest/db/MoviesDatabase;", "app", "Landroid/app/Application;", "provideGenreDao", "Lcom/charlsgod/moviestest/db/GenreDao;", "db", "provideMovieDao", "Lcom/charlsgod/moviestest/db/MovieDao;", "provideTrailerDao", "Lcom/charlsgod/moviestest/db/TrailerDao;", "app_debug"})
@dagger.Module()
public final class DatabaseModule {
    public static final com.charlsgod.moviestest.di.DatabaseModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.charlsgod.moviestest.db.MoviesDatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.charlsgod.moviestest.db.MovieDao provideMovieDao(@org.jetbrains.annotations.NotNull()
    com.charlsgod.moviestest.db.MoviesDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.charlsgod.moviestest.db.GenreDao provideGenreDao(@org.jetbrains.annotations.NotNull()
    com.charlsgod.moviestest.db.MoviesDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.charlsgod.moviestest.db.TrailerDao provideTrailerDao(@org.jetbrains.annotations.NotNull()
    com.charlsgod.moviestest.db.MoviesDatabase db) {
        return null;
    }
    
    private DatabaseModule() {
        super();
    }
}