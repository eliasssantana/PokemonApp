package com.example.pokedex_api_android.api

import com.example.pokedex_api_android.api.model.PokemonApiResult
import com.example.pokedex_api_android.api.model.PokemonsApiResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonService {
    @GET("pokemon")
    fun listPokemons(@Query("limit") limit: Int): Call<PokemonsApiResult>

    @GET("pokemon/{id}")
    fun getPokemon(id: Int): Call<PokemonApiResult>
}