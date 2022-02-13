package com.charlsgod.moviestest.repository

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.charlsgod.moviestest.MainCoroutinesRule
import com.charlsgod.moviestest.api.MoviesService
import com.charlsgod.moviestest.db.MoviesDatabase
import com.charlsgod.moviestest.db.MovieDao
import com.charlsgod.moviestest.utils.TestUtil
import com.charlsgod.moviestest.utils.getOrAwaitValue
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito.*

/**
 * Local unit tests for the implementation of [MovieRepository]
 */
@ExperimentalCoroutinesApi
class MovieRepositoryTest {
    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    val mainCoroutinesRule = MainCoroutinesRule()

    private lateinit var repository: MovieRepository
    private lateinit var  service: MoviesService
    private lateinit var database: MoviesDatabase

    @Test
    fun loadMoviesFromDbTest() = runBlockingTest {
        database = mock(MoviesDatabase::class.java)
        service = mock(MoviesService::class.java)
        repository = MovieRepository(service, database)

       val movieDao = mock(MovieDao::class.java)
        `when`(database.movieDao).thenReturn(movieDao)

        //Data loaded from database is not null or empty
        val data = listOf(TestUtil.createMovie())
        `when`(movieDao.getMovies("foo")).thenReturn(data)

        //Act
        repository.searchMovies("foo").getOrAwaitValue()


        //Assert invocation of movieDao.getMovies() on certain query
        verify(movieDao, atLeastOnce()).getMovies("foo")
    }

    @Test
    fun fetchMoviesFromNetwork() = runBlockingTest {
        database = mock(MoviesDatabase::class.java)
        service = mock(MoviesService::class.java)
        repository = MovieRepository(service, database)

        val movieDao = mock(MovieDao::class.java)
        `when`(database.movieDao).thenReturn(movieDao)

        //Data loaded from database is null
        `when`(movieDao.getMovies("bar")).thenReturn(emptyList())

        //Act
        repository.searchMovies("bar").getOrAwaitValue()

        //Assert invocation of service.getMoviesAsync() on certain query.
        verify(service).getMoviesAsync(title = "bar")
    }
}