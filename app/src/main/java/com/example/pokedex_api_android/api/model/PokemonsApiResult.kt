package com.example.pokedex_api_android.api.model

import com.example.pokedex_api_android.domain.Pokemon
import com.example.pokedex_api_android.domain.PokemonType

data class PokemonsApiResult (
    val count: Int,
    val previous: String?,
    val next: String?,
    val results:  List<Pokemon>
)

data class PokemonApiResult(
    val id: Int,
    val name: String,
    val types: PokemonTypeSlot
)

data class PokemonTypeSlot (
    val slot: Int,
    val type: PokemonType
)

