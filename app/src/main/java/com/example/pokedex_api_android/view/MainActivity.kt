package com.example.pokedex_api_android.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex_api_android.R
import com.example.pokedex_api_android.domain.Pokemon
import com.example.pokedex_api_android.domain.PokemonType

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rvPokemons)

        val layoutManager = LinearLayoutManager(this)

        val Charmander = Pokemon(
            "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/004.png",
            4,
            "Charmander",
            listOf(
                PokemonType("Fire")
            )
        )
        val pokemons = listOf(Charmander,Charmander, Charmander,Charmander,Charmander )

        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = PokemonAdapter(pokemons)
    }
}