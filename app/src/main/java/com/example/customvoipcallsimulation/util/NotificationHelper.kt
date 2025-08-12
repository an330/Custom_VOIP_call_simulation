package com.example.customvoipcallsimulation.util

import android.content.Context

object NotificationHelper {
    const val CHANNEL_CALLS = "calls_channel"
    const val INCOMING_CALL_ID = 1001
    const val ONGOING_CALL_ID = 1002
    const val MISSED_BASED_ID = 2000

    fun createChannels(ctx:Context){
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            val nm =
        }
    }
}