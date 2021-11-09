package com.codingwithjks.koindi.Qualifier

import android.util.Log
import org.koin.core.qualifier.named
import org.koin.dsl.module


class Users(val fName:String,val lName:String){

    fun getUser(){
        Log.d("main", "getUser: $fName $lName")
    }
}

fun provideFName():String = "jayant"
fun provideLName():String = "kumar"

val usersModule = module {

    factory(named("fName")){
        provideFName()
    }

    factory(named("lName")) {
        provideLName()
    }

    factory { Users(get(named("fName")),get(named("lName"))) }

}