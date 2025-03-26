package com.bussiness.ecommerce.cart.presentation

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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bussiness.ecommerce.Core.presentation.theme.Font
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily
import com.bussiness.ecommerce.app.navigation.Navigator
import com.bussiness.ecommerce.cart.presentation.components.CartItem
import com.bussiness.ecommerce.cart.presentation.components.CheckoutSection
import e_commercefreelance.composeapp.generated.resources.Cart
import e_commercefreelance.composeapp.generated.resources.Home
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.Your_cart
import e_commercefreelance.composeapp.generated.resources.chevron
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun CartScreen(
    state: CartState,
    onAction: (CartAction) -> Unit,
    navigator: Navigator
) {
    CartScreenContent(
        state = state,
        onAction = onAction,
        navigator = navigator
    )
}

@Composable
private fun CartScreenContent(
    state: CartState,
    onAction: (CartAction) -> Unit,
    navigator: Navigator
) {
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
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(paddingValues),
            contentPadding = PaddingValues(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                HorizontalDivider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(MaterialTheme.colorScheme.outline)
                )
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 4.dp),
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
                        text = stringResource(Res.string.Cart),
                        fontSize = 16.sp,
                        fontFamily = FontFamily(
                            weight = FontWeight.Normal
                        ),
                        color = MaterialTheme.colorScheme.primary
                    )
                }
            }
            item {
                Text(
                    modifier = Modifier.padding(bottom = 4.dp),
                    text = stringResource(Res.string.Your_cart),
                    fontSize = 32.sp,
                    fontFamily = FontFamily(
                        font = Font.Elmessiri,
                        weight = FontWeight.Bold
                    ),
                    color = MaterialTheme.colorScheme.onBackground
                )
            }
            items(2){
                CartItem()
            }
            item {
                CheckoutSection()
            }
        }
    }
}
