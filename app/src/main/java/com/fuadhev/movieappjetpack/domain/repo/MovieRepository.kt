package com.fuadhev.movieappjetpack.domain.repo

import com.fuadhev.movieappjetpack.data.remote.dto.MovieDetailDTO
import com.fuadhev.movieappjetpack.data.remote.dto.MoviesDTO

interface MovieRepository {
   suspend fun getMovies(search:String):MoviesDTO
   suspend fun getMovieDetail(movieId:String):MovieDetailDTO
}