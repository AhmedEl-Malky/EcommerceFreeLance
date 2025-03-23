package com.bussiness.ecommerce.category.presentation

import androidx.compose.runtime.Composable

@Composable
fun CategoryScreen(
    state: CategoryState,
    onAction: (CategoryAction) -> Unit,
) {
    CategoryScreenContent(
        state = state,
        onAction = onAction
    )
}

@Composable
private fun CategoryScreenContent(
    state: CategoryState,
    onAction: (CategoryAction) -> Unit,
) {

}