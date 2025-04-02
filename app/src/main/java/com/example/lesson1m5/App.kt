package com.example.lesson1m5

import android.app.Application
import com.example.lesson1m5.data.data_module.dataModule
import com.example.lesson1m5.di.appModule
import com.example.lesson1m5.domain.domain_module.domainModule
import com.example.lesson1m5.presentation.presentation_module.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin


class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(appModule)

        }
    }
}
