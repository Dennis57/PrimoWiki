package com.aldtech.primowiki.data.repository

import com.aldtech.primowiki.data.mappers.toCharacterInfo
import com.aldtech.primowiki.data.remote.PrimoWikiApi
import com.aldtech.primowiki.domain.character.CharacterHeaderInfo
import com.aldtech.primowiki.domain.repository.CharacterRepository
import com.aldtech.primowiki.domain.util.Resource
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val api: PrimoWikiApi
): CharacterRepository {

    override suspend fun getCharacterList(): Resource<CharacterHeaderInfo> {
        return try {
            Resource.Success(
                data = api.getCharacterList().toCharacterInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred")
        }
    }
}