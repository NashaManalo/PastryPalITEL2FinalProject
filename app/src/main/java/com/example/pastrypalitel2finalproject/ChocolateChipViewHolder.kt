package com.example.pastrypalitel2finalproject

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChocolateChipViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageButton: ImageView = itemView.findViewById(R.id.imageButton3)
    val txtTitle: TextView = itemView.findViewById(R.id.txtChocolateChip)
    val txtDescription: TextView = itemView.findViewById(R.id.txtChocolateChipDescription)
    // Add references to other views as needed
}