

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
