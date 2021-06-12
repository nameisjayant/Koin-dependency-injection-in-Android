package com.codingwithjks.koindi.di

import com.codingwithjks.koindi.demo.car.singleton.SingletonClass
import org.koin.dsl.module

val singletonModule = module {
    single { SingletonClass() }
}