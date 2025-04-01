package com.example.lesson1m5.domain.usecases

import com.example.lesson1m5.data.repository.CounterRepositoryImpl
import com.example.lesson1m5.domain.repository.CounterRepository

class IncrementUseCase(
    private val counterRepository: CounterRepository
){
    operator fun invoke()= counterRepository.increment()
}