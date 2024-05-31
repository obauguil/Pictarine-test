package com.pictarine.picflix.model.network

import com.pictarine.picflix.model.CollectionModel
import com.pictarine.picflix.model.GenreModel

data class MovieDetailResponse (
    val id: Int,
    val title: String,
    val overview: String,
    val release_date: String,
    val backdrop_path: String,
    val belongs_to_collection: List<CollectionModel>,
    val genres: List<GenreModel>,
    val homepage: String,
    val adult: Boolean,
    val budget: Double
)