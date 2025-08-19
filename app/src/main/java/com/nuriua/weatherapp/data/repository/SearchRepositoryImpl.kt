package com.nuriua.weatherapp.data.repository

import com.nuriua.weatherapp.data.mapper.toEntities
import com.nuriua.weatherapp.data.network.api.ApiService
import com.nuriua.weatherapp.domain.entity.City
import com.nuriua.weatherapp.domain.repository.SearchRepository
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : SearchRepository {
    override suspend fun search(query: String): List<City> {
        return apiService.searchCity(query).toEntities()
    }
}