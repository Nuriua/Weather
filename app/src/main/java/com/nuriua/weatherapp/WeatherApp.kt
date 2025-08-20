package com.nuriua.weatherapp

import android.app.Application
import com.nuriua.weatherapp.di.ApplicationComponent
import com.nuriua.weatherapp.di.DaggerApplicationComponent

class WeatherApp : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}