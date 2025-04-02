package com.example.lesson1m5.data.model

import com.google.gson.annotations.SerializedName

data class CounterDto (
    @SerializedName("operationType")
    val operationType: String,
    val count: Int,
)