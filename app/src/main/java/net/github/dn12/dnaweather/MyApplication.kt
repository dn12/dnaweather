

package net.github.dn12.dnaweather

import android.app.Application
import net.github.dn12.dnaweather.di.localCacheModule
import net.github.dn12.dnaweather.di.networkModule
import net.github.dn12.dnaweather.di.viewModelModule
import io.realm.Realm
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        startKoin {
            androidContext(this@MyApplication)
            modules(
                listOf(
                    networkModule,
                    localCacheModule,
                    viewModelModule
                )
            )
        }
    }
}
