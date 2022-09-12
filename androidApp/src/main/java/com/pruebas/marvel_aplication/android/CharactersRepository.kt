package com.pruebas.marvel_aplication.android

interface CharactersRepository {

    suspend fun getCharacters(timestamp: Long, md5: String): List<Character>

}