package com.example.pastrypalitel2finalproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pastrypalitel2finalproject.databinding.ActivityBreadBinding

class Bread : AppCompatActivity() {
    private lateinit var binding: ActivityBreadBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBreadBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnBack.setOnClickListener {
            val intent = Intent (this, Homescreen::class.java)
            startActivity(intent)
        }

        binding.btnCroissant.setOnClickListener {
            startActivity(Intent(this, Croissant::class.java))
        }


        binding.btnUbeBreadRolls.setOnClickListener {
            startActivity(Intent(this, UbeBreadRolls::class.java))
        }


        binding.btnPutok.setOnClickListener {
            startActivity(Intent(this, Putok::class.java))
        }


        binding.btnPandesal.setOnClickListener {
            startActivity(Intent(this, Pandesal::class.java))
        }


        binding.imageButton7.setOnClickListener {
            startActivity(Intent(this, Homescreen::class.java))
        }


        binding.imageButton12.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}