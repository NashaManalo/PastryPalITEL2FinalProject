package com.example.pastrypalitel2finalproject

import VanillaCupcakeAdapter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pastrypalitel2finalproject.databinding.ActivityVanillaCupcakeBinding

@Suppress("DEPRECATION")
class VanillaCupcake : AppCompatActivity() {
    private lateinit var binding: ActivityVanillaCupcakeBinding

    private var launchedFromSeeAll = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVanillaCupcakeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        launchedFromSeeAll = intent.getBooleanExtra("launchedFromSeeAll", false)

        val recipes = listOf(
            VanillaCupcakeItem(
                imageResourceId = R.drawable.vanillacupcakelong,
                title = getString(R.string.vanilla_cupcake),
                difficultyLevel = getString(R.string.easy_level),
                description = "\tVanilla cupcakes are classic treats loved for their delicate flavor and moist, tender crumb. They're versatile and can be decorated in countless ways, making them a favorite for celebrations or simple indulgences.",
                servings = "12 servings",
                ingredients = """
1 1/4 cups all-purpose flour
1 1/4 tsp baking powder
1/2 tsp salt
1/2 cup unsalted butter, softened
3/4 cup sugar
2 large eggs, room temperature
2 tsp pure vanilla extract
1/2 cup buttermilk, or plain kefir, room temperature
""".trimIndent(),
                totalTime = "30 minutes",
                prepTime = "8 minutes",
                cookTime = "22 minutes",
                instructions = """
1. Preheat the oven to 350°F and line a cupcake/muffin pan with cupcake liners.

2. In a medium bowl, whisk together 1 1/4 cups flour, 1 1/4 tsp baking powder, and 1/2 tsp salt. Set flour mix aside.

3. In the bowl of an electric mixer, beat butter and sugar on medium-high speed 5 minutes until thick and fluffy, scraping down the bowl as needed.

4. Add eggs one at a time, beating well with each addition then scrape down the bowl. Add 2 tsp vanilla and beat to combine.

5. Reduce mixer speed to medium and add the flour mixture in thirds alternating with the buttermilk, mixing to incorporate with each addition. Scrape down the bowl as needed and beat until just combined and smooth, and don't overmix. Divide the batter evenly into a 12-count lined muffin or cupcake pan, filling 2/3 full.

6. Bake for 20-23 minutes at 350 °F, or until a toothpick inserted in the center comes out clean. Let them cool in the pan for 5 minutes, then transfer to a wire rack and cool to room temperature before frosting.
""".trimIndent()
            ))

        val adapter = VanillaCupcakeAdapter(recipes)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        binding.imageButton7.setOnClickListener(){
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.imageButton12.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            if (launchedFromSeeAll) {
                onBackPressed() // Go back to See All Recipes
            } else {
                startActivity(Intent(this, MainActivity::class.java)) // Go back to Main Activity
            }
        }
    }
}