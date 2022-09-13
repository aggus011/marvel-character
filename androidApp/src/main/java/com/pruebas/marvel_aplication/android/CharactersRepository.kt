package com.pruebas.marvel_aplication.android

import javax.inject.Inject

interface CharactersRepository {

    @Inject
    var myClass:CharacterDAO

    suspend fun getCharacters(timestamp: Long, md5: String): List<Character>

}
