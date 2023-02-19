

package net.github.dn12.network.model
import com.squareup.moshi.JsonClass

import com.squareup.moshi.Json

@JsonClass(generateAdapter = true)
data class City(
    @Json(name = "country")
    val country: String? = "",
    @Json(name = "lat")
    val lat: Double? = 0.0,
    @Json(name = "lon")
    val lon: Double? = 0.0,
    @Json(name = "name")
    val name: String? = "",
    @Json(name = "state")
    val state: String? = ""
)


