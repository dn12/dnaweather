

package net.github.dn12.network.api.response
import com.squareup.moshi.JsonClass

import com.squareup.moshi.Json

@JsonClass(generateAdapter = true)
data class ForcastResponse(
    @Json(name = "cnt")
    val cnt: Int? = 0,
    @Json(name = "cod")
    val cod: String? = "",
    @Json(name = "list")
    val list: List<CityWeatherResponse?>? = listOf(),
    @Json(name = "message")
    val message: Int? = 0
)
