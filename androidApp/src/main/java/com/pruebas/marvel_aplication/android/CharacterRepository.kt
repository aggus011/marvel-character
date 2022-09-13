package com.pruebas.marvel_aplication.android

import javax.inject.Inject


class CharacterRepository @Inject constructor(val characterDAO: CharacterDAO) {

    suspend fun insertCharacter(list: MutableList<Character>) {
        for (i in list)
            characterDAO.insert(i)
    }
}