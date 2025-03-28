package com.example.lesson1m5.presentation.view_model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lesson1m5.domain.model.CounterEntity
import com.example.lesson1m5.domain.usecases.DecrementUseCase
import com.example.lesson1m5.domain.usecases.GetCountUseCase
import com.example.lesson1m5.domain.usecases.IncrementUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val incrementUseCase: IncrementUseCase,
    private val decrementUseCase: DecrementUseCase,
    private val getCountUseCase: GetCountUseCase
) : ViewModel() {
    private val _counter = MutableLiveData<
            CounterEntity>()
    val counter: LiveData<
            CounterEntity> = _counter

    fun increment() {
        incrementUseCase.increment()
        _counter.value = getCountUseCase.getCount()
    }

    fun decrement() {
        decrementUseCase.decrement()
        _counter.value = getCountUseCase.getCount()
    }

    fun getCounter() {
        _counter.value = getCountUseCase.getCount()
    }


}