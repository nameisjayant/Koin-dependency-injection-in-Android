package com.codingwithjks.koindi.di

import com.codingwithjks.koindi.demo.car.car.Car
import com.codingwithjks.koindi.demo.car.car.Engine
import com.codingwithjks.koindi.demo.car.car.Wheel
import com.codingwithjks.koindi.demo.car.`interface`.Main
import org.koin.dsl.module

val appModule = module {

    factory { Engine() }
    factory { Wheel() }
    factory { Car(get(), get()) }


}

val interfaceModule = module {
    factory { Main(get()) }
}