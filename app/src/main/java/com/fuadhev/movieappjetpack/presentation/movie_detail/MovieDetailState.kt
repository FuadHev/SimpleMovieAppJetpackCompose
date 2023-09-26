package com.fuadhev.movieappjetpack.presentation.movie_detail

import com.fuadhev.movieappjetpack.domain.model.MovieDetailUiModel

data class MovieDetailState(
    val isLoading:Boolean=false,
    var movie :MovieDetailUiModel?=null,
    val error:String=""

)