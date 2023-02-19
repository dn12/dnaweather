

package net.github.dn12.network.repositories

import net.github.dn12.network.api.CitiesServiceImpl
import net.github.dn12.network.model.City
import net.github.dn12.network.util.MyNetworkCallResult
import net.github.dn12.network.util.MyNetworkRequestResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import net.github.dn12.network.api.CitiesOnlineService

class CitiesRepository(
    private val service: CitiesServiceImpl,
    private val onlineServices : CitiesOnlineService
) {

    suspend fun getCities(): MyNetworkRequestResult<MutableList<City>> =
        withContext(Dispatchers.IO) {
            return@withContext try {
                val cities = service.getCities()
                MyNetworkRequestResult.success(cities)
            } catch (e: Exception) {
                MyNetworkRequestResult.error(
                    MyNetworkCallResult.ERROR
                )
            }
        }


    suspend fun searchCities(q: String): MyNetworkRequestResult<List<City>> =
        withContext(Dispatchers.IO) {
            return@withContext try {
                val cities = onlineServices.searchCity(q).body()
                if (cities != null) {
                    MyNetworkRequestResult.success(cities)
                } else {
                    MyNetworkRequestResult.error(
                        MyNetworkCallResult.ERROR
                    )
                }
            }catch (e: Exception) {
                e.printStackTrace()
                MyNetworkRequestResult.error(
                    MyNetworkCallResult.ERROR_OUT_OF_REACH
                )
            }
        }
}
