package com.pruebas.marvel_aplication.android

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CharacterDAO {

    @Query("SELECT * FROM saved_character")
    fun getAll(): List<Character>

    @Query("SELECT * FROM saved_character")
    suspend fun getSuspend(): List<Character>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(character: Character)

}