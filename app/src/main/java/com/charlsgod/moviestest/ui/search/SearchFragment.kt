package com.charlsgod.moviestest.ui.search

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.*
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.charlsgod.moviestest.R
import com.charlsgod.moviestest.databinding.FragmentFavouritesBinding
import com.charlsgod.moviestest.databinding.FragmentSearchBinding
import com.charlsgod.moviestest.model.Movie
import com.charlsgod.moviestest.ui.common.MovieAdapter
import com.charlsgod.moviestest.util.DEFAULT_COLUMN_COUNT
import com.charlsgod.moviestest.util.EventObserver
import com.charlsgod.moviestest.util.SEARCH_GRID_COLUMN
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class SearchFragment : Fragment() {
    val searchViewModel: SearchViewModel by viewModels()
    private lateinit var adapter: MovieAdapter
    private var actionMode: ActionMode? = null
    private val binding: FragmentSearchBinding by lazy {
        FragmentSearchBinding.inflate(layoutInflater)
    }
    private val sharedPrefs: SharedPreferences by lazy {
        requireActivity().getSharedPreferences(
            resources.getString(R.string.preference_file_key),
            Context.MODE_PRIVATE
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        adapter = initAdapter()
        binding.apply {
            viewModel = searchViewModel
            list.adapter = adapter
            lifecycleOwner = viewLifecycleOwner

            setupToolbar()
        }
        return binding.root
    }

    /**
     * Setup custom toolbar with NavigationIcon, which opens a drawer.
     */
    private fun FragmentSearchBinding.setupToolbar() {
        searchToolbar.navigationContentDescription = resources.getString(R.string.open_nav_drawer)
        searchToolbar.setNavigationOnClickListener {
            requireActivity().drawer_layout.openDrawer(
                GravityCompat.START
            )
        }
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        getSavedPrefsAndStartViewModel()

        searchViewModel.navigateToDetailEvent.observe(viewLifecycleOwner, EventObserver { movie ->
            findNavController().navigate(
                SearchFragmentDirections.actionSearchFragmentToDetailFragment(
                    movie
                )
            )
        })

        searchViewModel.contextualMenuEvent.observe(viewLifecycleOwner, EventObserver {
            displayContextualMenuWithDelete(it)
        })

        searchViewModel.columnCount.observe(viewLifecycleOwner) { columnCount ->
            saveColumnCountToSharedPrefs(columnCount)
        }

        searchViewModel.updateSortType(false)
    }

    /**
     * Init adapter with onClick listener.
     */
    private fun initAdapter(): MovieAdapter {
        return MovieAdapter(object :
            MovieAdapter.MovieAdapterListener {

            override fun onClick(view: View, movie: Movie) {
                searchViewModel.navigateToDetail(movie)
            }

            override fun onLongClick(movie: Movie): Boolean {
                return false
            }
        })
    }

    /**
     * Returns last saved column count. Ensures that's
     * properly initialized with the default value
     * when this method is called for the first time.
     *
     * Updates ViewModel so it triggers setting of
     * recyclerview's span count via BindingAdapter.
     */
    private fun getSavedPrefsAndStartViewModel() {
        val columnCountGrid = sharedPrefs.getInt(SEARCH_GRID_COLUMN, DEFAULT_COLUMN_COUNT)
        searchViewModel.start(columnCountGrid)
    }


    /**
     * Invoked when the changes on the [SearchViewModel.columnCount] observed.
     * Saves a new column count to the shared preferences.
     */
    private fun saveColumnCountToSharedPrefs(columnCount: Int) {
        with(sharedPrefs.edit()) {
            putInt(SEARCH_GRID_COLUMN, columnCount)
            apply()
        }
    }

    /**
     * Invoked when the changes on the [SearchViewModel.contextualMenuEvent] observed.
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
                            true
                        }
                        else -> false
                    }
                }

                // Called when the action mode is created; startActionMode() was called
                override fun onCreateActionMode(mode: ActionMode, menu: Menu): Boolean {
                    val inflater: MenuInflater = mode.menuInflater
                    inflater.inflate(R.menu.search_contextual_menu, menu)
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
}