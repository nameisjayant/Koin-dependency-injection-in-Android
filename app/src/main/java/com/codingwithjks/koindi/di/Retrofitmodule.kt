package com.codingwithjks.koindi.di

import com.codingwithjks.koindi.data.repository.MainRepository
import com.codingwithjks.koindi.retrofit.providesApiService
import com.codingwithjks.koindi.retrofit.providesMoshi
import com.codingwithjks.koindi.retrofit.providesRetrofitBuilder
import org.koin.dsl.module

val retrofitModule = module {
    single { providesMoshi() }
    single { providesRetrofitBuilder(get()) }
    single { providesApiService(get()) }
    factory { MainRepository(get(),get()) }

}