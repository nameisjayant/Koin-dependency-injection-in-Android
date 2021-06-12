package com.codingwithjks.koindi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.codingwithjks.koindi.container.BaseApplication
import com.codingwithjks.koindi.di.appModule
import com.codingwithjks.koindi.di.interfaceModule
import com.codingwithjks.koindi.di.singletonModule
import com.codingwithjks.koindi.di.viewModelModule
import com.codingwithjks.koindi.ui.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {
    private val mainViewModel:MainViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startKoin {
            modules(appModule, interfaceModule, singletonModule, viewModelModule)
            androidContext(this@MainActivity)
        }


        val baseApp = BaseApplication()
        baseApp.car.getCar()
        baseApp.main.getDemo()
        baseApp.singletonClass.getSingleton()
        mainViewModel.getDemo()

    }
}
