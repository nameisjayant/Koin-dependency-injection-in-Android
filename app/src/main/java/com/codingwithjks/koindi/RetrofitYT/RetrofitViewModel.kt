package com.codingwithjks.koindi.RetrofitYT

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codingwithjks.roomYT.User
import com.codingwithjks.roomYT.UserDao
import kotlinx.coroutines.launch

class RetrofitViewModel constructor(private val apiService: ApiService,
                                    private val dao:UserDao
) : ViewModel(){

     fun getPost() = viewModelScope.launch {
         apiService.getPost()
    }

    fun insert(user:User) = viewModelScope.launch {
        dao.insert(user)
    }

}