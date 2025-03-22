package com.bussiness.ecommerce.app.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.bussiness.ecommerce.Home.presentation.HomeScreen
import com.bussiness.ecommerce.Home.presentation.HomeViewModel

@Composable
fun NavigationGraph(){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Route.AppGraph
    ){
        navigation<Route.AppGraph>(
            startDestination = Route.Home
        ){
            composable<Route.Home> {
                val viewModel = remember { HomeViewModel() }
                val state by viewModel.state.collectAsStateWithLifecycle()
                HomeScreen(
                    state = state,
                    onAction = viewModel::onAction
                )
            }
        }
    }
}