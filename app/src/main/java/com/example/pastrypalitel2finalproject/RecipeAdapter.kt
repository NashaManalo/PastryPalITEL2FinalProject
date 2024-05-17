import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pastrypalitel2finalproject.R
import com.example.pastrypalitel2finalproject.RecipeItem

class RecipeAdapter(private val recipes: List<RecipeItem>, private val clickListener: (RecipeItem) -> Unit) : RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {

    class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.item_image)
        val titleView: TextView = itemView.findViewById(R.id.item_title)
        val descriptionView: TextView = itemView.findViewById(R.id.item_description)
        val stars = listOf(
            itemView.findViewById<ImageView>(R.id.star1),
            itemView.findViewById<ImageView>(R.id.star2),
            itemView.findViewById<ImageView>(R.id.star3)
        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recipe, parent, false)
        return RecipeViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val recipe = recipes[position]
        holder.imageView.setImageResource(recipe.imageResId)
        holder.titleView.text = recipe.title
        holder.descriptionView.text = recipe.description
        holder.stars.forEachIndexed { index, imageView ->
            imageView.visibility = if (index < recipe.rating) View.VISIBLE else View.INVISIBLE
        }
        holder.itemView.setOnClickListener { clickListener(recipe) }
    }

    override fun getItemCount() = recipes.size
}
