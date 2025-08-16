package com.nuriua.weatherapp.domain.repository

import com.nuriua.weatherapp.domain.entity.City

interface SearchRepository {

    suspend fun search(query: String): List<City>
}