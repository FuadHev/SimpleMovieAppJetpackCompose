package com.fuadhev.movieappjetpack.data.di

import com.fuadhev.movieappjetpack.data.repo.MovieRepositoryImpl
import com.fuadhev.movieappjetpack.domain.repo.MovieRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
//
//    @Singleton
//    @Binds
//    abstract fun provideAuthRepository(authRepositoryImpl: MovieRepositoryImpl): MovieRepository



}