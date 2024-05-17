
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pastrypalitel2finalproject.PutokItem
import com.example.pastrypalitel2finalproject.databinding.ItemPutokRecipeBinding

class PutokAdapter(private val putokList: List<PutokItem>) :
    RecyclerView.Adapter<PutokAdapter.PutokViewHolder>() {

    inner class PutokViewHolder(private val binding: ItemPutokRecipeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(putok: PutokItem) {
            binding.imageView13.setImageResource(putok.imageResourceId)
            binding.txtPutok.text = putok.title
            binding.txtDifficultyLevel.text = "Difficulty Level: ${putok.difficultyLevel}"
            binding.txtPutokDescription.text = putok.description
            binding.txtServings.text = putok.servings
            binding.txtIngredientsPutok.text = putok.ingredients
            binding.txttotalTimeText.text = putok.totalTime
            binding.txtprepTimeText.text = putok.prepTime
            binding.txtcookTimeText.text = putok.cookTime
            binding.txtinstruction.text = putok.instructions
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PutokViewHolder {
        val binding =
            ItemPutokRecipeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PutokViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PutokViewHolder, position: Int) {
        holder.bind(putokList[position])
    }

    override fun getItemCount(): Int = putokList.size
}
