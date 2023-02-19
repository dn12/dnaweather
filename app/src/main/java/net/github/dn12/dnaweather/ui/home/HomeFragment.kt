package net.github.dn12.dnaweather.ui.home

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import io.github.horaciocome1.simplerecyclerviewtouchlistener.addOnItemClickListener
import net.github.dn12.dnaweather.R
import net.github.dn12.dnaweather.databinding.FragmentHomeBinding
import org.koin.android.ext.android.inject

class HomeFragment : Fragment() {

    private val viewModel: HomeViewModel by inject()

    private lateinit var binding: FragmentHomeBinding

    private val citiesAdapter: CitiesAdapter by lazy {
        CitiesAdapter { cityName, state, cityCountry ->
            getString(R.string.city_name, cityName, state, cityCountry)
        }
    }

    private val snackbarLoading: Snackbar by lazy {
        Snackbar.make(binding.root, R.string.location_loading, Snackbar.LENGTH_INDEFINITE)
            .setAnimationMode(Snackbar.ANIMATION_MODE_SLIDE)
    }

    private val snackbarError: Snackbar by lazy {
        Snackbar.make(
            binding.root,
            getString(R.string.message_general_error),
            Snackbar.LENGTH_INDEFINITE
        )
            .setAnimationMode(Snackbar.ANIMATION_MODE_SLIDE)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.searchLayout.etSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                if (s.toString().length > 3) {
                    Log.e("TAG", "afterTextChanged: ")
                    searchCity(s.toString())
                }
            }
        })
        initRecyclerView()
    }

    fun searchCity(q: String) {
        viewModel.searchCities(q).observe(this@HomeFragment) {
            citiesAdapter.dataSet = it
        }
    }

    private fun initRecyclerView() {
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = citiesAdapter
        binding.recyclerView.itemAnimator = null
        binding.recyclerView.addOnItemClickListener { _, position ->
            val city = citiesAdapter.dataSet[position]
            val name = getString(R.string.city_name, city.name, city.state, city.country)
            viewModel.navigateToCity(findNavController(), city.lon ?: 0.0, city.lat ?: 0.0, name)
        }
    }

}
