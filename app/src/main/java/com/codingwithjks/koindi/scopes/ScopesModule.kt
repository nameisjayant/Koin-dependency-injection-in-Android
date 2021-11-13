package com.codingwithjks.koindi.scopes

import android.util.Log
import com.codingwithjks.koindi.AnotherActivity
import org.koin.core.annotation.KoinReflectAPI
import org.koin.dsl.module
import org.koin.dsl.scoped

class ComponentA(){
    fun getA()
    {
        Log.d("main", "getA: ")
    }
}

@KoinReflectAPI
val scopeModule = module {
    scope<AnotherActivity>{
        scoped<ComponentA>()
    }
}