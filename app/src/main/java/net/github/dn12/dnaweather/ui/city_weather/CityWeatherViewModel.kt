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
    private val localCacheRepository: LocalCacheRepository
) : ViewModel() {

    companion object {
        private const val ONE_HOUR_IN_MILLIS = 60 * 60 * 1000L
    }

    private val cityWeather: MutableLiveData<CityWeather> = MutableLiveData()

    private var lat: Double = 0.0
    private var lon: Double = 0.0

    private val _callResult: MutableLiveData<MyNetworkCallResult> = MutableLiveData()

    val callResult: LiveData<MyNetworkCallResult> = _callResult

    fun getCityWeather(lat: Double = 0.0, lon:Double = 0.0): LiveData<CityWeather> {
        this.lat = lat
        this.lon = lon
        Log.e("TAG", "getCityWeather: "+ lat + lon )
        fetchWeather(refresh = false)
        return cityWeather
    }

    fun refreshWeather() {
            fetchWeather(refresh = true)
    }

    private fun fetchWeather(
        refresh: Boolean
    ) {
//        var ageInMillis = ONE_HOUR_IN_MILLIS
//        val storageResult = localCacheRepository.getCityWeather<CityWeather>(cityId)
//        storageResult.data?.also {
//            ageInMillis = Calendar.getInstance().timeInMillis - it.timeInMillis
//        }
//        if (storageResult.callResult == MyStorageCallResult.SUCCESS &&
//            storageResult.data != null &&
//            !refresh &&
//            ageInMillis < ONE_HOUR_IN_MILLIS
//        ) {
//            cityWeather.value = storageResult.data!!
//            _callResult.value = MyNetworkCallResult.SUCCESS_LOCAL
//        } else {
            viewModelScope.launch {
                val networkResult = citiesWeatherRepository.getCityWeather(lat,lon)
                _callResult.value = networkResult.callResult
                networkResult.data?.let {
                    cityWeather.value = it.asCityWeather()
                }
            }
//        }
    }
}
