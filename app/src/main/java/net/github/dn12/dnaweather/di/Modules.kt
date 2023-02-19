

package net.github.dn12.dnaweather.di

import android.content.Context
import android.content.SharedPreferences
import net.github.dn12.network.api.CitiesServiceImpl
import net.github.dn12.network.api.CitiesWeatherService
import net.github.dn12.network.repositories.CitiesRepository
import net.github.dn12.network.repositories.CitiesWeatherRepository
import net.github.dn12.storage.api.LocalCacheService
import net.github.dn12.storage.repositories.LocalCacheRepository
import net.github.dn12.dnaweather.ui.city_weather.CityWeatherViewModel
import net.github.dn12.dnaweather.ui.home.HomeViewModel
import net.github.dn12.dnaweather.util.Constants
import net.github.dn12.network.api.CitiesOnlineService
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit

val networkModule = module {

    //region sharedpreference
    single<SharedPreferences> {
        androidApplication().getSharedPreferences(
            androidApplication().packageName, Context.MODE_PRIVATE
        )
    }
    //endregion

    // region retrofit
    single {
        OkHttpClient.Builder()
            .connectTimeout(1, TimeUnit.MINUTES)
            .writeTimeout(1, TimeUnit.MINUTES)
            .readTimeout(1, TimeUnit.MINUTES)
            .addNetworkInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)).build()
    }
    single {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(get())
            .addConverterFactory(
                MoshiConverterFactory.create()
            ).build()
    }
    // endregion retrofit

    // region cities
    factory {
        get<Retrofit>().create<CitiesOnlineService>()
    }
    factory {
        CitiesServiceImpl(get())
    }
    single {
        CitiesRepository(get(),get())
    }
    // endregion cities

    // region city's weather
    factory {
        get<Retrofit>().create<CitiesWeatherService>()
    }
    single {
        CitiesWeatherRepository(get())
    }
    // endregion city's weather
    // endregion local cache
}

val localCacheModule = module {

    // region local cache
    factory {
        LocalCacheService()
    }
    single {
        LocalCacheRepository(get())
    }
}

val viewModelModule = module {
    viewModel {
        HomeViewModel(get())
    }
    viewModel {
        CityWeatherViewModel(get())
    }
}
