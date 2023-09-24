package com.fuadhev.movieappjetpack.domain.usecase

import com.fuadhev.movieappjetpack.domain.mapper.Mapper.toMovieDetail
import com.fuadhev.movieappjetpack.domain.mapper.Mapper.toMovieUiModel
import com.fuadhev.movieappjetpack.domain.model.MovieDetailUiModel
import com.fuadhev.movieappjetpack.domain.model.MovieUiModel
import com.fuadhev.movieappjetpack.domain.repo.MovieRepository
import com.fuadhev.movieappjetpack.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetMovieDetailUseCase @Inject constructor(private val repo: MovieRepository) {

    fun getMovieDetail(movieId: String): Flow<Resource<MovieDetailUiModel>> = flow {
        try {
            emit(Resource.Loading)
            val movieList = repo.getMovieDetail(movieId)
            emit(Resource.Success(movieList.toMovieDetail()))

        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "Error 404"))
        }
    }
}