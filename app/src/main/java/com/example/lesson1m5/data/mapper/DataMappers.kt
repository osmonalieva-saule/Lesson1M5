package com.example.lesson1m5.data.mapper

import com.example.lesson1m5.data.model.CounterDto
import com.example.lesson1m5.domain.model.CounterEntity
import com.example.lesson1m5.domain.model.OperationType

fun CounterDto.toDomain (): CounterEntity{
    return CounterEntity(
        count = this.count,
        operationType= OperationType.fromString(this.operationType)
    )
}
fun counterEntityToDto(entity: CounterEntity) : CounterDto {
    return CounterDto(
        count = entity.count,
        operationType = entity.operationType.value
    )
}
