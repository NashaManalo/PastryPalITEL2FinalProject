package com.example.pastrypalitel2finalproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import com.example.pastrypalitel2finalproject.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseAuthInvalidUserException
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

        // Set OnClickListener for the register button
        binding.register.setOnClickListener {
            // Create an Intent to start the RegisterActivity
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.btnlogin.setOnClickListener {
            val email = binding.username.text.toString().trim() // Assuming username field holds email
            val password = binding.password.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Store the email in lowercase for comparison
            val normalizedEmail = email.lowercase()

            auth.signInWithEmailAndPassword(normalizedEmail, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, display toast and navigate to HomeScreen
                        Log.d("TAG", "signInWithEmail:success")
                        Toast.makeText(this, "Login Successful", LENGTH_SHORT).show()
                        val intent = Intent(this, Homescreen::class.java) // Replace with your home screen activity
                        startActivity(intent)
                        finish()
                    } else {
                        // Sign in failed, display a more specific error message
                        Log.w("TAG", "signInWithEmail:failure", task.exception)
                        val exception = task.exception

                        if (exception is FirebaseAuthInvalidUserException) {
                            // Email is not yet registered
                            Toast.makeText(this, "Email is not yet registered.", LENGTH_SHORT).show()
                        } else if (exception is FirebaseAuthInvalidCredentialsException) {
                            val message = exception.message ?: ""
                            if (message.contains("INVALID_EMAIL")) {
                                Toast.makeText(this, "Invalid email format.", LENGTH_SHORT).show()
                            } else {
                                Toast.makeText(this, "Incorrect email or password.", LENGTH_SHORT).show()
                            }
                        } else {
                            // Other error
                            Toast.makeText(this, "Authentication failed.", LENGTH_SHORT).show()
                        }
                    }
                }
        }
    }
}

