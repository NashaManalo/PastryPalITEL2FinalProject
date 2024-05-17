package com.example.pastrypalitel2finalproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pastrypalitel2finalproject.databinding.ActivitySeeAllBinding

@Suppress("DEPRECATION")
class SeeAll : AppCompatActivity() {

    private lateinit var binding: ActivitySeeAllBinding

    private var launchedFromSeeAll = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySeeAllBinding.inflate(layoutInflater)
        setContentView(binding.root)

        launchedFromSeeAll = intent.getBooleanExtra("launchedFromSeeAll", false)

        // Set click listeners for buttons to navigate to respective activities
        binding.btnCarrotCupcake.setOnClickListener {
            startActivity(Intent(this, CarrotCupcake::class.java))
        }

        binding.btnCarrotCupcake.setOnClickListener {
            val intent = Intent(this, CarrotCupcake::class.java)
            intent.putExtra("launchedFromSeeAll", true) // Assuming you want to set this as true when coming from SeeAll
            startActivity(intent)
        }

        binding.btnCroissant.setOnClickListener {
            startActivity(Intent(this, Croissant::class.java))
        }

        binding.btnCroissant.setOnClickListener {
            val intent = Intent(this, Croissant::class.java)
            intent.putExtra("launchedFromSeeAll", true)
            startActivity(intent)
        }

        binding.btnUbeBreadRolls.setOnClickListener {
            startActivity(Intent(this, UbeBreadRolls::class.java))
        }

        binding.btnUbeBreadRolls.setOnClickListener {
            val intent = Intent(this, UbeBreadRolls::class.java)
            intent.putExtra("launchedFromSeeAll", true)
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

        binding.btnMatchaCookies.setOnClickListener {
            startActivity(Intent(this, MatchaCookies::class.java))
        }

        binding.btnMatchaCookies.setOnClickListener {
            val intent = Intent(this, MatchaCookies::class.java)
            intent.putExtra("launchedFromSeeAll", true)
            startActivity(intent)
        }

        binding.btnPutok.setOnClickListener {
            startActivity(Intent(this, Putok::class.java))
        }

        binding.btnPutok.setOnClickListener(){
            val intent = Intent (this, Putok::class.java)
            intent.putExtra("launchedFromSeeAll", true)
            startActivity(intent)
        }

        binding.btnPandesal.setOnClickListener {
            startActivity(Intent(this, Pandesal::class.java))
        }

        binding.btnPandesal.setOnClickListener(){
            val intent = Intent (this, Pandesal::class.java)
            intent.putExtra("launchedFromSeeAll", true)
            startActivity(intent)
        }

        binding.btnChocolateChipCookies.setOnClickListener {
            startActivity(Intent(this, ChocolateChip::class.java))
        }

        binding.btnChocolateChipCookies.setOnClickListener(){
            val intent = Intent (this, ChocolateChip::class.java)
            intent.putExtra("launchedFromSeeAll", true)
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            startActivity(Intent(this, AboutUs::class.java))
        }


        binding.imageButton3.setOnClickListener {
            startActivity(Intent(this, CarrotCupcake::class.java))
        }

        binding.btnBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.imageButton7.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.imageButton12.setOnClickListener {
            startActivity(Intent(this, Profile::class.java))
        }



    }
}
