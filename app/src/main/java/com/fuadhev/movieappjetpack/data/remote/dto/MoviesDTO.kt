package com.fuadhev.movieappjetpack.data.remote.dto

import com.fuadhev.movieappjetpack.domain.model.MovieUiModel

data class MoviesDTO(
    val Response: String,
    val Search: List<Search>,
    val totalResults: String
)