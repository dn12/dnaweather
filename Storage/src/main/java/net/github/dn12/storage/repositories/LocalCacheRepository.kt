

package net.github.dn12.storage.repositories

import net.github.dn12.storage.api.LocalCacheService
import net.github.dn12.storage.util.MyStorageCallResult
import net.github.dn12.storage.util.MyStorageRequestResult
import io.realm.RealmModel

class LocalCacheRepository(
    val service: LocalCacheService
) {

    fun <T : RealmModel> setCityWeather(
        cityWeather: T
    ): MyStorageRequestResult<T> = try {
        service.setCityWeather(cityWeather)
        MyStorageRequestResult.success()
    } catch (e: Exception) {
        MyStorageRequestResult.error(
            MyStorageCallResult.ERROR
        )
    }

    inline fun <reified T : RealmModel> getCityWeather(
        cityId: Int
    ): MyStorageRequestResult<T> = try {
        val cityWeather = service.getCityWeather<T>(cityId)
        if (cityWeather != null) {
            MyStorageRequestResult.success()
        } else {
            MyStorageRequestResult.error(
                MyStorageCallResult.ERROR_NOT_FOUND
            )
        }
    } catch (e: Exception) {
        MyStorageRequestResult.error(
            MyStorageCallResult.ERROR
        )
    }
}
