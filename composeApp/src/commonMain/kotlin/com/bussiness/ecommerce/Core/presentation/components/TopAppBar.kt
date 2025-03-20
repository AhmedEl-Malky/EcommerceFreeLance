package com.bussiness.ecommerce.Core.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.cart_icon
import e_commercefreelance.composeapp.generated.resources.menu_icon
import e_commercefreelance.composeapp.generated.resources.profile_icon
import e_commercefreelance.composeapp.generated.resources.search_icon
import org.jetbrains.compose.resources.painterResource

@Composable
fun TopAppBar(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
            .padding(horizontal = 16.dp, vertical = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier.height(IntrinsicSize.Max),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ){
            Icon(
                modifier = Modifier.size(24.dp),
                painter = painterResource(Res.drawable.menu_icon),
                contentDescription = "Menu",
                tint = MaterialTheme.colorScheme.primary
            )

            Text(
                text = "SHOP.CO",
                fontSize = 26.sp,
                fontFamily = FontFamily(
                    weight = FontWeight.Bold
                ),
                color = MaterialTheme.colorScheme.primary
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            IconToggleButton(
                checked = false,
                onCheckedChange = { },
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