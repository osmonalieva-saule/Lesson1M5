package com.example.lesson1m5.data.data_module

import com.example.lesson1m5.data.datasourse.EmulateService
import com.example.lesson1m5.data.repository.CounterRepositoryImpl
import com.example.lesson1m5.domain.repository.CounterRepository
import org.koin.core.module.Module
import org.koin.dsl.module

val dataModule: Module = module {
    single<CounterRepository> {
        CounterRepositoryImpl(get())
    }
    single { EmulateService() }
}


