package com.codingwithjks.koindi.di

import android.app.Application
import android.service.autofill.UserData
import androidx.room.Room
import androidx.room.RoomDatabase
import com.codingwithjks.koindi.data.dao.UserDao
import com.codingwithjks.koindi.data.database.UserDatabase
import org.koin.dsl.module


fun providesDatabase(application: Application):UserDatabase =
    Room.databaseBuilder(application,UserDatabase::class.java,"userdatabase")
        .build()

fun providesDao(db:UserDatabase):UserDao = db.userDao()

val roomModule = module {

    single { providesDatabase(get()) }
    single { providesDao(get()) }
}