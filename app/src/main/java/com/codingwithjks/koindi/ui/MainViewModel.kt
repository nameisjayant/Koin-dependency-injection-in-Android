package com.codingwithjks.koindi.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.codingwithjks.koindi.demo.car.`interface`.Demo

class MainViewModel
constructor(private val demo: Demo) : ViewModel() {

    fun getDemo() = demo.getDemo()
}