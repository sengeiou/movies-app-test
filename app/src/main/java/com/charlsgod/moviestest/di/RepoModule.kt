package com.charlsgod.moviestest.di

import com.charlsgod.moviestest.api.MoviesService
import com.charlsgod.moviestest.db.MoviesDatabase
import com.charlsgod.moviestest.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RepoModule {

    @Provides
    @Singleton
    fun provideRepository(service: MoviesService, db: MoviesDatabase) =
        MovieRepository(service, db)
}