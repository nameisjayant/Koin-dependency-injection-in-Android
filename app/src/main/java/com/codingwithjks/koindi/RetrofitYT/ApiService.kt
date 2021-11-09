package com.codingwithjks.koindi.RetrofitYT

import retrofit2.http.GET

interface ApiService {

    companion object{
        const val Base_URL = "https://jsonplaceholder.typicode.com/"
    }

    @GET("/post")
    suspend fun getPost():List<Post>
}