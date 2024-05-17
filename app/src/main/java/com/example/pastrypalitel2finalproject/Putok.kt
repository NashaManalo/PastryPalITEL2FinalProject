package com.example.pastrypalitel2finalproject

import PutokAdapter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pastrypalitel2finalproject.databinding.ActivityPutokBinding

@Suppress("DEPRECATION")
class Putok : AppCompatActivity() {
    private lateinit var binding: ActivityPutokBinding

    private var launchedFromSeeAll = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPutokBinding.inflate(layoutInflater)
        setContentView(binding.root)

        launchedFromSeeAll = intent.getBooleanExtra("launchedFromSeeAll", false)

        val recipes = listOf(
            PutokItem(
                imageResourceId = R.drawable.putoklong,
                title = getString(R.string.putok),
                difficultyLevel = getString(R.string.medium_level),
                description = "\tPutok is a sweet, dense bread that is a Filipino Panederia favorite commonly enjoyed for coffee or tea time." +
                        " It is known for its crackling crust and soft, fluffy interior, making it a delightful treat for any occasion.",
                servings = "20 servings",
                ingredients = """
4 cups bread flour or all-purpose flour
½ cup milk powder
¾ cup sugar
1 teaspoon salt
¾ -1 cup lukewarm water
1 teaspoon instant yeast
¼ cup unsalted butter or margarine softened to room temperature

EGG WASH
1 large egg
1 Tbsp milk
Sugar for topping
""".trimIndent(),
                totalTime = "2 hours 18 minutes",
                prepTime = "30 minutes",
                cookTime = "18 minutes",
                instructions = """
1. Combine bread flour, mik powder, sugar, and salt in a large mixing bowl and mix until well distributed. Make a well in the center.

2. Pour in ¾ cup lukewarm water then sprinkle the instant yeast over the water. Using a wooden spoon, stir the water to moisten the yeast.

3. Add the softened butter then slowly fold in the rest of the flour mixture with the liquid to create a dense dough.

4. Knead for 7-10 minutes until the dough becomes smooth. If the dough is too dry when you start to knead add a bit more water, a tablespoon at a time then knead to check again. Do NOT add too much water. The dough has to be dense, it will not be elastic but it should be smooth.

5. Transfer the dough to a greased bowl, cover with a plastic wrap and let it rest for 1 hour in a warm place.

6. Divide the dough into 20 pieces or about 50 grams each. Shape them into balls and arrange them on a baking tray lined with parchment paper.

7. Using a kitchen scissor, snip the top with 2 intersecting lines to form a cross. Cover with a tea towel and let it rest again for 30 minutes. Expect that they will not rise much.

8. Brush each piece with egg wash and sprinkle with sugar. Bake in a pre-heated oven at 180°C/350°F for 18-20 minutes or until top becomes golden

9. Take the star bread from the oven and transfer them to a bread basket or plate and enjoy with a cup of hot beverage.
""".trimIndent()
            ))

        val adapter = PutokAdapter(recipes)
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