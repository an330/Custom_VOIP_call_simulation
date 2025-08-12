package com.example.customvoipcallsimulation.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface CallDao {
    @Insert
    suspend fun insert(call:CallEntity)

    @Query("SELECT * FROM call_logs ORDER BY startTimeMillis DESC ")
     fun getAll(): Flow<List<CallEntity>>
}