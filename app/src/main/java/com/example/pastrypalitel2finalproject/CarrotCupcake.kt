package com.example.pastrypalitel2finalproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pastrypalitel2finalproject.databinding.ActivityCarrotCupcakeBinding

@Suppress("DEPRECATION")
class CarrotCupcake : AppCompatActivity() {
    private lateinit var binding: ActivityCarrotCupcakeBinding

    private var launchedFromSeeAll = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarrotCupcakeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        launchedFromSeeAll = intent.getBooleanExtra("launchedFromSeeAll", false)

        val recipes = listOf(
            CupcakeRecipe(
                imageResourceId = R.drawable.carrotcupcakelong,
                title = getString(R.string.carrot_cupcake),
                difficultyLevel = getString(R.string.medium_level),
                description = "\tThese carrot cake cupcakes are everything you love about the cake—outstanding spice flavor, super moist crumb, and velvety cream cheese frosting—in a portioned cupcake wrapper!",
                servings = "6 servings",
                ingredients = """
                1 and 1/3 cups (166g) all-purpose flour (spooned & leveled)
                1 teaspoon baking powder
                1/2 teaspoon baking soda
                1/2 teaspoon salt
                1 teaspoon ground cinnamon
                3/4 teaspoon ground ginger
                1/4 teaspoon ground nutmeg
                1/2 cup (120ml) vegetable oil
                1 cup (200g) packed light or dark brown sugar
                2 large eggs, at room temperature
                1/3 cup (80g) unsweetened applesauce, sour cream, or plain yogurt, at room temperature
                1 teaspoon pure vanilla extract
                1 and 1/2 cups (200g) peeled, shredded, and coarsely chopped carrots* (about 3 large carrots)
                optional add-in: 3/4 cup chopped walnuts or pecans; raisins

                Cream Cheese Frosting
                8 ounces (224g) full-fat block cream cheese, softened to room temperature
                1/2 cup (8 Tbsp; 113g) unsalted butter, softened to room temperature
                3 cups (360g) confectioners’ sugar
                1 teaspoon pure vanilla extract
                1/8 teaspoon salt
                optional garnish: white chocolate carrot topper (see Notes) and/or finely chopped walnuts or pecans
                """.trimIndent(),
                totalTime = "2 hours",
                prepTime = "15 minutes",
                cookTime = "22 minutes",
                instructions = """
                1. Preheat the oven to 350°F (177°C). Line a 12-cup muffin pan with cupcake liners.

                2. Whisk the flour, baking powder, baking soda, salt, cinnamon, ginger, and nutmeg together in a large bowl. Set aside. Whisk the oil, brown sugar, eggs, applesauce, and vanilla extract together until combined, and then whisk in the carrots. 
                
                3. Pour the wet ingredients into the dry ingredients and fold or whisk together until completely combined. Batter will be slightly thick.

                4. Pour/spoon the batter into the liners, filling only about 3/4 full to avoid spilling over the sides. Bake for 21–23 minutes, or until a toothpick inserted in the center comes out clean. For around 30 mini cupcakes, bake for about 12–13 minutes, same oven temperature. 
                
                5. Allow the cupcakes to cool completely before frosting.

                6. Meanwhile, make the frosting: In a large bowl using a handheld or stand mixer fitted with a paddle or whisk attachment, beat the cream cheese and butter together on high speed until smooth and creamy. 
                
                7. Add confectioners’ sugar, vanilla extract,  and salt. Beat on low speed for 30 seconds and then switch to high speed and beat for 2 minutes. Cover and refrigerate the frosting as the cupcakes finish cooling—this is helpful if you plan to pipe the frosting with a piping bag + tip. Cold cream cheese frosting holds its shape better.

                8. Frost cooled cupcakes and top with optional garnish, if desired. I used an Ateco 808 piping tip and then swirled the center with a small icing spatula (you can see me do that in the video—totally optional way of decorating). 
                
                9. Cover and store leftover cupcakes in the refrigerator for up to 5 days. I recommend a cupcake carrier for storing and transporting decorated cupcakes.
                """.trimIndent()
            )
        )

        val adapter = CupcakeRecipeAdapter(recipes)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        binding.imageButton7.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
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
    }
}
