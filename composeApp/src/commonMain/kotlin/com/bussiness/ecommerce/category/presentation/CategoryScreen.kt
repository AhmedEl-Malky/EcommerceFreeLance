package com.bussiness.ecommerce.category.presentation

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bussiness.ecommerce.Core.presentation.components.FooterSection
import com.bussiness.ecommerce.Core.presentation.components.ProductItem
import com.bussiness.ecommerce.Core.presentation.theme.Font
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily
import com.bussiness.ecommerce.app.navigation.Navigator
import com.bussiness.ecommerce.app.navigation.Route
import com.bussiness.ecommerce.category.presentation.components.ShimmerProductItem
import e_commercefreelance.composeapp.generated.resources.Home
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.cart_icon
import e_commercefreelance.composeapp.generated.resources.chevron
import e_commercefreelance.composeapp.generated.resources.filter_icon
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun CategoryScreen(
    state: CategoryState,
    onAction: (CategoryAction) -> Unit,
    navigator: Navigator
) {
    CategoryScreenContent(
        state = state,
        onAction = onAction,
        navigator = navigator
    )
}

@Composable
private fun CategoryScreenContent(
    state: CategoryState,
    onAction: (CategoryAction) -> Unit,
    navigator: Navigator
) {
    LaunchedEffect(Unit) {
        delay(3000)
        onAction(CategoryAction.OnIsLoadingToggle)
    }
    Scaffold(
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
                    .windowInsetsPadding(WindowInsets.statusBars),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "SHOP.CO",
                    fontSize = 26.sp,
                    fontFamily = FontFamily(
                        font = Font.Elmessiri,
                        weight = FontWeight.Bold
                    ),
                    color = MaterialTheme.colorScheme.primary
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(Res.drawable.cart_icon),
                            contentDescription = "Go to Cart",
                        )
                    }
                    IconButton(
                        onClick = {},
                    ) {
                        Icon(
                            modifier = Modifier
                                .size(24.dp)
                                .graphicsLayer {
                                    scaleX = -1f
                                },
                            painter = painterResource(Res.drawable.chevron),
                            contentDescription = "back",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                }
            }
        }
    ) { paddingValues ->

        LazyVerticalGrid(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(paddingValues),
            columns = GridCells.Fixed(count = 2),
            contentPadding = PaddingValues(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp),
            horizontalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            item(
                span = {
                    GridItemSpan(currentLineSpan = 2)
                }
            ) {
                HorizontalDivider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.outline)
                )
            }
            item(
                span = {
                    GridItemSpan(currentLineSpan = 2)
                }
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 6.dp),
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = stringResource(Res.string.Home),
                        fontSize = 16.sp,
                        fontFamily = FontFamily(
                            weight = FontWeight.Normal
                        ),
                        color = MaterialTheme.colorScheme.onTertiary
                    )
                    Icon(
                        modifier = Modifier
                            .size(16.dp)
                            .graphicsLayer {
                                this.scaleX = -1f
                            },
                        painter = painterResource(Res.drawable.chevron),
                        contentDescription = "path"
                    )
                    Text(
                        text = "الفئة",
                        fontSize = 16.sp,
                        fontFamily = FontFamily(
                            weight = FontWeight.Normal
                        ),
                        color = MaterialTheme.colorScheme.onTertiary
                    )
                }
            }
            item(
                span = {
                    GridItemSpan(currentLineSpan = 2)
                }
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            bottom = 5.dp,
                        ),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "الفئـة",
                            fontSize = 28.sp,
                            fontFamily = FontFamily(
                                weight = FontWeight.Bold
                            )
                        )
                        Text(
                            text = "عرض منتجات من فئـة ......",
                            fontSize = 14.sp,
                            fontFamily = FontFamily(
                                weight = FontWeight.Normal
                            ),
                            color = MaterialTheme.colorScheme.onTertiary
                        )
                    }
                    IconButton(
                        onClick = {},
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = MaterialTheme.colorScheme.surfaceContainerLowest
                        )
                    ) {
                        Icon(
                            painter = painterResource(Res.drawable.filter_icon),
                            contentDescription = "Filter",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                }
            }
            items(10) {
                AnimatedContent(
                    targetState = state.isLoading
                ) {
                    if (state.isLoading) {
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
            item(
                span = {
                    GridItemSpan(currentLineSpan = 2)
                }
            ) {
                HorizontalDivider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.outline)
                )
            }
//            item {  }
        }
    }
}