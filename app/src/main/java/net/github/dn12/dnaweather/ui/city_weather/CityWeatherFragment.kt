

package net.github.dn12.dnaweather.ui.city_weather

import android.animation.LayoutTransition
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import net.github.dn12.storage.model.CityWeather
import net.github.dn12.dnaweather.R
import net.github.dn12.dnaweather.databinding.FragmentCityWeatherBinding
import net.github.dn12.dnaweather.databinding.LayoutCityWeatherBinding
import net.github.dn12.dnaweather.util.gone
import net.github.dn12.dnaweather.util.visible
import net.github.dn12.storage.extensions.asDate
import org.koin.android.ext.android.inject
import kotlin.math.roundToInt

class CityWeatherFragment : Fragment() {

    private val viewModel: CityWeatherViewModel by inject()

    private lateinit var binding: FragmentCityWeatherBinding

    private val snackbarError: Snackbar by lazy {
        Snackbar.make(binding.root, getString(R.string.message_general_error), Snackbar.LENGTH_INDEFINITE)
            .setAnimationMode(Snackbar.ANIMATION_MODE_SLIDE)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCityWeatherBinding.inflate(inflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.container.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }
        binding.refreshButton.setOnClickListener {
            binding.progressBar.visible()
            viewModel.refreshWeather()
        }
    }

    override fun onStart() {
        super.onStart()
        arguments?.let {
            val args = CityWeatherFragmentArgs.fromBundle(it)
            binding.cityNameTextView.text = args.cityName
            getCityWeather(args.lat.toDouble(),args.lon.toDouble())
        }
    }

    private fun getCityWeather(lat: Double = 0.0, lon:Double = 0.0) {
        viewModel.getCityWeather(lat,lon).observe(viewLifecycleOwner) {
            binding.progressBar.gone()
            bindWeather(it)
        }
        viewModel.callResult.observe(viewLifecycleOwner) {}
    }

    private fun bindWeather(listCityWeather: List<CityWeather>) {

        binding.contentInclude.removeAllViews()

        listCityWeather.forEach { cityWeather->
            val weatherBinding=LayoutCityWeatherBinding.inflate(layoutInflater)
            weatherBinding.dateTextView.text= cityWeather.timeInMillis.asDate()
            val min = cityWeather.tempMin.roundToInt()
            val max = cityWeather.tempMax.roundToInt()
            weatherBinding.tempTextView.text = getString(R.string.temp_min_max, min, max)
            weatherBinding.currentTempTextView.text = "${cityWeather.temp.roundToInt()}"
            weatherBinding.mainTextView.text = cityWeather.weatherMain
            weatherBinding.sunriseTextView.text = cityWeather.sysSunrise
            val wind = cityWeather.windSpeed.roundToInt()
            weatherBinding.windTextView.text = getString(R.string.wind_mps, wind)
            val realFeel = cityWeather.feelsLike.roundToInt()
            weatherBinding.reealFeelTextView.text = getString(R.string.temp, realFeel)
            weatherBinding.root.visible()
            binding.contentInclude.addView(weatherBinding.root)

        }


        binding.progressBar.gone()
    }
}
