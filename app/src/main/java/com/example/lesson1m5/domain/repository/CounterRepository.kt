package com.example.lesson1m5.domain.repository

import com.example.lesson1m5.domain.model.CounterEntity

interface CounterRepository {

    fun increment()

    fun decrement()

    fun getCount(): CounterEntity


}