package com.codingwithjks.koindi.data.repository

import com.codingwithjks.koindi.data.dao.UserDao
import com.codingwithjks.koindi.data.model.Post
import com.codingwithjks.koindi.data.model.User
import com.codingwithjks.koindi.retrofit.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext

class MainRepository constructor(
    private val apiService: ApiService,
    private val userDao: UserDao
) {

    fun getPost(): Flow<List<Post>> = flow {
        emit(apiService.getPost())
    }.flowOn(Dispatchers.IO)

    suspend fun insert(user: User) = withContext(Dispatchers.IO) {
        userDao.insert(user)
    }

    val getAllUsers = userDao.getAllUsers()
}