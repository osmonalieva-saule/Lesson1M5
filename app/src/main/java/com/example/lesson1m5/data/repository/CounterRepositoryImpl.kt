package com.example.lesson1m5.data.repository

import com.example.lesson1m5.data.datasourse.EmulateService
import com.example.lesson1m5.data.datasourse.network.ApiService
import com.example.lesson1m5.data.mapper.toDomain
import com.example.lesson1m5.domain.model.CounterEntity
import com.example.lesson1m5.domain.model.OperationType
import com.example.lesson1m5.domain.repository.CounterRepository


class CounterRepositoryImpl(private val api: ApiService): CounterRepository {

    override fun increment() {
        //     api.increment()
    }

    override fun decrement() {
        //     api.decrement()
    }

    override fun getCount(): CounterEntity {
        // val response = api.getCount()
        //return response.toDomain()
    }

}