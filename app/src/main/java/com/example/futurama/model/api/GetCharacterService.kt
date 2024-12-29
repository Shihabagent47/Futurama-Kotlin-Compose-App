package com.example.futurama.model.api

import com.example.futurama.model.data.CharactersDataResponse
import retrofit2.http.GET

interface GetCharacterService {
    @GET("characters")
    suspend fun getCharacters(): CharactersDataResponse
}