package com.bussiness.ecommerce.app.navigation

import kotlinx.serialization.Serializable

sealed interface Route {
    @Serializable
    data object AppGraph : Route

    @Serializable
    data object AuthenticationGraph : Route

    @Serializable
    data object Login:Route

    @Serializable
    data object Signup:Route

    @Serializable
    data object Home : Route

    @Serializable
    data object Product : Route

    @Serializable
    data object Category : Route

    @Serializable
    data object Cart : Route

}