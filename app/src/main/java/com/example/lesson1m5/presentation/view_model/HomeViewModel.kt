package com.example.lesson1m5.presentation.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lesson1m5.domain.model.CounterEntity
import com.example.lesson1m5.domain.usecases.DecrementUseCase
import com.example.lesson1m5.domain.usecases.GetCountUseCase
import com.example.lesson1m5.domain.usecases.IncrementUseCase

class HomeViewModel(
    private val incrementUseCase: IncrementUseCase,
    private val decrementUseCase: DecrementUseCase,
    private val getCountUseCase: GetCountUseCase
) : ViewModel() {
    private val _counter = MutableLiveData(getCountUseCase())
    val counter: LiveData<CounterEntity> = _counter

    fun increment() {
        incrementUseCase()
        getCounter()
    }

    fun decrement() {
        decrementUseCase()
        getCounter()
    }

    private fun getCounter() {
        _counter.value = getCountUseCase()
    }
}