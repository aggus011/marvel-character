package com.pruebas.marvel_aplication.android

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class CharactersViewModel (
    private val charactersService: CharactersService
) : ViewModel() {

    private val _screenState: MutableStateFlow<ScreenState> = MutableStateFlow(ScreenState.Loading)
    val screenState: Flow<ScreenState> = _screenState
    private lateinit var list: List<Character>

    private val coroutineExceptionHandler =
        CoroutineExceptionHandler { coroutineContext, throwable ->
            Log.d("CharactersViewModel", "Error retrieving characters: ${throwable.message}")
        }

    init {
        viewModelScope.launch(coroutineExceptionHandler) {
            list = charactersService.getCharacters()
            _screenState.value = ScreenState.ShowCharacters(list)
        }
    }

}

sealed class ScreenState {

    object Loading : ScreenState()

    class ShowCharacters(val list: List<Character>) : ScreenState()
}