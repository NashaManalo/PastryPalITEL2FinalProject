package com.example.pastrypalitel2finalproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pastrypalitel2finalproject.databinding.ActivityCookieBinding

class Cookie : AppCompatActivity() {
    private lateinit var binding: ActivityCookieBinding

    private var launchedFromSeeAll = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCookieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        launchedFromSeeAll = intent.getBooleanExtra("launchedFromSeeAll", false)

        binding.btnBack.setOnClickListener(){
            val intent = Intent (this, MainActivity::class.java)
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

        binding.btnMatchaCookies.setOnClickListener {
            startActivity(Intent(this, MatchaCookies::class.java))
        }

        binding.btnMatchaCookies.setOnClickListener {
            val intent = Intent(this, MatchaCookies::class.java)
            intent.putExtra("launchedFromSeeAll", true)
            startActivity(intent)
        }

        binding.imageButton7.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}