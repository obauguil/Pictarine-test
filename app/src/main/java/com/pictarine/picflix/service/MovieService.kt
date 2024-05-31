package com.pictarine.picflix.service

import com.pictarine.picflix.model.network.ListMoviesResponse
import com.pictarine.picflix.model.network.MovieDetailResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface MovieService {

    // Get the list of videos
    @GET("movie/popular?language=fr-FR&page=1")
    suspend fun getPopularMoviesList(): ListMoviesResponse

    // Get the details of specific movie
    // @param movie_id: Int
    @GET("movie/{movie_id}?language=fr-FR")
    suspend fun getMovie(@Path("movie_id") id: Int): MovieDetailResponse
}