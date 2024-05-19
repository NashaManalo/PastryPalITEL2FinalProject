package com.example.pastrypalitel2finalproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pastrypalitel2finalproject.databinding.ActivityCookieBinding

class Cookie : AppCompatActivity() {
    private lateinit var binding: ActivityCookieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCookieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            val intent = Intent(this, Homescreen::class.java) // Navigate to Homescreen
            startActivity(intent)
        }

        binding.btnChocolateChipCookies.setOnClickListener {
            val intent = Intent (this, ChocolateChip::class.java)
            startActivity(intent)
        }

        binding.btnMatchaCookies.setOnClickListener {
            val intent = Intent (this, MatchaCookies::class.java)
            startActivity(intent)
        }

        binding.imageButton7.setOnClickListener {
            val intent = Intent (this, Homescreen::class.java)
            startActivity(intent)
        }

        binding.imageButton12.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

    }
}