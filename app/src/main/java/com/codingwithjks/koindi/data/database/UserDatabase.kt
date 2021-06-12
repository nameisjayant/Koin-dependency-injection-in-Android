package com.codingwithjks.koindi.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.codingwithjks.koindi.data.dao.UserDao
import com.codingwithjks.koindi.data.model.User

@Database(entities = [User::class],version = 1,exportSchema = false)
abstract class UserDatabase :RoomDatabase(){

    abstract fun userDao():UserDao
}