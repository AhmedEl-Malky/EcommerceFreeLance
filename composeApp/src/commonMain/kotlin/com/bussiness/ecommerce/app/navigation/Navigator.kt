package com.bussiness.ecommerce.app.navigation

import androidx.navigation.NavController

class Navigator(
    private val navController: NavController
) {
    fun navigate(route: Route){
        when(route){
            Route.AppGraph -> {}
            Route.Home -> navController.navigate(route)
            Route.Product -> navController.navigate(route)
            Route.Category -> navController.navigate(route)
            Route.AuthenticationGraph -> {}
            Route.Login -> navController.navigate(route)
            Route.Signup -> navController.navigate(route)
            Route.Cart -> navController.navigate(route)
        }
    }
}