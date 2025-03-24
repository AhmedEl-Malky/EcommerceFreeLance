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
import com.bussiness.ecommerce.category.presentation.CategoryScreen
import com.bussiness.ecommerce.category.presentation.CategoryViewModel
import com.bussiness.ecommerce.product.presentation.ProductScreen
import com.bussiness.ecommerce.product.presentation.ProductViewModel

@Composable
fun NavigationGraph(){
    val navController = rememberNavController()
    val navigator = remember { Navigator(navController) }
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
                    onAction = viewModel::onAction,
                    navigator = navigator
                )
            }

            composable<Route.Product> {
                val viewModel = remember { ProductViewModel() }
                val state by viewModel.state.collectAsStateWithLifecycle()
                ProductScreen(
                    state = state,
                    onAction = viewModel::onAction,
                    navigator = navigator
                )
            }

            composable<Route.Category> {
                val viewModel = remember { CategoryViewModel() }
                val state by viewModel.state.collectAsStateWithLifecycle()
                CategoryScreen(
                    state = state,
                    onAction = viewModel::onAction,
                    navigator = navigator
                )
            }
        }
    }
}