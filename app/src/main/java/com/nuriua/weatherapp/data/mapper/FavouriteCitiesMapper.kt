package com.nuriua.weatherapp.data.mapper

import com.nuriua.weatherapp.data.local.model.CityDbModel
import com.nuriua.weatherapp.domain.entity.City

fun City.toDbModel(): CityDbModel = CityDbModel(id, name, country)

fun CityDbModel.toEntity(): City = City(id, name, country)

fun List<CityDbModel>.toEntities(): List<City> = map { it.toEntity()}