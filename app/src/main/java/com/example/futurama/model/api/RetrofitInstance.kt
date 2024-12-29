package com.example.futurama.model.api

import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "https://futuramaapi.com/api/"

    val getCharacterService: GetCharacterService by lazy {
        retrofit.create(GetCharacterService::class.java)
    }

    private val retrofit by lazy {
        retrofit2.Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}