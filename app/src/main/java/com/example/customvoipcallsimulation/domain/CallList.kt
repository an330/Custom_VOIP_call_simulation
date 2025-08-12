package com.example.customvoipcallsimulation.domain

data class CallList(
    val id:Long,
    val callerName:String ,
    val callerNumber:String,
    val startTimeMillis:Long,
    val endTimeMillis:Long?,
    val type:CallType,
    val durationSeconds:Long
)

enum class CallType {
    MISSED, ANSWERED
}
