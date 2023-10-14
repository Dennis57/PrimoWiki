package com.aldtech.primowiki.domain.repository

import com.aldtech.primowiki.domain.character.CharacterHeaderInfo
import com.aldtech.primowiki.domain.util.Resource

interface CharacterRepository {
    suspend fun getCharacterList(): Resource<CharacterHeaderInfo>
}