

package net.github.dn12.network.repositories

import android.util.Log
import net.github.dn12.network.api.CitiesWeatherService
import net.github.dn12.network.api.response.CityWeatherResponse
import net.github.dn12.network.util.MyNetworkCallResult
import net.github.dn12.network.util.MyNetworkRequestResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.github.dn12.network.api.response.ForcastResponse

class CitiesWeatherRepository(
    private val citiesWeatherService: CitiesWeatherService
) {

    suspend fun getCityWeather(
        latitude: Double,
        longitude: Double,
    ): MyNetworkRequestResult<CityWeatherResponse> =
        withContext(Dispatchers.IO) {
            return@withContext try {
                val weather = citiesWeatherService.getCityWeather(latitude, longitude)
                    .body()
                if (weather != null) {
                    MyNetworkRequestResult.success(weather)
                } else {
                    MyNetworkRequestResult.error(
                        MyNetworkCallResult.ERROR
                    )
                }
            } catch (e: Exception) {
                MyNetworkRequestResult.error(
                    MyNetworkCallResult.ERROR_OUT_OF_REACH
                )
            }
        }

    suspend fun getCityWeather(
        cityId: Int
    ): MyNetworkRequestResult<CityWeatherResponse> =
        withContext(Dispatchers.IO) {
            return@withContext try {
                val weather = citiesWeatherService.getCityWeather(cityId)
                    .body()
                Log.e("TAG", "getCityWeather: "+ weather.toString() )
                if (weather != null) {
                    MyNetworkRequestResult.success(weather)
                } else {
                    MyNetworkRequestResult.error(
                        MyNetworkCallResult.ERROR
                    )
                }
            } catch (e: Exception) {

                MyNetworkRequestResult.error(
                    MyNetworkCallResult.ERROR_OUT_OF_REACH
                )
            }
        }


    suspend fun getCityForecastWeather(
        latitude: Double,
        longitude: Double,
    ): MyNetworkRequestResult<ForcastResponse> =
        withContext(Dispatchers.IO) {
            return@withContext try {
                val weather = citiesWeatherService.getCityForcastWeather(latitude, longitude)
                    .body()
                if (weather != null) {
                    MyNetworkRequestResult.success(weather)
                } else {
                    MyNetworkRequestResult.error(
                        MyNetworkCallResult.ERROR
                    )
                }
            } catch (e: Exception) {
                MyNetworkRequestResult.error(
                    MyNetworkCallResult.ERROR_OUT_OF_REACH
                )
            }
        }
}
