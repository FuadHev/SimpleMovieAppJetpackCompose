package com.fuadhev.movieappjetpack.presentation.movies


sealed class MovieEvent {
    data class Search(val searchString :String) : MovieEvent()
}