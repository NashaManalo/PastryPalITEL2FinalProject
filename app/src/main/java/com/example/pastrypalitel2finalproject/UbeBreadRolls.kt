package com.example.pastrypalitel2finalproject

import UbeBreadRollsAdapter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pastrypalitel2finalproject.databinding.ActivityUbeBreadRollsBinding

@Suppress("DEPRECATION")
class UbeBreadRolls : AppCompatActivity() {
    private lateinit var binding: ActivityUbeBreadRollsBinding

    private var launchedFromSeeAll = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUbeBreadRollsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        launchedFromSeeAll = intent.getBooleanExtra("launchedFromSeeAll", false)

        val recipes = listOf(
            UbeBreadRollsItem(
                imageResourceId = R.drawable.ubebreadrollslandscape,
                title = getString(R.string.ube_bread_roll),
                difficultyLevel = getString(R.string.easy_level),
                description = "\tA ube bread roll is a soft, fluffy bread infused with the delightful flavor and vibrant purple color of ube, also known as purple yam. " +
                        "It's sweetened just right, making it a perfect treat for breakfast or snack time.",
                servings = "12 servings",
                ingredients = """
Phase 1:
½ cup warm water about 110F
1 package active dry yeast 0.25 oz
1 tsp granulated sugar

Phase 2:
½ cup milk
¼ cup granulated sugar
1 tsp salt
¼ cup unsalted butter room temperature

Phase 3:
2 pcs large eggs room temperature and lightly beaten
4 cups all purpose flour
1 tbsp canola oil you can substitute any flavourless oil

Phase 4:
½ cup unsalted butter melted and allowed to cool slightly (+ 3 tbsp melted butter for brushing)
½ cup packed brown sugar
1 ½ cup unsweetened shredded coconut
15 oz ube jam
                """.trimIndent(),
                totalTime = "2 hours 30 minutes",
                prepTime = "40 minutes",
                cookTime = "20 minutes",
                instructions = """Phase 1:
In a measuring cup, stir ½ cup warm water (about 110F), 1 package active dry yeast and 1 teaspoon sugar until dissolved. Set aside and let stand until bubbly (about 10 minutes).

Phase 2:
In a medium saucepan on medium heat, warm ½ cup milk until you see bubbles forming at the edges (about 180F). Remove from heat and stir ¼ cup sugar, 1 teaspoon salt, and ¼ cup butter until the butter has completely melted.

Set aside and let cool until lukewarm.

Phase 3:
In a large bowl, combine your yeast mixture, your milk mixture, eggs and 1 ½ cups flour. Stir until combined. Proceed to add the rest of your flour ½ cup at a time combining well after each addition.

Once the dough starts pulling and sticking together in a ball, transfer it into a lightly floured surface and knead until smooth and elastic (8-10 minutes). When in doubt, knead some more. Careful not to over-flour your dough. You want it elastic but still a little sticky.

Oil a large bowl with 1 tablespoon canola oil. Place your dough in the bowl and turn to ensure the whole dough is coated. Cover with a damp cloth and allow to rise in a dry warm place (about 90F) until it doubles in size (about 1 hour).

Phase 4:
In a medium bowl combine ½ cup melted butter, ½ cup brown sugar and 1 ½ cups unsweetened shredded coconut. Pour into a greased 9×13 inch baking dish (see notes) and spread evenly on the bottom.

When your dough is ready, transfer it into a lightly floured surface and roll into (roughly) a 12×14 inch rectangle. Brush the dough with melted butter then spread ube jam (see notes), leaving a half inch border around.

Tightly roll the dough (long side up) and pinch the seams to seal. Brush with more melted butter. Cut the roll into 12 pieces (see notes) and place cut side down on your baking dish. Space them out evenly to allow the dough space to rise. Cover and let rise for another 30 minutes.

When your rolls are just about ready, preheat your oven to 375F and bake for 20-25 minutes or until golden brown.

Let the rolls cool slightly in the baking dish before you invert them onto a serving platter. You can also opt to scoop them out one by one. Top with more toasted coconut from the bottom of the dish.
                """.trimIndent()
            )
        )

        val adapter = UbeBreadRollsAdapter(recipes)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        binding.imageButton7.setOnClickListener {
            val intent = Intent(this, Homescreen::class.java)
            startActivity(intent)
        }

        binding.imageButton12.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            if (launchedFromSeeAll) {
                // If launched from See All, go back to Home screen
                // Optionally, you can pass a flag to the Home screen activity
                // to indicate that it was launched from See All, if needed
                startActivity(Intent(this, SeeAll::class.java))
                finish()
            } else {
                // If launched from Home screen, go back to the previous activity
                onBackPressed()
            }
        }
    }

}
