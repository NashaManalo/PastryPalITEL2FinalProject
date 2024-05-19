package com.example.pastrypalitel2finalproject

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pastrypalitel2finalproject.databinding.ItemChocolatechipRecipeBinding

class ChocolateChipAdapter(private val chocolateChipList: List<ChocolateChipItem>) :
    RecyclerView.Adapter<ChocolateChipAdapter.ChocolateChipViewHolder>() {

    inner class ChocolateChipViewHolder(private val binding: ItemChocolatechipRecipeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bind(chocolateChip: ChocolateChipItem) {
            binding.imageView13.setImageResource(chocolateChip.imageResourceId)
            binding.txtChocolateChip.text = chocolateChip.title
            binding.txtDifficultyLevel.text = "Difficulty Level: ${chocolateChip.difficultyLevel}"
            binding.txtChocolateChipDescription.text = chocolateChip.description
            binding.txtServings.text = chocolateChip.servings
            binding.txtIngredientsChocolateChip.text = chocolateChip.ingredients
            binding.txttotalTimeText.text = chocolateChip.totalTime
            binding.txtprepTimeText.text = chocolateChip.prepTime
            binding.txtcookTimeText.text = chocolateChip.cookTime
            binding.txtinstruction.text = chocolateChip.instructions
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChocolateChipViewHolder {
        val binding =
            ItemChocolatechipRecipeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChocolateChipViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChocolateChipViewHolder, position: Int) {
        holder.bind(chocolateChipList[position])
    }

    override fun getItemCount(): Int = chocolateChipList.size
}
