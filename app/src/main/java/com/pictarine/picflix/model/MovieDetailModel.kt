package com.pictarine.picflix.model

data class MovieDetailModel (
    val id: Int,
    val title: String = "",
    val overview: String = "",
    val release_date: String = "",
    val backdrop_path: String = "",
    val belongs_to_collection: List<CollectionModel> = emptyList(),
    val genres: List<GenreModel> = emptyList(),
    val homepage: String = "",
    val adult: Boolean = false,
    val budget: Double = 0.0
)