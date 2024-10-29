package com.example.disasterapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.disasterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView: RecyclerView = binding.rvMovie

        // Daftar film
        val movieList = listOf(
            Movie(R.drawable.rectangle_52, "Venom : The Last Dance", "1h 30m", "R13+"),
            Movie(R.drawable.rectangle_52_1, "DOSA MUSYRIK", "1h 32m", "D17+"),
            Movie(R.drawable.rectangle_52_2, "Inside Out 2", "1h 45m", "7+"),
            Movie(R.drawable.rectangle_52_3, "Transformer One", "1h 45m", "R13+"),

        )

        // Mengatur RecyclerView
        recyclerView.adapter = MovieAdapter(this, movieList)
    }
}
