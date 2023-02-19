

package net.github.dn12.network.api

import net.github.dn12.network.model.City

interface CitiesService {

    suspend fun getCities(): MutableList<City>
    suspend fun saveCities(list :MutableList<City>)
}
