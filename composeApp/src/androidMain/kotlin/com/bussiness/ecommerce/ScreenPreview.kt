package com.bussiness.ecommerce



import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext

import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes

import androidx.compose.ui.unit.LayoutDirection
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

import com.bussiness.ecommerce.Core.presentation.theme.AppTheme
import com.bussiness.ecommerce.app.navigation.Navigator
import com.bussiness.ecommerce.category.presentation.CategoryScreen
import com.bussiness.ecommerce.category.presentation.CategoryState

@PreviewScreenSizes
@Composable
fun ScreenPreview() {
    CompositionLocalProvider(
        LocalLayoutDirection provides LayoutDirection.Rtl
    ) {
        AppTheme {
            CategoryScreen(
                state = CategoryState(isLoading = false),
                onAction = {},
                navigator = Navigator(NavController(LocalContext.current))
            )
        }
    }
}







