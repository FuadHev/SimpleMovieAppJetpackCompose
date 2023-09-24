package com.fuadhev.movieappjetpack.domain.mapper

import android.graphics.Movie
import com.fuadhev.movieappjetpack.data.remote.dto.MovieDetailDTO
import com.fuadhev.movieappjetpack.data.remote.dto.MoviesDTO
import com.fuadhev.movieappjetpack.domain.model.MovieDetailUiModel
import com.fuadhev.movieappjetpack.domain.model.MovieUiModel

object Mapper {
//
    fun MoviesDTO.toMovieUiModel() = Search.map {
        MovieUiModel(it.Poster,it.Title,it.Year,it.imdbID)

    }
//    fun MoviesDTO.toMovieUiModel() : List<MovieUiModel> {
//        return Search.map { search -> MovieUiModel(search.Poster,search.Title,search.Year,search.imdbID) }
//    }

    fun MovieDetailDTO.toMovieDetail() = MovieDetailUiModel(
            Actors,
            Awards,
            Country,
            Director,
            Genre,
            Language,
            Poster,
            Rated,
            Released,
            Title,
            Type,
            Year,
            imdbRating
        )

}