package com.codingwithjks.koindi.demo.car.`interface`

import android.util.Log


interface UserOne{
    fun getUserOne()
}

interface UserTwo{
    fun getUserTwo()
}

class UserImpl : UserOne,UserTwo{

    override fun getUserOne() {
        Log.d("main", "User one")
    }

    override fun getUserTwo() {
        Log.d("main", "User Two ")
    }

}

class MainUser(private val userOne: UserOne,private val userTwo: UserTwo){
    fun getAllUser(){
        userOne.getUserOne()
        userTwo.getUserTwo()
    }
}
