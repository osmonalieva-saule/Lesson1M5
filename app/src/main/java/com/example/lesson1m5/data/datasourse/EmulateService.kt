package com.example.lesson1m5.data.datasourse

import com.example.lesson1m5.data.model.CounterDto
import javax.inject.Inject

class EmulateService @Inject constructor() {
   private var count = 0
    private var isIncrement = false
    fun increment() {
        count++
        isIncrement= true
    }
    fun decrement() {
        count--
        isIncrement= false
    }
    fun getCount(): CounterDto {
        return CounterDto(
            operationType = if (isIncrement) "increment" else "decrement",
            count = count
        )
    }

}