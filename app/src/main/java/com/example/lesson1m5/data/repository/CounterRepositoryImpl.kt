package com.example.lesson1m5.data.repository

import com.example.lesson1m5.data.datasourse.EmulateService
import com.example.lesson1m5.domain.model.CounterEntity
import com.example.lesson1m5.domain.model.OperationType
import com.example.lesson1m5.domain.repository.CounterRepository
import javax.inject.Inject

class CounterRepositoryImpl @Inject constructor(private val api: EmulateService): CounterRepository {

    override fun increment() {
        api.increment()
    }

    override fun decrement() {
        api.decrement()
    }

    override fun getCount(): CounterEntity {
        val response = api.getCount()
        return CounterEntity(
            operationType = OperationType.fromString(response.operationType),
            count = response.count

        )
    }
}