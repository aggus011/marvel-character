package com.pruebas.marvel_aplication.android


class CharacterRepository constructor(val characterDAO: CharacterDAO) {

    suspend fun insertCharacter(character: Character){
        characterDAO.insert(character)
    }
}