/*
 * Copyright 2021 Horácio Flávio Comé Júnior
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.github.dn12.dnaweather.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import net.github.dn12.network.model.City
import net.github.dn12.network.model.GeoCoordinates
import net.github.dn12.network.repositories.CitiesRepository
import net.github.dn12.network.repositories.CitiesWeatherRepository
import net.github.dn12.network.util.MyNetworkCallResult
import net.github.dn12.network.util.isEmpty
import net.github.dn12.storage.model.CityWeather
import net.github.dn12.dnaweather.extensions.asCityWeather
import kotlinx.coroutines.launch

class HomeViewModel(
    private val citiesRepository: CitiesRepository,
    private val citiesWeatherRepository: CitiesWeatherRepository
) : ViewModel() {

    private val cities: MutableLiveData<MutableList<City>> = MutableLiveData()

    private val cityWeather: MutableLiveData<CityWeather> = MutableLiveData()

    private var geoCoordinates: GeoCoordinates = GeoCoordinates(0.0, 0.0)

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
    fun searchCities(q:String): LiveData<MutableList<City>> {
//        if (!cities.value.isNullOrEmpty()) {
//            return cities
//        }
        cities.value= mutableListOf()
        viewModelScope.launch {
            val result = citiesRepository.searchCities(q)
            _callResult.value = result.callResult
            Log.e("TAG", "searchCities: " + result.toString() )
            result.data?.let {
                cities.value = it.toMutableList()
            }
        }
        return cities
    }

    fun getCityWeather(
        geoCoordinates: GeoCoordinates
    ): LiveData<CityWeather> {
        _callResult.value = MyNetworkCallResult.LOADING
        return when {
            geoCoordinates.isEmpty() -> cityWeather
            geoCoordinates == this.geoCoordinates -> cityWeather
            else -> {
                this.geoCoordinates = geoCoordinates
                viewModelScope.launch {
                    try {
                        val result = citiesWeatherRepository.getCityWeather(
                            this@HomeViewModel.geoCoordinates.latitude,
                            this@HomeViewModel.geoCoordinates.longitude
                        )
                        _callResult.value = result.callResult
                        result.data?.let {
                            cityWeather.value = it.asCityWeather()
                        }
                    } catch (e: Exception) {
                        _callResult.value = MyNetworkCallResult.ERROR
                    }
                }
                cityWeather
            }
        }
    }

    fun navigateToCity(navController: NavController, lon: Double,lat:Double, cityName: String) {
        val directions = HomeFragmentDirections.navigateCityWeather(lon.toString(),lat.toString(), cityName)
        navController.navigate(directions)
    }
}
