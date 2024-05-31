package com.pictarine.picflix.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pictarine.picflix.api.MovieDbApi
import com.pictarine.picflix.model.network.MovieResponse
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {
    private val _listPopularMovies = MutableLiveData<List<MovieResponse>>()
    val listPopularMovies: LiveData<List<MovieResponse>>
        get() = _listPopularMovies

    init {
        viewModelScope.launch {}
    }

    fun getPopularMovies() {
        viewModelScope.launch {
            val response = MovieDbApi.api.getPopularMoviesList()
            _listPopularMovies.postValue(response.results)
        }
    }
}