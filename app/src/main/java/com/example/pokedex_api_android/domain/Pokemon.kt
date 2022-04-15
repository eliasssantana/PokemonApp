package com.example.pokedex_api_android.domain

data class Pokemon(
        val number: Int,
        val name: String,
        val types: List<PokemonType>
){
        val formattedName = name.replaceFirstChar { it.titlecase() }
        val formattedNumber = number.toString().padStart(3,'0')
        val imageUrl = "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/$formattedNumber.png"

}