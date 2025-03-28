package com.example.lesson1m5.domain.usecases

import com.example.lesson1m5.domain.repository.CounterRepository
import javax.inject.Inject

class GetCountUseCase @Inject constructor (
    private val counterRepository: CounterRepository
){
    fun getCount()= counterRepository.getCount()

}