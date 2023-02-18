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
