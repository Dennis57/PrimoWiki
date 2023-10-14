package com.aldtech.primowiki.presentation.ui.main.character

import androidx.lifecycle.ViewModel
import com.aldtech.primowiki.domain.repository.CharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor(
    private val repository: CharacterRepository
): ViewModel() {

}