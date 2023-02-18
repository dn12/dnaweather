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
