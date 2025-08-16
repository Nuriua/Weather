package com.nuriua.weatherapp.domain.repository

import com.nuriua.weatherapp.domain.entity.City
import com.nuriua.weatherapp.domain.entity.ForeCast
import com.nuriua.weatherapp.domain.entity.Weather
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {

    suspend fun getWeather(cityId: Int): Weather

    suspend fun getForecast(cityId: Int): ForeCast
}