package com.example.pastrypalitel2finalproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pastrypalitel2finalproject.databinding.ActivitySeeAllBinding

class SeeAll : AppCompatActivity() {

    private lateinit var binding: ActivitySeeAllBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeeAllBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set click listeners for buttons to navigate to respective activities
        binding.btnCarrotCupcake.setOnClickListener {
            startActivity(Intent(this, CarrotCupcake::class.java))
        }

        binding.btnCroissant.setOnClickListener {
            startActivity(Intent(this, Croissant::class.java))
        }

        binding.btnUbeBreadRolls.setOnClickListener {
            startActivity(Intent(this, UbeBreadRolls::class.java))
        }
        binding.btnVanillaCupcake.setOnClickListener {
            startActivity(Intent(this, VanillaCupcake::class.java))
        }

        binding.btnMatchaCookies.setOnClickListener {
            startActivity(Intent(this, MatchaCookies::class.java))
        }

        binding.btnPutok.setOnClickListener {
            startActivity(Intent(this, Putok::class.java))
        }

        binding.btnPandesal.setOnClickListener {
            startActivity(Intent(this, Pandesal::class.java))
        }

        binding.btnChocolateChipCookies.setOnClickListener {
            startActivity(Intent(this, ChocolateChip::class.java))
        }

        binding.imageButton3.setOnClickListener {
            startActivity(Intent(this, CarrotCupcake::class.java))
        }

        binding.btnBack.setOnClickListener {
            startActivity(Intent(this, Homescreen::class.java))
        }

        binding.imageButton7.setOnClickListener {
            startActivity(Intent(this, Homescreen::class.java))
        }

        binding.imageButton12.setOnClickListener {
            startActivity(Intent(this, Profile::class.java))
        }



    }
}
