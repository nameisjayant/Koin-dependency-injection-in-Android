package com.codingwithjks.koindi.di

import com.codingwithjks.koindi.demo.car.`interface`.MainUser
import com.codingwithjks.koindi.demo.car.`interface`.UserImpl
import com.codingwithjks.koindi.demo.car.`interface`.UserOne
import com.codingwithjks.koindi.demo.car.`interface`.UserTwo
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module

val bindsModule = module {

    factory { UserImpl() } binds arrayOf(UserOne::class,UserTwo::class)
    factory { MainUser(get(),get()) }
    //factory<UserOne>{ UserImpl() }
   // factory { UserImpl() as UserOne }
}