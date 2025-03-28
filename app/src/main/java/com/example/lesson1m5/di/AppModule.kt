package com.example.lesson1m5.di

import com.example.lesson1m5.data.repository.CounterRepositoryImpl
import com.example.lesson1m5.domain.repository.CounterRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {
    @Binds
    @Singleton
    abstract fun bindCounterRepository(
        counterRepositoryImpl: CounterRepositoryImpl
    ): CounterRepository
}