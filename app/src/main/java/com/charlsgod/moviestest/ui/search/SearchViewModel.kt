package com.charlsgod.moviestest.ui.search

import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import androidx.databinding.Bindable
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.charlsgod.moviestest.model.Movie
import com.charlsgod.moviestest.repository.MovieRepository
import com.charlsgod.moviestest.util.Resource
import com.charlsgod.moviestest.util.SingleEvent
import kotlinx.coroutines.launch

class SearchViewModel @ViewModelInject constructor(
    private val repository: MovieRepository
) : ViewModel() {

    private var movieSource: LiveData<Resource<List<Movie>>> = MutableLiveData()

    private val query = MutableLiveData<String>()

    val input = MutableLiveData<String>()

    private val _results = MediatorLiveData<Resource<List<Movie>>>()
    val results: LiveData<Resource<List<Movie>>> = _results

    private val _errorMessage = MutableLiveData<Boolean>()
    val errorMessage: LiveData<Boolean> = _errorMessage

    private val _navigateToDetailEvent = MutableLiveData<SingleEvent<Movie>>()
    val navigateToDetailEvent: LiveData<SingleEvent<Movie>> = _navigateToDetailEvent

    private val _isTyping = MutableLiveData<Boolean>(true)
    val isTyping: LiveData<Boolean> = _isTyping

    private val _columnCount = MutableLiveData<Int>()
    val columnCount: LiveData<Int> = _columnCount

    private val _contextualMenuEvent = MutableLiveData<SingleEvent<Movie>>()
    val contextualMenuEvent: LiveData<SingleEvent<Movie>> = _contextualMenuEvent

    /**
     * Called in SearchFragment onActivityCreated.
     */
    fun start(columnCountGrid: Int) {
        _columnCount.value = columnCountGrid
    }

    /**
     * Executes once the ImageButton action_layout is clicked.
     * Gets the appropriate column count. Sets the span count
     * and the icon of layout_action ImageButton via BindingAdapter.
     */
    fun updateGridLayout() {
        val newColumnCount = if (_columnCount.value == 1) 2 else 1
        _columnCount.value = newColumnCount
    }

    /**
     * Checks whether sortType is true of false
     * and triggers sort type getting process
     */
    fun updateSortType(sortType: Boolean) {
        if (sortType) {
            getTopRated()
        } else {
            getPopular()
        }
    }


    /**
     * Executes once the search button is selected.
     */
    fun onEditorAction(view: View, actionId: Int?, event: KeyEvent?): Boolean {
        return if (actionId == EditorInfo.IME_ACTION_SEARCH) {
            setQuery()
            true
        } else false
    }

    /**
     * Sets appropriate query. Checks whether input is
     * valid and triggers error message if it's null or empty.
     *
     * Skips action if the input is the same as last query.
     */
    private fun setQuery() {
        val input = input.value?.trim()

        if (input.isNullOrEmpty()) {
            displayErrorMessage(true)
            return
        }

        if (input == query.value) return

        query.value = input
        displayErrorMessage(false)
        startSearching()
    }

    /**
     * Starts searching process. Assigns _isTyping value to false
     * which triggers keyboard dismissing.
     */
    private fun startSearching() {
        query.value?.let {
            search(it)
        }

        _isTyping.value = false
    }

    /**
     * Get the list of searched movies via repository.
     * Submit the list to the adapter via BindingAdapters.
     */
    fun search(query: String) {
        _results.removeSource(movieSource)

        viewModelScope.launch {
            movieSource = repository.searchMovies(query)
        }

        _results.addSource(movieSource) {
            _results.value = it
        }
    }

    /**
     * Get the list of top rated movies via repository.
     * Submit the list to the adapter via BindingAdapters.
     */
    fun getTopRated() {
        _results.removeSource(movieSource)

        viewModelScope.launch {
            movieSource = repository.getTopRatedMovies()
        }

        _results.addSource(movieSource) {
            _results.value = it
        }
    }

    /**
     * Get the list of popular movies via repository.
     * Submit the list to the adapter via BindingAdapters.
     */
    fun getPopular() {
        _results.removeSource(movieSource)

        viewModelScope.launch {
            movieSource = repository.getPopularMovies()
        }

        _results.addSource(movieSource) {
            _results.value = it
        }
    }

    /**
     * Executes once a [Movie] item is selected.
     * Triggers navigation to DetailFragment.
     */
    fun navigateToDetail(movie: Movie) {
        _navigateToDetailEvent.value = SingleEvent(movie)
    }

    /**
     * Helper function to update value of _errorMessage.
     */
    private fun displayErrorMessage(isDisplayed: Boolean) {
        _errorMessage.value = isDisplayed
    }

    /**
     * Executed once retry buttons in clicked.
     */
    fun retry() {
        startSearching()
    }
}