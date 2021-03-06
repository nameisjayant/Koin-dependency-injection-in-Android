package com.codingwithjks.koindi.container

import com.codingwithjks.koindi.Qualifier.Users
import com.codingwithjks.koindi.data.repository.MainRepository
import com.codingwithjks.koindi.demo.car.`interface`.Demo
import com.codingwithjks.koindi.demo.car.`interface`.DemoImpl
import com.codingwithjks.koindi.demo.car.`interface`.Main
import com.codingwithjks.koindi.demo.car.`interface`.MainUser
import com.codingwithjks.koindi.demo.car.car.Car
import com.codingwithjks.koindi.demo.car.car.Engine
import com.codingwithjks.koindi.demo.car.car.Wheel
import com.codingwithjks.koindi.demo.car.singleton.SingletonClass
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.component.inject


class BaseApplication() : KoinComponent{

   // override val scope: Scope  by lazy { newScope(this) }
    /*
    lazily initialisation
     */
    val car: Car by inject()
    val engine: Engine by inject()
    val wheel: Wheel by inject()
    val demoImpl:DemoImpl by inject()
    val main:Main by inject()
    val demo:Demo by inject()
    val mainRepository:MainRepository by inject()
    val mainUser:MainUser by inject()
    val users:Users by inject()
    /*
    eagerly initialisation
     */
    val singletonClass:SingletonClass = get()
}