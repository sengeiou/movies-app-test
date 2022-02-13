package com.charlsgod.moviestest.ui.favourites

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.charlsgod.moviestest.MainCoroutinesRule
import com.charlsgod.moviestest.model.Movie
import com.charlsgod.moviestest.repository.MovieRepository
import com.charlsgod.moviestest.util.POPULARITY_SORT
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
import org.mockito.Mockito.*

/**
 * Local unit tests for the implementation of [FavouritesViewModel]
 */
@ExperimentalCoroutinesApi
class FavouritesViewModelTest {
    @get:Rule
    var coroutinesRule = MainCoroutinesRule()

    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    private lateinit var viewModel: FavouritesViewModel
    private lateinit var repository: MovieRepository
    private lateinit var movie: Movie

    @Before
    fun setUp() {
        repository = mock(MovieRepository::class.java, RETURNS_DEEP_STUBS)
        viewModel = FavouritesViewModel(repository)
        movie = TestUtil.createMovie()
    }

    @Test
    fun startTest() {
        viewModel.start("sortByTitle", 2)
        val sortData = viewModel.sortType.getOrAwaitValue()
        assertThat(sortData, `is`("sortByTitle"))
        val columnData = viewModel.columnCount.getOrAwaitValue()
        assertThat(columnData, `is`(2))
    }

    @Test
    fun navigateToSearchTest() {
        viewModel.navigateToSearch()
        val event = viewModel.navigateToSearch.getOrAwaitValue()
        assertThat(event.getContentIfNotHandled(), `is`(true))
    }

    @Test
    fun navigateToDetailTest() {
        viewModel.navigateToDetail(movie)
        val event = viewModel.navigateToDetail.getOrAwaitValue()
        assertThat(event.getContentIfNotHandled(), `is`(movie))
    }

    @Test
    fun displayMenuWithDeleteTest() {
        viewModel.displayMenuWithDelete(movie)
        val event = viewModel.contextualMenuEvent.getOrAwaitValue()
        assertThat(event.getContentIfNotHandled(), `is`(movie))
    }

    @Test
    fun removeFromFavouriteTest() {
        movie.isFavourite = true
        viewModel.removeFromFavourite(movie)
        assertThat(movie.isFavourite, `is`(false))
    }

    @Test
    fun displaySnackBarWithUndoTest() {
        viewModel.displaySnackBarWithUndo(movie)
        val event = viewModel.snackBarEvent.getOrAwaitValue()
        assertThat(event.getContentIfNotHandled(), `is`(movie))
    }

    @Test
    fun undoTest() {
        viewModel.removeFromFavourite(movie)
        assertThat(movie.isFavourite, `is`(false))
        viewModel.undoRemove(movie)
        assertThat(movie.isFavourite, `is`(true))
    }

    @Test
    fun getFavouritesTest() = runBlockingTest {
        val list = MutableLiveData<List<Movie>>()
        `when`(repository.getFavouriteMovies(POPULARITY_SORT)).thenReturn(list)

        val favouriteMovies = mock<Observer<List<Movie>>>() //used MockitoExt.
        viewModel.favouriteMovies.observeForever(favouriteMovies)
        viewModel.getFavourites(POPULARITY_SORT)
        verify(repository).getFavouriteMovies(POPULARITY_SORT)
        assertThat(list.hasActiveObservers(), `is`(true))
        viewModel.favouriteMovies.removeObserver(favouriteMovies)
    }
}