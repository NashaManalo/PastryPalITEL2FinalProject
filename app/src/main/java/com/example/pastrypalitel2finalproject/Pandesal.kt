package com.example.pastrypalitel2finalproject

import PandesalAdapter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pastrypalitel2finalproject.databinding.ActivityPandesalBinding

@Suppress("DEPRECATION")
class Pandesal : AppCompatActivity() {
    private lateinit var binding: ActivityPandesalBinding

    private var launchedFromSeeAll = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPandesalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        launchedFromSeeAll = intent.getBooleanExtra("launchedFromSeeAll", false)

        val recipes = listOf(
            PandesalItem(
                imageResourceId = R.drawable.pandesallong,
                title = getString(R.string.pandesal),
                difficultyLevel = getString(R.string.easy_level),
                description = "\tPandesal is a popular Filipino bread roll known for its soft, fluffy texture and slightly sweet taste. It is often enjoyed as a breakfast staple or as a snack throughout the day, perfect when paired with butter, cheese, or jam.",
                servings = "20 servings",
                ingredients = """
3 cups all-purpose flour - see NOTE 1 about bread flour
¼ cup sugar
1 teaspoon salt
1 cup milk - lukewarm
1 egg
2 tablespoon butter - melted (or margarine)
1 ½ teaspoon instant dry yeast - see Note 2
¼ cup breadcrumbs
                """.trimIndent(),
                totalTime = "25 minutes",
                prepTime = "10 minutes",
                cookTime = "15 minutes",
                instructions = """
1. In a big bowl, mix together flour, sugar, salt. 

2. Pour in milk, beaten egg and melted butter. Mix several times until well blended. Make sure that the milk is only mildly warm and not hot. 

3. Add the instant dry yeast and fold until a sticky dough forms.

4. Tip the dough on a floured surface and knead until it becomes smooth and elastic, about 5-10 minutes.

5. Form the dough into a ball and lightly coat with oil. Place it in a bowl and cover with a kitchen towel or plastic wrap and place it in a warm area and let it rise until it doubled in size. Depending on how warm it is, it could take 30 minutes to an hour.

6. Punch down the dough and divide into 2 equal parts using a knife or dough slicer. Roll each into a log. Cut each log into 6 smaller pieces. 

7. Shape each piece into a ball and roll it in breadcrumbs, completely covering all sides.

8. Arrange the pieces on a baking sheet leaving some gaps in between (at least an inch). Leave them to rise a second time until double in size.

9. While waiting, preheat oven to 370° F /185°C. Bake the Pandesal for 15 minutes or until the sides are a bit browned.

10. Remove from oven and serve while hot!
                """.trimIndent()
            )
        )

        val adapter = PandesalAdapter(recipes)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        binding.imageButton7.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnBack.setOnClickListener {
            if (launchedFromSeeAll) {
                onBackPressed() // Go back to See All Recipes
            } else {
                startActivity(Intent(this, MainActivity::class.java)) // Go back to Main Activity
            }
        }

        binding.imageButton12.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        binding.imageButton7.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
