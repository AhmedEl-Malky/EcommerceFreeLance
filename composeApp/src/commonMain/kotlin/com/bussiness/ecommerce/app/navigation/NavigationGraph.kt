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
import com.bussiness.ecommerce.authentication.presentation.login.presentation.LoginScreen
import com.bussiness.ecommerce.authentication.presentation.login.presentation.LoginViewModel
import com.bussiness.ecommerce.authentication.presentation.signup.presentation.SignupScreen
import com.bussiness.ecommerce.authentication.presentation.signup.presentation.SignupViewModel
import com.bussiness.ecommerce.cart.presentation.CartScreen
import com.bussiness.ecommerce.cart.presentation.CartViewModel
import com.bussiness.ecommerce.category.presentation.CategoryScreen
import com.bussiness.ecommerce.category.presentation.CategoryViewModel
import com.bussiness.ecommerce.product.presentation.ProductScreen
import com.bussiness.ecommerce.product.presentation.ProductViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun NavigationGraph(){
    val navController = rememberNavController()
    val navigator = remember { Navigator(navController) }
    NavHost(
        navController = navController,
        startDestination = Route.AppGraph
    ){
        navigation<Route.AppGraph>(
            startDestination = Route.AuthenticationGraph
        ){

            navigation<Route.AuthenticationGraph>(
                startDestination = Route.Login
            ){
                composable<Route.Login> {
                    val viewModel = koinViewModel<LoginViewModel>()
                    val state by viewModel.state.collectAsStateWithLifecycle()
                    LoginScreen(
                        state = state,
                        onAction = viewModel::onAction,
                        navigator = navigator
                    )
                }
                composable<Route.Signup> {
                    val viewModel = koinViewModel<SignupViewModel>()
                    val state by viewModel.state.collectAsStateWithLifecycle()
                    SignupScreen(
                        state = state,
                        onAction = viewModel::onAction,
                        navigator = navigator
                    )
                }
            }

            composable<Route.Home> {
                val viewModel = koinViewModel<HomeViewModel>()
                val state by viewModel.state.collectAsStateWithLifecycle()
                HomeScreen(
                    state = state,
                    onAction = viewModel::onAction,
                    navigator = navigator
                )
            }

            composable<Route.Product> {
                val viewModel = koinViewModel<ProductViewModel>()
                val state by viewModel.state.collectAsStateWithLifecycle()
                ProductScreen(
                    state = state,
                    onAction = viewModel::onAction,
                    navigator = navigator
                )
            }

            composable<Route.Category> {
                val viewModel = koinViewModel<CategoryViewModel>()
                val state by viewModel.state.collectAsStateWithLifecycle()
                CategoryScreen(
                    state = state,
                    onAction = viewModel::onAction,
                    navigator = navigator
                )
            }
            composable<Route.Cart> {
                val viewModel = koinViewModel<CartViewModel>()
                val state by viewModel.state.collectAsStateWithLifecycle()
                CartScreen(
                    state = state,
                    onAction = viewModel::onAction,
                    navigator = navigator
                )
            }
        }
    }
}