

package net.github.dn12.dnaweather.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import net.github.dn12.dnaweather.R
import net.github.dn12.dnaweather.databinding.ItemCityBinding
import net.github.dn12.network.model.City
import net.github.dn12.dnaweather.util.CityCoverUtils

class CitiesAdapter(
    private val cityNameBuilder: (cityName: String,state:String, cityCountry: String) -> String
) : RecyclerView.Adapter<CitiesAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    var dataSet: MutableList<City> = mutableListOf()
        set(value) {
            val callback = CitiesDiffCallback(field, value)
            val result = DiffUtil.calculateDiff(callback)
            field = value
            result.dispatchUpdatesTo(this)
        }

    private lateinit var binding: ItemCityBinding

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(viewGroup.context)
        binding = ItemCityBinding.inflate(inflater, viewGroup, false)
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.setIsRecyclable(false)
        val city = dataSet[position]
        binding.cityNameTextView.text = cityNameBuilder(city.name?:"", city.state?:"",city.country?:"")
        val coverResId = CityCoverUtils.getRandomCityCoverResId()
        binding.coverImageView.load(R.drawable.ic_undraw_coming_home_52ir)
    }

    override fun getItemCount() = dataSet.size
}
