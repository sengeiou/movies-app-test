package com.charlsgod.moviestest.di

import android.app.Application
import androidx.room.Room
import com.charlsgod.moviestest.db.MoviesDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application): MoviesDatabase {
        return Room
            .databaseBuilder(app, MoviesDatabase::class.java, "Movies_dp")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideMovieDao(db: MoviesDatabase) = db.movieDao

    @Provides
    @Singleton
    fun provideGenreDao(db: MoviesDatabase) = db.genreDao


    @Provides
    @Singleton
    fun provideTrailerDao(db: MoviesDatabase) = db.trailerDao
}