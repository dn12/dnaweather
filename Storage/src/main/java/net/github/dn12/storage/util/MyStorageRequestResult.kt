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
