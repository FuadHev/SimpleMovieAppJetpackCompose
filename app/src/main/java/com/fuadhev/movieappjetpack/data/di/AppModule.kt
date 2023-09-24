package com.fuadhev.movieappjetpack.data.di

import android.content.Context
import com.fuadhev.movieappjetpack.data.remote.MovieApiService
import com.fuadhev.movieappjetpack.data.repo.MovieRepositoryImpl
import com.fuadhev.movieappjetpack.domain.repo.MovieRepository
import com.fuadhev.movieappjetpack.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMovieApi() : MovieApiService {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MovieApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideMovieRepository(api : MovieApiService) : MovieRepository {
        return MovieRepositoryImpl(api = api)
    }
}