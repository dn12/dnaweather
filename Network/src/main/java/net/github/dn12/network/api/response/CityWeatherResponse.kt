

package net.github.dn12.network.api.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CityWeatherResponse(
    var id: Int = 0,
    var name: String = "",
    var weather: MutableList<Weather> = mutableListOf(),
    var main: Main = Main(),
    var wind: Wind = Wind(),
    var sys: Sys = Sys(),
    var dt: Long = 0
)

@JsonClass(generateAdapter = true)
data class Weather(
    var main: String = ""
)

@JsonClass(generateAdapter = true)
data class Main(
    var temp: Double = 0.0,
    @Json(name = "feels_like") var feelsLike: Double = 0.0,
    @Json(name = "temp_min") var tempMin: Double = 0.0,
    @Json(name = "temp_max") var tempMax: Double = 0.0,
)

@JsonClass(generateAdapter = true)
data class Wind(
    var speed: Double = 0.0
)

@JsonClass(generateAdapter = true)
data class Sys(
    var sunrise: Long = 0
)
