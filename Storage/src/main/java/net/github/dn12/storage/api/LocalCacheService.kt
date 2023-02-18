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

package net.github.dn12.storage.api

import io.realm.Realm
import io.realm.RealmModel
import io.realm.kotlin.where

class LocalCacheService {

    fun <T : RealmModel> setCityWeather(
        cityWeather: T
    ) {
        Realm.getDefaultInstance()
            .executeTransactionAsync {
                it.insertOrUpdate(cityWeather)
            }
    }

    inline fun <reified T : RealmModel> getCityWeather(
        cityId: Int
    ): T? =
        Realm.getDefaultInstance()
            .where<T>()
            .findAll()
            .where()
            .equalTo("id", cityId)
            .findFirst()
}
