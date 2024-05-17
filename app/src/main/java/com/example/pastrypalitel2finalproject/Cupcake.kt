package com.example.pastrypalitel2finalproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pastrypalitel2finalproject.databinding.ActivityCupcakeBinding

@Suppress("DEPRECATION")
class Cupcake : AppCompatActivity() {
    private lateinit var binding: ActivityCupcakeBinding

    private var launchedFromSeeAll = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCupcakeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        launchedFromSeeAll = intent.getBooleanExtra("launchedFromSeeAll", false)

        binding.imgLogo.setOnClickListener {
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            if (launchedFromSeeAll) {
                onBackPressed() // Go back to See All Recipes
            } else {
                startActivity(Intent(this, MainActivity::class.java)) // Go back to Main Activity
            }
        }

        binding.imageButton12.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
        binding.btnVanillaCupcake.setOnClickListener {
            startActivity(Intent(this, VanillaCupcake::class.java))
        }

        binding.btnVanillaCupcake.setOnClickListener {
            val intent = Intent(this, VanillaCupcake::class.java)
            intent.putExtra("launchedFromSeeAll", true)
            startActivity(intent)
        }

        binding.btnCarrotCupcake.setOnClickListener {
            startActivity(Intent(this, CarrotCupcake::class.java))
        }

        binding.btnCarrotCupcake.setOnClickListener(){
            val intent = Intent (this, CarrotCupcake::class.java)
            intent.putExtra("launchedFromSeeAll", true)
            startActivity(intent)
        }
    }
}