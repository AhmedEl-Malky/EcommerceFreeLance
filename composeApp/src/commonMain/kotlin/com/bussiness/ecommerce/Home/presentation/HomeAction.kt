package com.bussiness.ecommerce.Home.presentation

sealed interface HomeAction {
    data class OnSearchBarVisibilityToggle(val isVisible: Boolean) : HomeAction
    data class OnSearchQueryChange(val query:String) : HomeAction
}