package com.codingwithjks.koindi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codingwithjks.koindi.container.BaseApplication
import com.codingwithjks.koindi.di.appModule
import com.codingwithjks.koindi.di.interfaceModule
import com.codingwithjks.koindi.di.singletonModule
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startKoin {
            modules(appModule, interfaceModule, singletonModule)
        }
        val baseApp = BaseApplication()
        baseApp.car.getCar()
        baseApp.main.getDemo()
        baseApp.singletonClass.getSingleton()
    }
}
