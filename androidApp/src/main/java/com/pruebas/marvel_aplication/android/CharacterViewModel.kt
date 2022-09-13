package com.pruebas.marvel_aplication.android

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class CharacterViewModel @Inject constructor(
    private val characterRepository: CharacterRepository
) : ViewModel() {
    private val characterList: MutableList<Character> = mutableListOf()

    fun cargarCharacter(){
        
    }
}