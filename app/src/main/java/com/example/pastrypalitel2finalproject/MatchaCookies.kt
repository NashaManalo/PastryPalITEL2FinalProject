package com.example.pastrypalitel2finalproject

import MatchaCookiesAdapter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pastrypalitel2finalproject.databinding.ActivityMatchaCookiesBinding

@Suppress("DEPRECATION")
class MatchaCookies : AppCompatActivity() {
    private lateinit var binding: ActivityMatchaCookiesBinding
    private var launchedFromSeeAll = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMatchaCookiesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Check if activity was launched from 'See All' button
        launchedFromSeeAll = intent.getBooleanExtra("launchedFromSeeAll", false)

        // Recipe details
        val recipes = listOf(
            MatchaCookiesItem(
                imageResourceId = R.drawable.matchalong,
                title = getString(R.string.matcha_cookie),
                difficultyLevel = getString(R.string.easy_level),
                description = getString(R.string.short_Description_Matcha), // Consider putting descriptions in strings.xml
                servings = "20 servings", // Similarly, put servings text in strings.xml
                ingredients = """
                    |2 cups + 2 tbsp all purpose flour
                    |1 tsp baking soda
                    |½ tsp salt
                    |1 tbsp matcha powder
                    |1 cup unsalted butter
                    |½ cup granulated sugar
                    |1 cup light brown sugar
                    |1 tsp vanilla extract
                    |2 eggs room temperature
                    |1 cup white chocolate chips
                """.trimMargin(),
                totalTime = "1 hour 30 minutes",
                prepTime = "20 minutes",
                cookTime = "10 minutes",
                instructions = """
                    |1. Brown your butter. Heat your butter over medium heat until it turns a golden yellow color. Pour butter in a heat proof bowl to cool. As the butter cools, it will get darker in color.
                    |2. Combine flour, baking soda, salt, and matcha powder in a medium size mixing bowl. Mix well and set aside.
                    |3. Next add in white sugar and brown sugar to your butter. Mix to combine. Once well combined, add in your eggs and vanilla. Whisk together. Whisk until you get a light and creamy texture (~1 minute). This is the key to getting a crisp and chewy cookie.
                    |4. Once the wet ingredients are well mixed, slowly add in the dry ingredients from step 3. Combine with a spatula until a green dough forms.
                    |5. Add in the white chocolate chips and mix until they are well incorporated.
                    |6. Let the dough rest in the fridge for 1 hour.
                    |7. Preheat oven to 350 degrees F.
                    |8. Cover 2 baking sheets with parchment paper. Use a 3 tablespoon (1.5 oz) ice cream scoop to scoop cookie dough onto baking sheets. Cookies should be 2-3 inches apart.
                    |9. Bake for 10-12 minutes.
                    |10. Let cookies cool for 10 minutes before putting them on a cooling rack.
                    |11. Cool cookies for another 15 minutes before serving.
                """.trimMargin()
            )
        )

        // Setup RecyclerView
        val adapter = MatchaCookiesAdapter(recipes)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        // Navigation to MainActivity
        binding.imageButton7.setOnClickListener {
            val intent = Intent(this, Homescreen::class.java)
            startActivity(intent)
        }

        // Back button handling
        binding.btnBack.setOnClickListener {
            if (launchedFromSeeAll) {
                 // Go back to See All Recipes
                startActivity(Intent(this, SeeAll::class.java))
            } else {
                onBackPressed() // Go back to Main Activity
            }
        }

        binding.imageButton12.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        // Navigate to AboutUs activity
        binding.imgLogo.setOnClickListener {
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }
    }
}
