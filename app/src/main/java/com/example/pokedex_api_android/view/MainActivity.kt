package com.example.pokedex_api_android.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex_api_android.R
import com.example.pokedex_api_android.api.PokemonRepository
import com.example.pokedex_api_android.domain.Pokemon
import com.example.pokedex_api_android.domain.PokemonType

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rvPokemons)


//        val Charmander = Pokemon(
//            "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/004.png",
//            4,
//            "Charmander",
//            listOf(
//                PokemonType("Fire")
//            )
//        )
//        val pokemons = listOf(Charmander,Charmander, Charmander,Charmander,Charmander )

        Thread(Runnable {
            loadPokemons()
        }).start()


    }

    private fun loadPokemons() {
        val pokemonsApiResult = PokemonRepository.listPokemons()

        pokemonsApiResult?.results?.let{
            val layoutManager = LinearLayoutManager(this)

            recyclerView.post{
                recyclerView.layoutManager = layoutManager
                recyclerView.adapter = PokemonAdapter(it)
            }
        }

    }
}