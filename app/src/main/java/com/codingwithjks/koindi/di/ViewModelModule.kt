package com.codingwithjks.koindi.di

import com.codingwithjks.koindi.demo.car.`interface`.Demo
import com.codingwithjks.koindi.demo.car.`interface`.DemoImpl
import com.codingwithjks.koindi.ui.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    single<Demo>{DemoImpl()}
    viewModel { MainViewModel(get()) }
}