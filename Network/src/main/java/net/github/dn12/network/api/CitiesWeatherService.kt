

package net.github.dn12.network.api

import net.github.dn12.network.api.response.CityWeatherResponse
import net.github.dn12.network.api.response.ForcastResponse
import net.github.dn12.network.util.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CitiesWeatherService {

    @GET("/data/2.5/weather")
    suspend fun getCityWeather(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("appid") apiKey: String = Constants.API_KEY
    ): Response<CityWeatherResponse>

    @GET("/data/2.5/weather")
    suspend fun getCityWeather(
        @Query("id") cityId: Int,
        @Query("appid") apiKey: String = Constants.API_KEY
    ): Response<CityWeatherResponse>

    @GET("/data/2.5/forecast")
    suspend fun getCityForcastWeather(
        @Query("lat") latitude: Double,
        @Query("lon") longitude: Double,
        @Query("cnt") cnt: Int=3*8,
        @Query("appid") apiKey: String = Constants.API_KEY
    ): Response<ForcastResponse>
}
