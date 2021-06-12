package com.codingwithjks.koindi.demo.car.`interface`

import android.util.Log

/*
interface dependency through koin...
 */

interface Demo{
    fun getDemo()
}

class DemoImpl : Demo{
    override fun getDemo() {
        Log.d("main", "This is demo interface: ")
    }
}

class Main constructor(private val demo:Demo){
    fun getDemo() = demo.getDemo()
}

