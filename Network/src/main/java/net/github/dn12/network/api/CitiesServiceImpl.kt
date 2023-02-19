

package net.github.dn12.network.api

import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import net.github.dn12.network.model.City

class CitiesServiceImpl(val sharePreverence : SharedPreferences) : CitiesService {

    override suspend fun getCities(): MutableList<City> {
        return Gson().fromJson(
            sharePreverence.getString("city",""),
            object : TypeToken<MutableList<City?>?>() {}.type
        )
    }

    override suspend fun saveCities(list :MutableList<City>) {
        sharePreverence.edit().putString("city",Gson().toJson(list)).apply()
    }

}
