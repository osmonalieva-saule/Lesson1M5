package com.example.lesson1m5.domain.usecases

import com.example.lesson1m5.data.repository.CounterRepositoryImpl
import com.example.lesson1m5.domain.repository.CounterRepository
import javax.inject.Inject

class IncrementUseCase @Inject constructor(
    private val counterRepository: CounterRepository
){
    fun increment()= counterRepository.increment()
}