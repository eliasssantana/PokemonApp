package com.example.pokedex_api_android.domain

data class Pokemon (
        val imageUrl: String,
        val number: Int,
        val name: String,
        val types: List<PokemonType>
){
        val formattedNumber = number.toString().padStart(3,'0')
}