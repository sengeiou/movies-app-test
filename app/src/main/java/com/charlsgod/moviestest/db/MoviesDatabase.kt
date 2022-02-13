package com.charlsgod.moviestest.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.charlsgod.moviestest.model.Genre
import com.charlsgod.moviestest.model.Movie
import com.charlsgod.moviestest.model.Trailer
import com.charlsgod.moviestest.util.GenreConverter

@Database(
    entities = [Movie::class, Genre::class, Trailer::class], version = 1, exportSchema = false
)
@TypeConverters(GenreConverter::class)
abstract class MoviesDatabase : RoomDatabase() {
    abstract val movieDao: MovieDao
    abstract val genreDao: GenreDao
    abstract val trailerDao: TrailerDao
}