@file:Suppress("NAME_SHADOWING")

package com.example.pastrypalitel2finalproject

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatActivity
import com.example.pastrypalitel2finalproject.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidUserException
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    private lateinit var auth: FirebaseAuth
    private lateinit var db: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize Firebase Authentication
        auth = Firebase.auth
        db = FirebaseFirestore.getInstance()

        binding.Account.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finishAffinity()
        }

        // Set OnClickListener for the register button
        binding.button2.setOnClickListener {
            val email = binding.email.text.toString().trim()
            val password = binding.editText2.text.toString().trim()
            val confirmPassword = binding.confirmpassword.text.toString().trim()

            if (email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (password != confirmPassword) {
                Toast.makeText(this, "Passwords do not match", LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Use createUserWithEmailAndPassword for registration
            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Registration successful
                        Log.d("TAG", "createUserWithEmailAndPassword:success")
                        Toast.makeText(this, "Registration successful!", LENGTH_SHORT).show()

                        binding.email.text.toString().trim()
                        binding.editText.text.toString().trim()

                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)

                    } else {
                        // Registration failed, display error message
                        val exception = task.exception
                        if (exception is FirebaseAuthInvalidUserException) {
                            // Email is already in use
                            Toast.makeText(this, "Email is already in use.", LENGTH_SHORT).show()
                        } else {
                            // Other error
                            Toast.makeText(this, "Registration failed.", LENGTH_SHORT).show()
                        }
                    }
                }
        }
    }
}
