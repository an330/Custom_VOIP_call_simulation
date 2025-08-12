package com.example.customvoipcallsimulation.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.customvoipcallsimulation.data.CallDataBase
import com.example.customvoipcallsimulation.data.local.CallDao
import com.example.customvoipcallsimulation.data.repositoryImpl.CallRepositoryImpl
import com.example.customvoipcallsimulation.domain.CallRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Singleton
    @Provides
    fun provideDataBase(@ApplicationContext cntxt:Context):CallDataBase = Room.databaseBuilder(cntxt,CallDataBase::class.java,"call_logs").build()

    @Provides
    fun provideDao(db:CallDataBase) :CallDao = db.callDao()

    @Provides
    fun provideRepository(dao: CallDao):CallRepository = CallRepositoryImpl(dao)

}