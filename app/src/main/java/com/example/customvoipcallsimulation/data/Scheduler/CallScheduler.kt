package com.example.customvoipcallsimulation.data.Scheduler

import android.app.AlarmManager
import android.content.Context
import androidx.core.content.getSystemService

class CallScheduler(
    private val context: Context
) {
    fun ScheduleFakeCall(delayMillis:Long){
        val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager

    }
}