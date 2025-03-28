package com.example.lesson1m5.domain.usecases

import com.example.lesson1m5.domain.repository.CounterRepository
import javax.inject.Inject

class DecrementUseCase @Inject constructor (
    private val counterRepository: CounterRepository,
    ){
        fun decrement()= counterRepository.decrement()
}