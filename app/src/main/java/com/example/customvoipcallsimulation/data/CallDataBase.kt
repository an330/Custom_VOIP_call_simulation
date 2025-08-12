package com.example.customvoipcallsimulation.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.customvoipcallsimulation.data.local.CallDao
import com.example.customvoipcallsimulation.data.local.CallEntity

@Database(entities =[CallEntity::class] , version = 1)
abstract  class CallDataBase(): RoomDatabase() {
    abstract fun callDao(): CallDao
}