package com.pruebas.marvel_aplication.android

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class InyeccionDependencias {
    @Singleton
    @Provides
    fun provideDataBase(@ApplicationContext app: Context) =
        Room.databaseBuilder(app, BaseDatos::class.java, "DataBase").build()

    @Singleton
    @Provides
    fun providePersonDao(bd: BaseDatos): CharacterDAO {
        return bd.characterDao()
    }

    @Singleton
    @Provides
    fun providePersonaRepository(characterDAO:CharacterDAO):CharacterRepository{
        return CharacterRepository(characterDAO)
    }
}