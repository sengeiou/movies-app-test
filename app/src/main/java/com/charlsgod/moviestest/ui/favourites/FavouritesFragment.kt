package com.charlsgod.moviestest.ui.favourites

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.charlsgod.moviestest.R
import com.charlsgod.moviestest.databinding.FragmentFavouritesBinding
import com.charlsgod.moviestest.model.Movie
import com.charlsgod.moviestest.ui.common.MovieAdapter
import com.charlsgod.moviestest.util.*
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavouritesFragment : Fragment() {
    val favouritesViewModel by viewModels<FavouritesViewModel>()

    private val binding: FragmentFavouritesBinding by lazy {
        FragmentFavouritesBinding.inflate(layoutInflater)
    }
    private val sharedPrefs: SharedPreferences by lazy {
        requireActivity().getSharedPreferences(
            resources.getString(R.string.preference_file_key),
            Context.MODE_PRIVATE
        )
    }
    private lateinit var homeAdapter: MovieAdapter
    private var actionMode: ActionMode? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        homeAdapter = initAdapter()
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel = favouritesViewModel
            list.adapter = homeAdapter
            setupToolbar()
        }
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        getSavedPrefsAndStartViewModel()

        favouritesViewModel.navigateToDetail.observe(viewLifecycleOwner, EventObserver {
            findNavController().navigate(
                FavouritesFragmentDirections.actionFavouritesFragmentToDetailFragment(it)
            )
        })

        favouritesViewModel.snackBarEvent.observe(viewLifecycleOwner, EventObserver {
            displaySnackBarWithUndoRemove(it)
        })

        favouritesViewModel.contextualMenuEvent.observe(viewLifecycleOwner, EventObserver {
            displayContextualMenuWithDelete(it)
        })

        favouritesViewModel.columnCount.observe(viewLifecycleOwner) { columnCount ->
            saveColumnCountToSharedPrefs(columnCount)
        }

        favouritesViewModel.sortType.observe(viewLifecycleOwner) { sort ->
            saveSortToSharedPrefs(sort)
            favouritesViewModel.getFavourites(sort)
        }
    }

    /**
     * Returns last set sort type and column count.
     * Ensures that's properly initialized with the default value
     * when this method is called for the first time.
     */
    private fun getSavedPrefsAndStartViewModel() {
        val currentSort = sharedPrefs.getString(PREFS_SORT, POPULARITY_SORT).toString()
        val columnCountGrid = sharedPrefs.getInt(HOME_GRID_COLUMN, DEFAULT_COLUMN_COUNT)

        favouritesViewModel.start(currentSort, columnCountGrid)
    }

    /**
     * Init adapter with onClick and onLongClick listeners.
     */
    private fun initAdapter(): MovieAdapter {
        return MovieAdapter(object :
            MovieAdapter.MovieAdapterListener {

            override fun onClick(view: View, movie: Movie) {
                favouritesViewModel.navigateToDetail(movie)
            }

            override fun onLongClick(movie: Movie): Boolean {
                favouritesViewModel.displayMenuWithDelete(movie)
                return true
            }
        })
    }

    private fun FragmentFavouritesBinding.setupToolbar() {
        favouritesToolbar.navigationContentDescription = resources.getString(R.string.nav_up)
        favouritesToolbar.setNavigationOnClickListener { findNavController().navigateUp() }
    }

    /**
     * Invoked when the changes on the [FavouritesViewModel.contextualMenuEvent] observed.
     * Displays contextual menu with an option to delete.
     */
    private fun displayContextualMenuWithDelete(movie: Movie) {
        if (actionMode == null) {

            actionMode = requireActivity().startActionMode(object :
                ActionMode.Callback {

                // Called when the user selects a contextual menu item
                override fun onActionItemClicked(
                    mode: ActionMode, item: MenuItem
                ): Boolean {
                    return when (item.itemId) {
                        R.id.delete -> {
                            favouritesViewModel.removeFromFavourite(movie)
                            favouritesViewModel.displaySnackBarWithUndo(movie)
                            mode.finish() // Action picked, so close the CAB
                            true
                        }
                        else -> false
                    }
                }

                // Called when the action mode is created; startActionMode() was called
                override fun onCreateActionMode(mode: ActionMode, menu: Menu): Boolean {
                    val inflater: MenuInflater = mode.menuInflater
                    inflater.inflate(R.menu.favorites_contextual_menu, menu)
                    return true
                }

                // Return false if nothing is done
                override fun onPrepareActionMode(
                    mode: ActionMode?,
                    menu: Menu?
                ): Boolean {
                    return false
                }

                // Called when the user exits the action mode
                override fun onDestroyActionMode(mode: ActionMode?) {
                    actionMode = null
                }
            })
            actionMode?.title = resources.getString(R.string.cab_title)
        }
    }

    /**
     * Invoked when the changes on the [FavouritesViewModel.snackBarEvent] observed.
     * Displays a SnackBar with an option to undo delete.
     */
    private fun displaySnackBarWithUndoRemove(movie: Movie) {
        Snackbar.make(
            binding.list,
            "${movie.title} " + resources.getString(R.string.undo_delete),
            Snackbar.LENGTH_SHORT
        ).setAction(resources.getString(R.string.undo_action)) {
            favouritesViewModel.undoRemove(movie)
        }.show()
    }


    /**
     * Invoked when the changes on the [FavouritesViewModel.sortType] observed.
     * Saves a new sort to the shared preferences.
     */
    private fun saveSortToSharedPrefs(sort: String?) {
        with(sharedPrefs.edit()) {
            putString(PREFS_SORT, sort)
            apply()
        }
    }

    /**
     * Invoked when the changes on the [FavouritesViewModel.columnCount] observed.
     * Saves a new column count to the shared preferences.
     */
    private fun saveColumnCountToSharedPrefs(columnCount: Int) {
        with(sharedPrefs.edit()) {
            putInt(HOME_GRID_COLUMN, columnCount)
            apply()
        }
    }
}