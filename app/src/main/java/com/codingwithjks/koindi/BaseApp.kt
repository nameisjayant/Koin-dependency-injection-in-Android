package com.codingwithjks.koindi

import android.app.Application
import com.codingwithjks.koindi.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class BaseApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                appModule, interfaceModule, singletonModule, viewModelModule, retrofitModule,
                roomModule
            )
            androidContext(this@BaseApp)
        }
    }
}