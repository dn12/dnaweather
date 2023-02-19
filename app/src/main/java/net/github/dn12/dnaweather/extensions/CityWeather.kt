

package net.github.dn12.dnaweather.extensions

import net.github.dn12.network.api.response.CityWeatherResponse
import net.github.dn12.storage.extensions.asCelsius
import net.github.dn12.storage.extensions.asSunrisePST
import net.github.dn12.storage.model.CityWeather
import java.util.Calendar

fun CityWeatherResponse.asCityWeather(): CityWeather =
    CityWeather(
        id = id,
        name = name,
        weatherMain = weather.first().main,
        temp = main.temp.asCelsius(),
        tempMin = main.tempMin.asCelsius(),
        tempMax = main.tempMax.asCelsius(),
        feelsLike = main.feelsLike.asCelsius(),
        windSpeed = wind.speed,
        sysSunrise = sys.sunrise.asSunrisePST(),
        timeInMillis = dt * 1000
    )
