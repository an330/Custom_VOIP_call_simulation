package com.example.customvoipcallsimulation.data.repositoryImpl

import com.example.customvoipcallsimulation.data.local.CallDao
import com.example.customvoipcallsimulation.data.local.CallEntity
import com.example.customvoipcallsimulation.data.mapper.toDomain
import com.example.customvoipcallsimulation.domain.CallRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

abstract class CallRepositoryImpl @Inject constructor(
     private val dao: CallDao
):CallRepository {
    override suspend fun addCall(call: CallEntity): Long {
        dao.insert(call.toEntity())
    }

    override fun getAllCalls(): Flow<List<CallEntity>> {
        dao.getAll().map { it.toDomain() }
    }

}