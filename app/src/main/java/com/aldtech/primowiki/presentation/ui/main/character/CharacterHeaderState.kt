package com.aldtech.primowiki.presentation.ui.main.character

import com.aldtech.primowiki.domain.character.CharacterHeaderInfo

data class CharacterHeaderState(
    val characterHeaderInfo: CharacterHeaderInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)