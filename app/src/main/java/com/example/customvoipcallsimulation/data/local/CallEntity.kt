package com.example.customvoipcallsimulation.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "call_logs")
data class CallEntity(
    @PrimaryKey(autoGenerate = true) val id:Long =0,
    val callerName:String ,
    val callerNumber:String,
    val startTimeMillis:Long,
    val endTimeMillis:Long?,
    val type:String,
    val durationSeconds:Long
)