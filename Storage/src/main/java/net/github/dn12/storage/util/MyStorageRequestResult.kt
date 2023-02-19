

package net.github.dn12.storage.util

import net.github.dn12.storage.model.CityWeather

data class MyStorageRequestResult<out T>(
    val callResult: MyStorageCallResult,
    val data: CityWeather?
) {

    companion object {

        fun <T> success(data: CityWeather? = null): MyStorageRequestResult<T> =
            MyStorageRequestResult(
                MyStorageCallResult.SUCCESS,
                data
            )

        fun <T> error(callResultError: MyStorageCallResult): MyStorageRequestResult<T> =
            MyStorageRequestResult(
                callResultError,
                null
            )
    }
}
