package com.example.customvoipcallsimulation.data.mapper

import com.example.customvoipcallsimulation.data.local.CallEntity
import com.example.customvoipcallsimulation.domain.CallList
import com.example.customvoipcallsimulation.domain.CallType


fun CallEntity.toDomain(): CallList {
    return CallList(
        id = id,
        callerName = callerName,
        callerNumber = callerNumber,
        startTimeMillis = startTimeMillis,
        endTimeMillis = endTimeMillis,
        type = CallType.valueOf(type),
        durationSeconds = durationSeconds
    )
}

fun CallList.toEntity():CallEntity{
    return CallEntity(
        id = id,
        callerName = callerName,
        callerNumber = callerNumber,
        startTimeMillis = startTimeMillis,
        endTimeMillis = endTimeMillis,
        type = type.name,
        durationSeconds = durationSeconds
    )
}
