package com.fuadhev.movieappjetpack.domain.usecase

import android.util.Log
import com.fuadhev.movieappjetpack.data.remote.dto.MoviesDTO
import com.fuadhev.movieappjetpack.domain.mapper.Mapper.toMovieUiModel
import com.fuadhev.movieappjetpack.domain.model.MovieUiModel
import com.fuadhev.movieappjetpack.domain.repo.MovieRepository
import com.fuadhev.movieappjetpack.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetMovieUseCase @Inject constructor (private val repo:MovieRepository){
    fun getMovies(search:String): Flow<Resource<List<MovieUiModel>>> = flow {

        try {
            emit(Resource.Loading)
            val movieList=repo.getMovies(search)

            if(movieList.Response == "True"){
                emit(Resource.Success(movieList.toMovieUiModel()))
            }else{
                emit(Resource.Error("No Movie Found"))
            }
        }catch (e:Exception){
            emit(Resource.Error(e.localizedMessage?:"Error 404"))
        }

    }
}