package com.bussiness.ecommerce.Home.presentation

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.bussiness.ecommerce.Core.presentation.components.FooterSection
import com.bussiness.ecommerce.Core.presentation.components.ProductItem
import com.bussiness.ecommerce.Core.presentation.components.SearchBar
import com.bussiness.ecommerce.Core.presentation.components.TopAppBar
import com.bussiness.ecommerce.Home.presentation.components.CategoriesSection
import com.bussiness.ecommerce.Home.presentation.components.HeroSection
import com.bussiness.ecommerce.Home.presentation.components.ProductsDiscoverSection
import com.bussiness.ecommerce.app.navigation.Navigator
import com.bussiness.ecommerce.app.navigation.Route
import com.bussiness.ecommerce.category.presentation.components.ShimmerProductItem
import e_commercefreelance.composeapp.generated.resources.New_Arrivals
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.Top_selling

@Composable
fun HomeScreen(
    state: HomeState,
    onAction: (HomeAction) -> Unit,
    navigator: Navigator
) {
    HomeScreenContent(
        state = state,
        onAction = onAction,
        navigator = navigator
    )
}

@Composable
private fun HomeScreenContent(
    state: HomeState,
    onAction: (HomeAction) -> Unit,
    navigator: Navigator
) {
    val lazyColumnState = rememberLazyGridState()
    Scaffold(
        topBar = {
            TopAppBar(
                isSearchBarVisible = state.isSearchBarVisible,
                toggleSearchBar = {
                    onAction(HomeAction.OnSearchBarVisibilityToggle(it))
                }
            )
        }
    ) { paddingValues ->
        LazyVerticalGrid(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(paddingValues),
            state = lazyColumnState,
            columns = GridCells.Fixed(count = 2),
            verticalArrangement = Arrangement.spacedBy(24.dp),
        ) {
            item(span = { GridItemSpan(2) }) {
                AnimatedContent(
                    targetState = state.isSearchBarVisible,
                    transitionSpec = {
                        (fadeIn(animationSpec = tween(220, delayMillis = 90)) +
                                scaleIn(
                                    initialScale = 0.92f,
                                    animationSpec = tween(220, delayMillis = 90)
                                ))
                            .togetherWith(fadeOut(animationSpec = tween(90)))
                    },
                ) { isSearchBarVisible ->
                    if (isSearchBarVisible)
                        SearchBar(
                            query = state.searchQuery,
                            onQueryChange = { onAction(HomeAction.OnSearchQueryChange(it)) }
                        )
                    else if (!isSearchBarVisible && state.searchQuery.isEmpty())
                        HeroSection(state = lazyColumnState)
                }
            }
            if (state.searchQuery.isNotEmpty()) {
                items(
                    count = 10,
                ) {
                    AnimatedVisibility(
                        modifier = Modifier.padding(horizontal = 7.dp),
                        visible = state.searchQuery.isNotEmpty()
                    ) {
                        if (state.isSearchResultLoading) {
                            ShimmerProductItem(
                                modifier = Modifier.fillMaxWidth()
                            )
                        } else {
                            ProductItem(
                                modifier = Modifier.fillMaxWidth(),
                                navigate = {
                                    navigator.navigate(Route.Product)
                                }
                            )
                        }
                    }
                }
            }
            if (state.searchQuery.isNotEmpty()) {
                item(span = { GridItemSpan(2) }) {
                    HorizontalDivider(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                            .background(MaterialTheme.colorScheme.outline)
                    )
                }
            }
            item(span = { GridItemSpan(2) }) {
                ProductsDiscoverSection(
                    title = Res.string.New_Arrivals,
                    navigator = navigator
                )
            }
            item(span = { GridItemSpan(2) }) {
                ProductsDiscoverSection(
                    title = Res.string.Top_selling,
                    navigator = navigator
                )
            }
            item(span = { GridItemSpan(2) }) {
                CategoriesSection()
            }
            item(span = { GridItemSpan(2) }) {
                FooterSection()
            }
        }
    }
}