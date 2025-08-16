package com.nuriua.weatherapp.domain.entity

data class ForeCast(
    val currentWeather: Weather,
    val upcoming: List<Weather>
)