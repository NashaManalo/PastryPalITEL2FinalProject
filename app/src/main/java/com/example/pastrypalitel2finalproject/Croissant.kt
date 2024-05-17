package com.example.pastrypalitel2finalproject

import CroissantAdapter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pastrypalitel2finalproject.databinding.ActivityCroissantBinding

@Suppress("DEPRECATION")
class Croissant : AppCompatActivity() {
    private lateinit var binding: ActivityCroissantBinding

    private var launchedFromSeeAll = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCroissantBinding.inflate(layoutInflater)
        setContentView(binding.root)

        launchedFromSeeAll = intent.getBooleanExtra("launchedFromSeeAll", false)

        val recipes = listOf(
            CroissantItem(
                imageResourceId = R.drawable.croissantlong,
                title = getString(R.string.croissant),
                difficultyLevel = getString(R.string.hard_level),
                description = "\tIndulge in our freshly baked croissants, meticulously crafted to perfection with layers of buttery goodness, making every bite a heavenly experience. " +
                        "Whether paired with a hot cup of coffee or enjoyed on its own, our croissants are sure to elevate your day.",
                servings = "6 servings",
                ingredients = """
1 1/4 cups warm milk (around 105-110°F)
2 1/4 teaspoons active dry yeast
1/4 cup granulated sugar
3 1/2 cups all-purpose flour
1 teaspoon salt
1 cup unsalted butter, cold but pliable
Egg wash (1 egg beaten with 1 tablespoon water)
Optional: Chocolate chips, almond paste, or other fillings
    """.trimIndent(),
 totalTime = "9-10 hours",
                prepTime = "30 - 40 minutes",
                cookTime = "15 - 20 minutes",
                instructions = """1. Activate the Yeast:
In a bowl, combine warm milk, yeast, and a tablespoon of sugar. Let it sit for about 5-10 minutes until foamy.

2. Mix Dough:
In a large mixing bowl, combine the flour, remaining sugar, and salt. Add the foamy yeast mixture and stir until a dough forms.

3. Knead Dough:
Turn the dough onto a lightly floured surface and knead for about 5-7 minutes until it becomes smooth and elastic.

4. Chill Dough:
Shape the dough into a rectangle, wrap it in plastic wrap, and refrigerate for 1-2 hours or until firm.

5. Prepare Butter Block:
While the dough is chilling, take the cold but pliable butter and shape it into a rectangle about 1/2-inch thick between sheets of parchment paper. Chill until firm.

6. Create Layers:
Roll out the chilled dough into a rectangle about 1/4-inch thick. Place the chilled butter block in the center and fold the dough over the butter, sealing the edges.

7. Make Folds:
Roll out the dough into a long rectangle, then fold it into thirds like a letter. This is the first fold. Wrap and refrigerate for 30 minutes.
Repeat this rolling and folding process two more times (for a total of three folds). Chill the dough for at least 1-2 hours or overnight.

8. Shape Croissants:
Roll out the chilled dough into a large rectangle, about 1/4-inch thick. Cut triangles from the dough, then make a small cut at the base of each triangle. Roll the triangles into croissant shapes.

9. Proof Croissants:
Arrange the shaped croissants on baking sheets lined with parchment paper. Cover them lightly with plastic wrap and let them proof at room temperature for 1-2 hours until doubled in size.

10. Preheat and Bake:
Preheat your oven to 400°F (200°C). Brush the proofed croissants with egg wash.
Bake the croissants for about 15-20 minutes or until golden brown and flaky.

11. Cool and Enjoy:
Let the croissants cool on a wire rack before serving. They are best enjoyed fresh but can also be stored in an airtight container for a day or two.
""".trimIndent()
            ))

        val adapter = CroissantAdapter(recipes)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        binding.imageButton7.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.imageButton12.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            if (launchedFromSeeAll) {
                onBackPressed()
            } else {
                startActivity(Intent(this, MainActivity::class.java)) // Go back to Main Activity
            }
        }
        binding.btnBack.setOnClickListener {
            if (launchedFromSeeAll) {
                onBackPressed()
            } else {
                startActivity(Intent(this, MainActivity::class.java)) // Go back to Main Activity
            }
        }
    }
}