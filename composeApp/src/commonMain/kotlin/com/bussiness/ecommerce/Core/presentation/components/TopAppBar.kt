package com.bussiness.ecommerce.Core.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bussiness.ecommerce.Core.presentation.theme.Font
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.cart_icon
import e_commercefreelance.composeapp.generated.resources.profile_icon
import e_commercefreelance.composeapp.generated.resources.search_icon
import org.jetbrains.compose.resources.painterResource

@Composable
fun TopAppBar(
    isSearchBarVisible:Boolean,
    toggleSearchBar: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
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
        ) {
            IconToggleButton(
                checked = isSearchBarVisible,
                onCheckedChange = {
                    toggleSearchBar(it)
                },
                colors = IconButtonDefaults.iconToggleButtonColors(
                    containerColor = MaterialTheme.colorScheme.background,
                    contentColor = MaterialTheme.colorScheme.primary,
                    checkedContainerColor = MaterialTheme.colorScheme.primary,
                    checkedContentColor = MaterialTheme.colorScheme.onPrimary
                )
            ) {
                Icon(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(Res.drawable.search_icon),
                    contentDescription = "Search"
                )

            }
            IconButton(
                onClick = {}
            ) {
                Icon(
                    painter = painterResource(Res.drawable.cart_icon),
                    contentDescription = "Go to Cart",
                )
            }
            IconButton(
                onClick = {}
            ) {
                Icon(
                    painter = painterResource(Res.drawable.profile_icon),
                    contentDescription = "Go to Cart",
                )
            }
        }
    }
}