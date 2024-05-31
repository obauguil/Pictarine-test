package com.pictarine.picflix.model.network

data class MovieResponse (
    val id: Int,
    val title: String = "",
    val overview: String = "",
    val poster_path: String = "",
    val release_date: String = "",
    val adult: Boolean = false,
    val genre_ids: List<Int> = emptyList()
)