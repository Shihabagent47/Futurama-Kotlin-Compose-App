package com.example.futurama.model.repository

import com.example.futurama.model.api.RetrofitInstance
import com.example.futurama.model.data.CharactersDataResponse

class ApiRepository {
    private val getCharacterService = RetrofitInstance.getCharacterService

    suspend fun getCharacters(): CharactersDataResponse {
        return getCharacterService.getCharacters()
    }

}