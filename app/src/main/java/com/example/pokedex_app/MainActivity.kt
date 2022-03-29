package com.example.pokedex_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pokedex_app.ui.pokeinfo.pokelist.PokeListActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonIntent.setOnClickListener{
            startActivity(Intent(this,PokeListActivity::class.java));
        }



    }

}