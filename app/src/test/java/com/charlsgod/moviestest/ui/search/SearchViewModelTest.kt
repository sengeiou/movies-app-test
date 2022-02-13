package com.charlsgod.moviestest.ui.search

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.charlsgod.moviestest.MainCoroutinesRule
import com.charlsgod.moviestest.model.Movie
import com.charlsgod.moviestest.repository.MovieRepository
import com.charlsgod.moviestest.util.Resource
import com.charlsgod.moviestest.utils.TestUtil
import com.charlsgod.moviestest.utils.getOrAwaitValue
import com.charlsgod.moviestest.utils.mock
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

/**
 * Local unit tests for the implementation of [SearchViewModel]
 */
@ExperimentalCoroutinesApi
class SearchViewModelTest {
    @get:Rule
    val mainCoroutinesRule = MainCoroutinesRule()

    @get:Rule
    val instantExecutorRule = InstantTaskExecutorRule()

    private lateinit var viewModel: SearchViewModel
    private lateinit var repository: MovieRepository
    private lateinit var movie: Movie

    @Before
    fun setUp() {
        repository = mock(MovieRepository::class.java, Mockito.RETURNS_DEEP_STUBS)
        viewModel = SearchViewModel(repository)
        movie = TestUtil.createMovie()
    }

    @Test
    fun startTest() {
        viewModel.start(2)
        val value = viewModel.columnCount.getOrAwaitValue()
        assertThat(value, `is`(2))
    }

    @Test
    fun updateGridLayoutTest() {
        viewModel.start(1)
        var value = viewModel.columnCount.getOrAwaitValue()
        assertThat(value, `is`(1))

        viewModel.updateGridLayout()
        value = viewModel.columnCount.getOrAwaitValue()
        assertThat(value, `is`(2))
    }

    @Test
    fun navigateToDetailTest() {
        viewModel.navigateToDetail(movie)
        val event = viewModel.navigateToDetailEvent.getOrAwaitValue()
        assertThat(event.getContentIfNotHandled(), `is`(movie))
    }

    @Test
    fun searchTest() = runBlockingTest {
        val foo = MutableLiveData<Resource<List<Movie>>>()
        `when`(repository.searchMovies("foo")).thenReturn(foo)
        val observer = mock<Observer<Resource<List<Movie>>>>() //used MockitoExt.
        viewModel.results.observeForever(observer)
        viewModel.search("foo")
        verify(repository).searchMovies("foo")
    }

    @Test
    fun getTopRatedTest() = runBlockingTest {
        val foo = MutableLiveData<Resource<List<Movie>>>()
        `when`(repository.getTopRatedMovies()).thenReturn(foo)
        val observer = mock<Observer<Resource<List<Movie>>>>() //used MockitoExt.
        viewModel.results.observeForever(observer)
        viewModel.getTopRated()
        verify(repository).getTopRatedMovies()
    }

    @Test
    fun getPopularTest() = runBlockingTest {
        val foo = MutableLiveData<Resource<List<Movie>>>()
        `when`(repository.getPopularMovies()).thenReturn(foo)
        val observer = mock<Observer<Resource<List<Movie>>>>() //used MockitoExt.
        viewModel.results.observeForever(observer)
        viewModel.getPopular()
        verify(repository).getPopularMovies()
    }
}