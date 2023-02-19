

package net.github.dn12.dnaweather.ui.city_weather

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import net.github.dn12.network.repositories.CitiesWeatherRepository
import net.github.dn12.network.util.MyNetworkCallResult
import net.github.dn12.storage.model.CityWeather
import net.github.dn12.storage.repositories.LocalCacheRepository
import net.github.dn12.dnaweather.extensions.asCityWeather
import kotlinx.coroutines.launch

class CityWeatherViewModel(
    private val citiesWeatherRepository: CitiesWeatherRepository,
) : ViewModel() {


    private val cityWeather: MutableLiveData<List<CityWeather>> = MutableLiveData()

    private var lat: Double = 0.0
    private var lon: Double = 0.0

    private val _callResult: MutableLiveData<MyNetworkCallResult> = MutableLiveData()

    val callResult: LiveData<MyNetworkCallResult> = _callResult

    fun getCityWeather(lat: Double = 0.0, lon:Double = 0.0): LiveData<List<CityWeather>> {
        this.lat = lat
        this.lon = lon
        fetchWeather()
        return cityWeather
    }

    fun refreshWeather() {
            fetchWeather()
    }

    private fun fetchWeather(
    ) {
            viewModelScope.launch {
                val networkResult = citiesWeatherRepository.getCityForecastWeather(lat,lon)
                _callResult.value = networkResult.callResult
                networkResult.data?.let {fc->
                    val c= mutableListOf<CityWeather>()
                    fc.list?.forEach {cw->
                        cw?.let {
                            c.add(it.asCityWeather())
                        }
                    }
                    cityWeather.value = c
                }
            }
    }
}
