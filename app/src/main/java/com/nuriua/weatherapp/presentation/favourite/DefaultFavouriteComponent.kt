package com.nuriua.weatherapp.presentation.favourite

import com.arkivanov.decompose.ComponentContext
import com.nuriua.weatherapp.presentation.root.RootComponent

class DefaultFavouriteComponent(
    componentContext: ComponentContext
) : FavouriteComponent, ComponentContext by componentContext