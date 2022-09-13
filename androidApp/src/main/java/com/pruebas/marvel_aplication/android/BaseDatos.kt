package com.pruebas.marvel_aplication.android

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Character::class],
    version = 1
)


abstract class BaseDatos : RoomDatabase() {

    abstract fun characterDao(): CharacterDAO
}