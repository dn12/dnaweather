package net.github.dn12.dnaweather.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import kotlinx.coroutines.launch
import net.github.dn12.network.model.City
import net.github.dn12.network.repositories.CitiesRepository
import net.github.dn12.network.util.MyNetworkCallResult
import net.github.dn12.storage.model.CityWeather

class HomeViewModel(
    private val citiesRepository: CitiesRepository,
) : ViewModel() {

    private val cities: MutableLiveData<MutableList<City>> = MutableLiveData()

    private val cityWeather: MutableLiveData<CityWeather> = MutableLiveData()


    private val _callResult: MutableLiveData<MyNetworkCallResult> = MutableLiveData()

    val callResult: LiveData<MyNetworkCallResult>
        get() {
            return _callResult
        }

    fun getCities(): LiveData<MutableList<City>> {
        if (!cities.value.isNullOrEmpty()) {
            return cities
        }
        viewModelScope.launch {
            val result = citiesRepository.getCities()
            _callResult.value = result.callResult
            result.data?.let {
                cities.value = it
            }
        }
        return cities
    }

    fun searchCities(q: String): LiveData<MutableList<City>> {
        cities.value = mutableListOf()
        viewModelScope.launch {
            val result = citiesRepository.searchCities(q)
            _callResult.value = result.callResult
            result.data?.let {
                cities.value = it.toMutableList()
            }
        }
        return cities
    }


    fun navigateToCity(navController: NavController, lon: Double, lat: Double, cityName: String) {
        val directions =
            HomeFragmentDirections.navigateCityWeather(lon.toString(), lat.toString(), cityName)
        navController.navigate(directions)
    }
}
