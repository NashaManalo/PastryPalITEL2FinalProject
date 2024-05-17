import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pastrypalitel2finalproject.UbeBreadRollsItem
import com.example.pastrypalitel2finalproject.databinding.ItemUbebreadrollsRecipeBinding

class UbeBreadRollsAdapter(private val ubeBreadRollsList: List<UbeBreadRollsItem>) :
    RecyclerView.Adapter<UbeBreadRollsAdapter.UbeBreadRollsViewHolder>() {

    inner class UbeBreadRollsViewHolder(private val binding: ItemUbebreadrollsRecipeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(ubeBreadRolls: UbeBreadRollsItem) {
            binding.imageView13.setImageResource(ubeBreadRolls.imageResourceId)
            binding.txtUbeBreadRolls.text = ubeBreadRolls.title
            binding.txtDifficultyLevel.text = "Difficulty Level: ${ubeBreadRolls.difficultyLevel}"
            binding.txtUbeBreadRollsDescription.text = ubeBreadRolls.description
            binding.txtServings.text = ubeBreadRolls.servings
            binding.txtIngredientsUbeBreadRolls.text = ubeBreadRolls.ingredients
            binding.txttotalTimeText.text = ubeBreadRolls.totalTime
            binding.txtprepTimeText.text = ubeBreadRolls.prepTime
            binding.txtcookTimeText.text = ubeBreadRolls.cookTime
            binding.txtinstruction.text = ubeBreadRolls.instructions
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UbeBreadRollsViewHolder {
        val binding = ItemUbebreadrollsRecipeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UbeBreadRollsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UbeBreadRollsViewHolder, position: Int) {
        holder.bind(ubeBreadRollsList[position])
    }

    override fun getItemCount(): Int = ubeBreadRollsList.size
}
