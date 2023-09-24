package com.fuadhev.movieappjetpack.presentation.movies

import com.fuadhev.movieappjetpack.domain.model.MovieUiModel

data class MovieState(
    val isLoading : Boolean = false,
    val movies : List<MovieUiModel> = emptyList(),
    val error : String = "",
    val search : String = "batman"
)