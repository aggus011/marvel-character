package com.pruebas.marvel_aplication.android

import javax.inject.Inject

interface CharactersRepository {


    suspend fun getCharacters(timestamp: Long, md5: String): List<Character>

}
