package com.example.pastrypalitel2finalproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pastrypalitel2finalproject.databinding.ActivityAboutUsBinding

class AboutUs : AppCompatActivity() {
    private lateinit var binding: ActivityAboutUsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutUsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val description = "Welcome to PastryPal, your ultimate destination for delightful and handcrafted pastries. Our passion for baking stems from a love for creating moments of joy through delectable treats. At PastryPal, we believe that every bite should be a delightful experience, whether you’re indulging in our flaky croissants, rich and decadent cakes, or our melt-in-your-mouth cookies. Our journey began with a simple goal: to bring the finest, most exquisite pastries to your doorstep. We use only the highest quality ingredients, sourced both locally and globally, to ensure that each pastry is a masterpiece of flavor and texture. Our talented team of bakers and pastry chefs are dedicated to perfecting every recipe, combining traditional techniques with innovative flavors to surprise and delight your taste buds. We pride ourselves on our commitment to excellence and customer satisfaction. Whether you're celebrating a special occasion or simply treating yourself, PastryPal offers a wide range of options to suit every palate. Our easy-to-navigate online shop allows you to browse and order your favorite treats from the comfort of your home, with convenient delivery options to make your experience seamless. Join us at PastryPal, where every pastry is crafted with love, passion, and a touch of sweetness. Discover the joy of indulgence and let us be a part of your sweetest moments."

        binding.textView2.setText(description)

        binding.btnBack.setOnClickListener(){
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.imageButton7.setOnClickListener(){
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.imageButton12.setOnClickListener(){
            val intent = Intent (this, Profile::class.java)
            startActivity(intent)
        }

    }
}
