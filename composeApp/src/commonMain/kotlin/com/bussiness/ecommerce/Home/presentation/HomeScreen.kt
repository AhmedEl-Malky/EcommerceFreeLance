package com.bussiness.ecommerce.Home.presentation

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.bussiness.ecommerce.Core.presentation.components.FooterSection
import com.bussiness.ecommerce.Core.presentation.components.SearchBar
import com.bussiness.ecommerce.Core.presentation.components.TopAppBar
import com.bussiness.ecommerce.Home.presentation.components.CategoriesSection
import com.bussiness.ecommerce.Home.presentation.components.CategoryCard
import com.bussiness.ecommerce.Home.presentation.components.HeroSection
import com.bussiness.ecommerce.Home.presentation.components.ProductsDiscoverSection
import e_commercefreelance.composeapp.generated.resources.New_Arrivals
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.Top_selling

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
    val lazyColumnState = rememberLazyListState()
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
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(paddingValues),
            state = lazyColumnState
        ) {
            item {
                AnimatedContent(
                    targetState = state.isSearchBarVisible,
                    transitionSpec = {
                        (fadeIn(animationSpec = tween(220, delayMillis = 90)) +
                                scaleIn(initialScale = 0.92f, animationSpec = tween(220, delayMillis = 90)))
                            .togetherWith(fadeOut(animationSpec = tween(90)))
                    },
                ){
                    if(state.isSearchBarVisible)
                        SearchBar(
                            query = state.searchQuery,
                            onQueryChange = { onAction(HomeAction.OnSearchQueryChange(it))}
                        )
                    else
                        HeroSection(state = lazyColumnState)
                }
            }
            item {
                ProductsDiscoverSection(title = Res.string.New_Arrivals)
            }
            item {
                ProductsDiscoverSection(title = Res.string.Top_selling)
            }
            item {
                CategoriesSection()
            }
            items(categories) {
                CategoryCard()
            }
            item {
                Spacer(
                    modifier = Modifier
                        .height(19.dp)
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .clip(
                            RoundedCornerShape(
                                bottomStart = 20.dp,
                                bottomEnd = 20.dp
                            )
                        )
                        .background(MaterialTheme.colorScheme.secondary)
                )
            }
            item {
                FooterSection()
            }
        }
    }
}

val categories = listOf(
    "1",
    "2",
    "3",
    "4"
)