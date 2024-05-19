package com.example.pastrypalitel2finalproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pastrypalitel2finalproject.databinding.ActivityCupcakeBinding

class Cupcake : AppCompatActivity() {
    private lateinit var binding: ActivityCupcakeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCupcakeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgLogo.setOnClickListener {
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            val intent = Intent (this, Homescreen::class.java)
            startActivity(intent)
        }

        binding.imageButton12.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        binding.btnVanillaCupcake.setOnClickListener {
            startActivity(Intent(this, VanillaCupcake::class.java))
        }

        binding.btnCarrotCupcake.setOnClickListener {
            startActivity(Intent(this, CarrotCupcake::class.java))
        }

        binding.imageButton7.setOnClickListener {
            startActivity(Intent(this, Homescreen::class.java))
        }

    }
}