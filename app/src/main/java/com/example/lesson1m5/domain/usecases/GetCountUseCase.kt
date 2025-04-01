package com.example.lesson1m5.domain.usecases

import com.example.lesson1m5.domain.repository.CounterRepository


class GetCountUseCase(
    private val counterRepository: CounterRepository
){
   operator fun invoke()= counterRepository.getCount()

}