package com.example.pokedex_api_android.api

import com.example.pokedex_api_android.domain.PokemonType

data class PokemonRepository(
    val imageUrl: String,
    val number: Int,
    val name: String,
    val types: List<PokemonType>
)

