import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pastrypalitel2finalproject.CroissantItem
import com.example.pastrypalitel2finalproject.databinding.ItemCroissantRecipeBinding

class CroissantAdapter(private val croissantList: List<CroissantItem>) :
    RecyclerView.Adapter<CroissantAdapter.CroissantViewHolder>() {

    inner class CroissantViewHolder(private val binding: ItemCroissantRecipeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(croissant: CroissantItem) {
            binding.imageView13.setImageResource(croissant.imageResourceId)
            binding.txtCroissant.text = croissant.title
            binding.txtDifficultyLevel.text = "Difficulty Level: ${croissant.difficultyLevel}"
            binding.txtCroissantDescription.text = croissant.description
            binding.txtServings.text = croissant.servings
            binding.txtIngredientsCroissant.text = croissant.ingredients
            binding.txttotalTimeText.text = croissant.totalTime
            binding.txtprepTimeText.text = croissant.prepTime
            binding.txtcookTimeText.text = croissant.cookTime
            binding.txtinstruction.text = croissant.instructions
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CroissantViewHolder {
        val binding =
            ItemCroissantRecipeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CroissantViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CroissantViewHolder, position: Int) {
        holder.bind(croissantList[position])
    }

    override fun getItemCount(): Int = croissantList.size
}
