package com.aldtech.primowiki.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface PrimoWikiApi {

    @GET("characters")
    suspend fun getCharacterList(): CharacterHeaderDto
}