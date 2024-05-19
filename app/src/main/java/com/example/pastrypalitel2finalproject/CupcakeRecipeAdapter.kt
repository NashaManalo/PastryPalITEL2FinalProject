package com.example.pastrypalitel2finalproject

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pastrypalitel2finalproject.databinding.ItemCupcakeRecipeBinding

class CupcakeRecipeAdapter(private val recipeList: List<CupcakeRecipe>) :
    RecyclerView.Adapter<CupcakeRecipeAdapter.CupcakeRecipeViewHolder>() {

    inner class CupcakeRecipeViewHolder(private val binding: ItemCupcakeRecipeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bind(recipe: CupcakeRecipe) {
            binding.imageView13.setImageResource(recipe.imageResourceId)
            binding.txtCarrotCupcake.text = recipe.title
            binding.txtDifficultyLevel.text = "Difficulty Level: ${recipe.difficultyLevel}"
            binding.txtCarrotCupcakeDescription.text = recipe.description
            binding.txtServings.text = recipe.servings
            binding.txtIngredientsCarrotCupcake.text = recipe.ingredients
            binding.txttotalTimeText.text = recipe.totalTime
            binding.txtprepTimeText.text = recipe.prepTime
            binding.txtcookTimeText.text = recipe.cookTime
            binding.txtinstruction.text = recipe.instructions
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CupcakeRecipeViewHolder {
        val binding = ItemCupcakeRecipeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CupcakeRecipeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CupcakeRecipeViewHolder, position: Int) {
        holder.bind(recipeList[position])
    }

    override fun getItemCount(): Int = recipeList.size
}
