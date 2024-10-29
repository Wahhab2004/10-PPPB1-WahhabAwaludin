package com.example.disasterapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.disasterapp.databinding.DetailMovieBinding

class DetailMovieActivity: AppCompatActivity() {
    private lateinit var binding: DetailMovieBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengambil data
        val image = intent.getIntExtra("imageResId", 0) ?: "Empty"
        val title = intent.getStringExtra("title") ?: "123"
        val duration = intent.getStringExtra("duration") ?: "Empty"
        val ageGroup = intent.getStringExtra("ageGroup") ?: "Empty"


        // Menetapkan value pada image, title, duration, ageGroup
        binding.imageMovieDetail.setImageResource(image as Int)
        binding.titleMovieDetail.text = title
        binding.durasiDetailMovie.text = duration
        binding.ageGroupDetailMovie.text = ageGroup
    }

}