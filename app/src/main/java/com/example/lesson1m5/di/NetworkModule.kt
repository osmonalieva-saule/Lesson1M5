package com.example.lesson1m5.di

import com.example.lesson1m5.data.datasourse.network.ApiService
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.core.scope.get
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val networkModule = module {
    single { provideRetrofit(OkHttpClient = get(), jsonConverter = get())
    }
    single{
        provideApiService(retrofit = get())
    }
    single { provideLoggingInterceptor() }
    single { provideOkHttpClient(loggingInterceptor = get()) }
}

fun provideRetrofit(): Retrofit {
    return Retrofit.Builder()
        .client(OkHttpClient)
        .baseUrl("http")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}
fun provideApiService(retrofit: Retrofit): ApiService{
    return retrofit.create(ApiService::class.java)
}
fun provideOkHttpClient(loggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
    return OkHttpClient.Builder()
        .callTimeout(15, TimeUnit.SECONDS)
        .writeTimeout(5, TimeUnit.SECONDS)
        .readTimeout(5, TimeUnit.SECONDS)
        .connectTimeout(5, TimeUnit.SECONDS)
        .retryOnConnectionFailure(true)
        .addInterceptor(loggingInterceptor)
        .build()
}
}
fun provideLoggingInterceptor(): HttpLoggingInterceptor {
    return HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }
}

