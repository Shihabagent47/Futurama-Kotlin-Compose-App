package com.example.futurama.model.data

data class CharactersDataResponse(
    val items: List<Item>,
    val page: Int,
    val pages: Int,
    val size: Int,
    val total: Int
)