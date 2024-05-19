
import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pastrypalitel2finalproject.VanillaCupcakeItem
import com.example.pastrypalitel2finalproject.databinding.ItemVanillacupcakeRecipeBinding

class VanillaCupcakeAdapter(private val vanillaCupcakeList: List<VanillaCupcakeItem>) :
    RecyclerView.Adapter<VanillaCupcakeAdapter.VanillaCupcakeViewHolder>() {

    inner class VanillaCupcakeViewHolder(private val binding: ItemVanillacupcakeRecipeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bind(vanillaCupcake: VanillaCupcakeItem) {
            binding.imageView13.setImageResource(vanillaCupcake.imageResourceId)
            binding.txtVanillaCupcake.text = vanillaCupcake.title
            binding.txtDifficultyLevel.text = "Difficulty Level: ${vanillaCupcake.difficultyLevel}"
            binding.txtVanillaCupcakeDescription.text = vanillaCupcake.description
            binding.txtServings.text = vanillaCupcake.servings
            binding.txtIngredientsVanillaCupcake.text = vanillaCupcake.ingredients
            binding.txttotalTimeText.text = vanillaCupcake.totalTime
            binding.txtprepTimeText.text = vanillaCupcake.prepTime
            binding.txtcookTimeText.text = vanillaCupcake.cookTime
            binding.txtinstruction.text = vanillaCupcake.instructions
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VanillaCupcakeViewHolder {
        val binding =
            ItemVanillacupcakeRecipeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return VanillaCupcakeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: VanillaCupcakeViewHolder, position: Int) {
        holder.bind(vanillaCupcakeList[position])
    }

    override fun getItemCount(): Int = vanillaCupcakeList.size
}
