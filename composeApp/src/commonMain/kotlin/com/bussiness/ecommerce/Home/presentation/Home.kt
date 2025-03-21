package com.bussiness.ecommerce.Home.presentation

import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview
import com.bussiness.ecommerce.Core.presentation.theme.AppTheme

@Composable
fun HomeScreen(
    state: HomeState,
    onAction: (HomeAction) -> Unit,
) {
    HomeScreenContent(
        state = state,
        onAction = onAction
    )
}

@Composable
private fun HomeScreenContent(
    state: HomeState,
    onAction: (HomeAction) -> Unit,
) {

}

@Preview
@Composable
private fun Preview() {
    AppTheme {
        HomeScreen(
            state = HomeState(),
            onAction = {}
        )
    }
}