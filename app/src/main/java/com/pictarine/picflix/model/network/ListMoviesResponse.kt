package com.pictarine.picflix.model.network

data class ListMoviesResponse (
    val page: Int,
    val results: List<MovieResponse>
)