package com.example.pokedex_api_android.api

import android.util.Log
import com.example.pokedex_api_android.api.model.PokemonsApiResult
import com.example.pokedex_api_android.domain.PokemonType
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

object PokemonRepository{
    //https://pokeapi.co/api/v2/pokemon/?limit=151
    private val service: PokemonService

    init{
        val retrofit = Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(PokemonService::class.java)
    }

    fun listPokemons(limit: Int = 151): PokemonsApiResult? {
        val call = service.listPokemons(limit)

        return call.execute().body()
//        call.enqueue(object: Callback<PokemonsApiResult>{
//            override fun onResponse(
//                call: Call<PokemonsApiResult>,
//                response: Response<PokemonsApiResult>
//            ) {
//                if(response.isSuccessful){
//                    val body = response.body()
//
//                    body?.result?.let{
//                        Log.d("POKEMON_API", it[0].name)
//                    }
//                }
//                Log.d("POKEMON_API", "Pokemons list loaded successfully")
//            }
//
//            override fun onFailure(call: Call<PokemonsApiResult>, t: Throwable) {
//                Log.e("POKEMON_API", "Error during pokemons list call response.", t.cause)
//            }
//        })
    }
}

