package com.bussiness.ecommerce

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import com.bussiness.ecommerce.Core.presentation.components.TopAppBar
import com.bussiness.ecommerce.Core.presentation.theme.AppTheme
import com.bussiness.ecommerce.Home.presentation.components.HeroSection
import com.bussiness.ecommerce.Home.presentation.components.ProductsDiscoverSection
import e_commercefreelance.composeapp.generated.resources.New_Arrivals
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.Top_selling


@Preview
@Composable
fun Preview() {
    CompositionLocalProvider(
        LocalLayoutDirection provides LayoutDirection.Rtl
    ) {
        AppTheme {
            Scaffold(
                topBar = {
                    TopAppBar()
                }
            ) { paddingValues ->
                LazyColumn(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.background)
                        .padding(paddingValues)
                ) {
                    item {
                        HeroSection()
                    }
                    item {
                        ProductsDiscoverSection(title = Res.string.New_Arrivals)
                    }
                    item {
                        ProductsDiscoverSection(title = Res.string.Top_selling)
                    }
                }
            }
        }
    }
}

