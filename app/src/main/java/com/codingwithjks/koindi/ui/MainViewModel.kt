package com.codingwithjks.koindi.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.codingwithjks.koindi.data.model.User
import com.codingwithjks.koindi.data.repository.MainRepository
import com.codingwithjks.koindi.demo.car.`interface`.Demo
import kotlinx.coroutines.launch

class MainViewModel
constructor(private val demo: Demo,private val mainRepository: MainRepository) : ViewModel() {

    fun getDemo() = demo.getDemo()
    fun getPost() = mainRepository.getPost()

    fun insert(user: User) = viewModelScope.launch {
        mainRepository.insert(user)
    }

    val getAllUser = mainRepository.getAllUsers
}