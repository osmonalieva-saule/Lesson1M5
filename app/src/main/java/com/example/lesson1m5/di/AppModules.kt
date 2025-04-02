package com.example.lesson1m5.di

import com.example.lesson1m5.data.data_module.dataModule
import com.example.lesson1m5.domain.domain_module.domainModule
import com.example.lesson1m5.presentation.presentation_module.PresentationModule

val appModule = listOf(
    dataModule,
    domainModule,
    PresentationModule,
    networkModule,

)