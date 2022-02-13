package com.charlsgod.moviestest.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class TrailerSearchResponse(@Json(name = "results") val trailersApi: List<ApiTrailer>)

@JsonClass(generateAdapter = true)
data class ApiTrailer(
    @Json(name = "key") val url: String?
)
