import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pastrypalitel2finalproject.R

class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageButton: ImageView = itemView.findViewById(R.id.imageButton3)
    val txtTitle: TextView = itemView.findViewById(R.id.txtCarrotCupcakeCupcake)
    val txtDescription: TextView = itemView.findViewById(R.id.txtCarrotCupcakeShortDescription)
}
