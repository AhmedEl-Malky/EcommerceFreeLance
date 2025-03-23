package com.bussiness.ecommerce.Home.presentation

data class HomeState(
    val searchQuery:String = "",
    val isLoading: Boolean = false,
    val isSearchBarVisible: Boolean = false,
)