@file:Suppress("NAME_SHADOWING")

package com.example.pastrypalitel2finalproject

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.pastrypalitel2finalproject.databinding.ActivityProfileBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class Profile : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    private val auth: FirebaseAuth by lazy { FirebaseAuth.getInstance() }
    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get the currently logged-in user
        val currentUser = auth.currentUser

        // Check if user is logged in
        if (currentUser != null) {
            val email = currentUser.email

            binding.edtEmail.text = email
        } else {
            // User is not logged in, handle accordingly (e.g., show a message)
            Log.d("TAG", "No user is currently logged in.")
        }

        binding.imageButton7.setOnClickListener {
            val intent = Intent(this, Homescreen::class.java)
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            val intent = Intent(this, Homescreen::class.java)
            startActivity(intent)
        }

        binding.btnLogout.setOnClickListener {
            // Create a confirmation dialog
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Exit Confirmation")
            builder.setMessage("Do you want to exit?")

            // Add the "OK" button
            builder.setPositiveButton("OK") { _, _ ->
                // User clicked OK, so close the app
                finishAffinity()
            }

            // Add the "Cancel" button
            builder.setNegativeButton("Cancel") { dialog, _ ->
                // User cancelled the dialog
                dialog.dismiss()
            }

            // Create and show the AlertDialog
            val dialog = builder.create()
            dialog.show()
        }
    }
}

