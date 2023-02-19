

package net.github.dn12.storage.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class CityWeather(
    @PrimaryKey var id: Int = 0,
    var name: String = "",
    var weatherMain: String = "",
    var temp: Double = 0.0,
    var tempMin: Double = 0.0,
    var tempMax: Double = 0.0,
    var feelsLike: Double = 0.0,
    var windSpeed: Double = 0.0,
    var sysSunrise: String = "",
    var timeInMillis: Long = 0
) : RealmObject()
