package com.charlsgod.moviestest.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/charlsgod/moviestest/di/RepoModule;", "", "()V", "provideRepository", "Lcom/charlsgod/moviestest/repository/MovieRepository;", "service", "Lcom/charlsgod/moviestest/api/MoviesService;", "db", "Lcom/charlsgod/moviestest/db/MoviesDatabase;", "app_debug"})
@dagger.Module()
public final class RepoModule {
    public static final com.charlsgod.moviestest.di.RepoModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.charlsgod.moviestest.repository.MovieRepository provideRepository(@org.jetbrains.annotations.NotNull()
    com.charlsgod.moviestest.api.MoviesService service, @org.jetbrains.annotations.NotNull()
    com.charlsgod.moviestest.db.MoviesDatabase db) {
        return null;
    }
    
    private RepoModule() {
        super();
    }
}