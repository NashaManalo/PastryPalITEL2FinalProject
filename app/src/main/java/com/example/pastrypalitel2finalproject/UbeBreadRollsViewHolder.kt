package com.example.pastrypalitel2finalproject

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UbeBreadRollsViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageButton: ImageView = itemView.findViewById(R.id.imageButton3)
    val txtTitle: TextView = itemView.findViewById(R.id.txtUbeBreadRoll)
    val txtDescription: TextView = itemView.findViewById(R.id.txtUbeBreadRollsDescription)
    // Add references to other views as needed
}