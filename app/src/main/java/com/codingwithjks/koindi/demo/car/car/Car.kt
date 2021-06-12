package com.codingwithjks.koindi.demo.car.car

import android.util.Log

/*
constructor injection...
 */

class Car constructor(
    private val engine: Engine,
    private val wheel: Wheel
) {

    fun getCar() {
        Log.d("main", " car is running... ")
        engine.getEngine()
        wheel.getWheel()
    }
}