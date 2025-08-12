package com.example.customvoipcallsimulation.domain

import com.example.customvoipcallsimulation.data.local.CallEntity
import kotlinx.coroutines.flow.Flow

interface CallRepository {
    suspend fun addCall(call:CallEntity):Long
    fun getAllCalls():Flow<List<CallEntity>>
}