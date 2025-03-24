package com.bussiness.ecommerce.category.presentation

sealed interface CategoryAction {
    data object OnIsLoadingToggle : CategoryAction
}