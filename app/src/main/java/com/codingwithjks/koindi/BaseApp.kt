package com.codingwithjks.koindi

import android.app.Application
import com.codingwithjks.koindi.Qualifier.usersModule
import com.codingwithjks.koindi.RetrofitYT.retrofitBuilderModule
import com.codingwithjks.koindi.di.*
import com.codingwithjks.roomYT.di.userDatabaseModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.koinApplication

class BaseApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                appModule, interfaceModule, singletonModule, viewModelModule, retrofitModule,
                roomModule, bindsModule, retrofitBuilderModule, userDatabaseModule, usersModule
            )
            androidContext(this@BaseApp)
        }

//
//        koinApplication {
//            modules(
//                appModule, interfaceModule, singletonModule, viewModelModule, retrofitModule,
//                roomModule, bindsModule
//            )
//            androidContext(this@BaseApp)
//        }

    }
}