package com.fuadhev.movieappjetpack.data.remote

import com.fuadhev.movieappjetpack.data.remote.dto.MovieDetailDTO
import com.fuadhev.movieappjetpack.data.remote.dto.MoviesDTO
import com.fuadhev.movieappjetpack.util.Constants.API_KEY
import com.fuadhev.movieappjetpack.util.Resource
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApiService {

    @GET(".")
    suspend fun getMovies(
        @Query("s") searchString: String,
        @Query("apikey") apikey: String = API_KEY
    ): MoviesDTO


    @GET(".")
    suspend fun getMovieDetail(
        @Query("i") movieId: String,
        @Query("apikey") apikey: String = API_KEY
    ): MovieDetailDTO
}