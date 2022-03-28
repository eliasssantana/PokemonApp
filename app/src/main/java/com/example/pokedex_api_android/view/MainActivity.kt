package com.example.pokedex_api_android.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex_api_android.R
import com.example.pokedex_api_android.domain.Pokemon

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pokemon_item)

        val recyclerView = findViewById<RecyclerView>(R.id.rvPokemons)

        val layoutManager = LinearLayoutManager(this)

        val pokemons = listOf(Pokemon())

        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = PokemonAdapter(pokemons)
    }
}