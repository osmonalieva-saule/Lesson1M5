package com.example.lesson1m5.domain.model

enum class OperationType(
    val value: String
){
    INCREMENT("increment"),
    DECREMENT("decrement"),
    UNKNOWN("unknown");


    companion object{
        fun fromString(value: String): OperationType{
            return OperationType.entries.find{ value== it.value }?: UNKNOWN
        }
    }

}