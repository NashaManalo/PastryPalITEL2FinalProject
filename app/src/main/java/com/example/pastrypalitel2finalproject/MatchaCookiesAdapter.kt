import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pastrypalitel2finalproject.MatchaCookiesItem
import com.example.pastrypalitel2finalproject.databinding.ItemMatchacookiesRecipeBinding

class MatchaCookiesAdapter(private val matchaCookieList: List<MatchaCookiesItem>) :
    RecyclerView.Adapter<MatchaCookiesAdapter.MatchaCookieViewHolder>() {

    inner class MatchaCookieViewHolder(private val binding: ItemMatchacookiesRecipeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(matchaCookies: MatchaCookiesItem) {
            binding.imageView13.setImageResource(matchaCookies.imageResourceId)
            binding.txtMatchaCookies.text = matchaCookies.title
            binding.txtDifficultyLevel.text = "Difficulty Level: ${matchaCookies.difficultyLevel}"
            binding.txtMatchaCookiesDescription.text = matchaCookies.description
            binding.txtServings.text = matchaCookies.servings
            binding.txtIngredientsMatchaCookies.text = matchaCookies.ingredients
            binding.txttotalTimeText.text = matchaCookies.totalTime
            binding.txtprepTimeText.text = matchaCookies.prepTime
            binding.txtcookTimeText.text = matchaCookies.cookTime
            binding.txtinstruction.text = matchaCookies.instructions
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchaCookieViewHolder {
        val binding =
            ItemMatchacookiesRecipeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MatchaCookieViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MatchaCookieViewHolder, position: Int) {
        holder.bind(matchaCookieList[position])
    }

    override fun getItemCount(): Int = matchaCookieList.size
}
