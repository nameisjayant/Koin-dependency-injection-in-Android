package com.codingwithjks.roomYT.di

import android.app.Application
import android.service.autofill.UserData
import androidx.room.Room
import com.codingwithjks.koindi.di.providesDao
import com.codingwithjks.roomYT.UserDao
import com.codingwithjks.roomYT.UserDatabase
import org.koin.dsl.module


fun providesDatabase(application: Application):UserDatabase =
    Room.databaseBuilder(application,UserDatabase::class.java,"userdatabase")
        .fallbackToDestructiveMigration()
        .build()

fun provideDao(db:UserDatabase):UserDao = db.getUserDao()

val userDatabaseModule = module {

    single { providesDatabase(get()) }
    single { providesDao(get()) }

}