package com.fuadhev.movieappjetpack.data.repo

import com.fuadhev.movieappjetpack.data.remote.MovieApiService
import com.fuadhev.movieappjetpack.data.remote.dto.MovieDetailDTO
import com.fuadhev.movieappjetpack.data.remote.dto.MoviesDTO
import com.fuadhev.movieappjetpack.domain.repo.MovieRepository
import javax.inject.Inject


class MovieRepositoryImpl @Inject constructor(private val api: MovieApiService) : MovieRepository {
    override suspend fun getMovies(search: String): MoviesDTO {
        return api.getMovies(searchString = search)
    }

    override suspend fun getMovieDetail(movieId: String): MovieDetailDTO {
        return api.getMovieDetail(movieId = movieId)
    }
}