package com.charlsgod.moviestest

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber

@HiltAndroidApp
class MoviesApp : Application() {

    override fun onCreate() {
        super.onCreate()

        val applicationScope = CoroutineScope(Dispatchers.Default)
        applicationScope.launch {
            Timber.plant(Timber.DebugTree())
        }
    }
}