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
        }
    }
}