package com.nuriua.weatherapp.presentation.root

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.extensions.compose.jetpack.stack.Children
import com.nuriua.weatherapp.WeatherApp
import com.nuriua.weatherapp.presentation.details.DetailsComponent
import com.nuriua.weatherapp.presentation.details.DetailsContent
import com.nuriua.weatherapp.presentation.favourite.FavouriteContent
import com.nuriua.weatherapp.presentation.search.SearchContent
import com.nuriua.weatherapp.presentation.ui.theme.WeatherAppTheme

@Composable
fun RootContent(component: RootComponent) {
    WeatherAppTheme {
        Children(
            stack = component.stack
        ) {
            when(val instance = it.instance) {
                is RootComponent.Child.Details -> {
                    DetailsContent(component = instance.component)
                }
                is RootComponent.Child.Favourite -> {
                    FavouriteContent(component = instance.component)
                }
                is RootComponent.Child.Search -> {
                    SearchContent(component = instance.component)
                }
            }
        }
    }
}