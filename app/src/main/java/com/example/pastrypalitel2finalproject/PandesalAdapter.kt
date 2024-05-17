import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pastrypalitel2finalproject.PandesalItem
import com.example.pastrypalitel2finalproject.databinding.ItemPandesalRecipeBinding

class PandesalAdapter(private val pandesalList: List<PandesalItem>) :
    RecyclerView.Adapter<PandesalAdapter.PandesalViewHolder>() {

    inner class PandesalViewHolder(private val binding: ItemPandesalRecipeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(pandesal: PandesalItem) {
            binding.imageView13.setImageResource(pandesal.imageResourceId)
            binding.txtPandesal.text = pandesal.title
            binding.txtDifficultyLevel.text = "Difficulty Level: ${pandesal.difficultyLevel}"
            binding.txtPandesalDescription.text = pandesal.description
            binding.txtServings.text = pandesal.servings
            binding.txtIngredientsPandesal.text = pandesal.ingredients
            binding.txttotalTimeText.text = pandesal.totalTime
            binding.txtprepTimeText.text = pandesal.prepTime
            binding.txtcookTimeText.text = pandesal.cookTime
            binding.txtinstruction.text = pandesal.instructions
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PandesalViewHolder {
        val binding =
            ItemPandesalRecipeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PandesalViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PandesalViewHolder, position: Int) {
        holder.bind(pandesalList[position])
    }

    override fun getItemCount(): Int = pandesalList.size
}
