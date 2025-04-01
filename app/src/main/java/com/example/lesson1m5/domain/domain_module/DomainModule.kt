package com.example.lesson1m5.domain.domain_module

import com.example.lesson1m5.domain.usecases.DecrementUseCase
import com.example.lesson1m5.domain.usecases.GetCountUseCase
import com.example.lesson1m5.domain.usecases.IncrementUseCase
import org.koin.dsl.module

val domainModule = module{
    factory { IncrementUseCase(get()) }
    factory { DecrementUseCase(get()) }
    factory { GetCountUseCase(get()) }
}