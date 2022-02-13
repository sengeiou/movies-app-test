package com.charlsgod.moviestest.utils

import com.charlsgod.moviestest.api.ApiMovie
import com.charlsgod.moviestest.model.Genre
import com.charlsgod.moviestest.model.Movie
import com.charlsgod.moviestest.model.Trailer

object TestUtil {
    fun createMovie(): Movie =
        Movie(
            id = 475557,
            title = "Joker",
            overview = "During the 1980s, a failed stand-up comedian is driven insane and turns to a life of crime and chaos in Gotham City while becoming an infamous psychopathic crime figure.",
            rating = 8.2,
            posterUrl = "udDclJoHjfjb8Ekgsd4FDteOkCU.jpg",
            language = "en",
            releaseDate = "2019-10-02",
            popularity = 215.35,
            genreIds = listOf(80, 18, 13)
        )

    fun createTrailer(): Trailer = Trailer(475557, "g7aLO6npH5U")

    fun createGenre(): Genre = Genre(80, "comedy")

    fun createListResponse(): List<ApiMovie> {
        val apiMovie = ApiMovie(id = 475557,
            title = "Joker",
            overview = "During the 1980s, a failed stand-up comedian is driven insane and turns to a life of crime and chaos in Gotham City while becoming an infamous psychopathic crime figure.",
            rating = 8.2,
            posterUrl = "udDclJoHjfjb8Ekgsd4FDteOkCU.jpg",
            language = "en",
            releaseDate = "2019-10-02",
            popularity = 215.35,
            genreIds = listOf(80, 18, 13))

        return listOf(apiMovie)
    }
}