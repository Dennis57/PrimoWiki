package com.aldtech.primowiki.presentation.ui.main.character

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aldtech.primowiki.domain.repository.CharacterRepository
import com.aldtech.primowiki.domain.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor(
    private val repository: CharacterRepository
): ViewModel() {

    var state by mutableStateOf(CharacterHeaderState())
        private set

    fun loadCharacterHeaderInfo() {
        viewModelScope.launch {
            state = state.copy(
                isLoading = true,
                error = null
            )

            when(val result = repository.getCharacterList()) {
                is Resource.Success -> {
                    state = state.copy(
                        characterHeaderInfo = result.data,
                        isLoading = false,
                        error = null
                    )
                }

                is Resource.Error -> {
                    state = state.copy(
                        characterHeaderInfo = null,
                        isLoading = false,
                        error = result.message
                    )
                }
            }
        }
    }
}