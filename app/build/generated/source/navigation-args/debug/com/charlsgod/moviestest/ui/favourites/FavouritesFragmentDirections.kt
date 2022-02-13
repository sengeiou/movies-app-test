package com.charlsgod.moviestest.ui.favourites

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.charlsgod.moviestest.R
import com.charlsgod.moviestest.model.Movie
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class FavouritesFragmentDirections private constructor() {
  private data class ActionFavouritesFragmentToDetailFragment(
    val movie: Movie
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_favouritesFragment_to_detailFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Movie::class.java)) {
        result.putParcelable("movie", this.movie as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Movie::class.java)) {
        result.putSerializable("movie", this.movie as Serializable)
      } else {
        throw UnsupportedOperationException(Movie::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  companion object {
    fun actionFavouritesFragmentToDetailFragment(movie: Movie): NavDirections =
        ActionFavouritesFragmentToDetailFragment(movie)
  }
}
