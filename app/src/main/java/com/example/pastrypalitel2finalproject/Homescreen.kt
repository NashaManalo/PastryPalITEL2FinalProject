package com.example.pastrypalitel2finalproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pastrypalitel2finalproject.databinding.ActivityHomescreenBinding


class Homescreen : AppCompatActivity() {
    private lateinit var binding: ActivityHomescreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomescreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setting up button click listeners
        binding.btnUbeBreadRolls.setOnClickListener {
            val intent = Intent(this, UbeBreadRolls::class.java)
            startActivity(intent)
        }

        binding.btnCroissant.setOnClickListener {
            val intent = Intent(this, Croissant::class.java)
            startActivity(intent)
        }

        binding.btnPutok.setOnClickListener {
            val intent = Intent(this, Putok::class.java)
            startActivity(intent)
        }

        binding.btnCarrotCupcake.setOnClickListener {
            val intent = Intent(this, CarrotCupcake::class.java)
            startActivity(intent)
        }

        binding.btnPandesal.setOnClickListener {
            val intent = Intent(this, Pandesal::class.java)
            startActivity(intent)
        }

        binding.btnVanillaCupcake.setOnClickListener {
            val intent = Intent(this, VanillaCupcake::class.java)
            startActivity(intent)
        }

        binding.btnCupcake.setOnClickListener {
            val intent = Intent(this, Cupcake::class.java)
            startActivity(intent)
        }

        binding.btnBread.setOnClickListener {
            val intent = Intent(this, Bread::class.java)
            startActivity(intent)
        }

        binding.btnCookie.setOnClickListener {
            val intent = Intent(this, Cookie::class.java)
            startActivity(intent)
        }


        binding.btnSeeAllFeatured.setOnClickListener {
            val intent = Intent(this, SeeAll::class.java)
            startActivity(intent)
        }

        binding.imageButton12.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        binding.imgLogo.setOnClickListener {
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }
    }

}
