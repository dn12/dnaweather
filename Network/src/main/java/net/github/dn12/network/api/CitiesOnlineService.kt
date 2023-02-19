

package net.github.dn12.network.api

import net.github.dn12.network.api.response.CityWeatherResponse
import net.github.dn12.network.model.City
import net.github.dn12.network.util.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CitiesOnlineService {
//    http://api.openweathermap.org/geo/1.0/direct?q={city name},{state code},{country code}&limit={limit}&appid={API key}

    @GET("/geo/1.0/direct")
    suspend fun searchCity(
        @Query("q") q: String,
        @Query("limit") limit: String = Constants.LIMIT,
        @Query("appid") apiKey: String = Constants.API_KEY
    ): Response<List<City>>
}
