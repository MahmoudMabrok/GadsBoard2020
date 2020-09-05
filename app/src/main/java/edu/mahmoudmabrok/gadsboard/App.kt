package edu.mahmoudmabrok.gadsboard

import android.app.Application
import edu.mahmoudmabrok.gadsboard.di.module
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            applicationContext
            modules(
                listOf(
                    module
                )
            )
        }
    }
}