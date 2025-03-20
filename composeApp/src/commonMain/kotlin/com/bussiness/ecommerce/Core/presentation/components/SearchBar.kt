package com.bussiness.ecommerce.Core.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily
import com.bussiness.ecommerce.Core.presentation.theme.FontType
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.search_icon
import org.jetbrains.compose.resources.painterResource

@Composable
fun SearchBar(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, bottom = 8.dp),
    ) {
        PrimaryTextField(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            value = "",
            onValueChange = {},
            placeholder = {
                Text(
                    modifier = Modifier.padding(start = 0.5.dp),
                    text = "Search for products",
                    color = MaterialTheme.colorScheme.surfaceContainerHighest,
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        fontType = FontType.SATOSHI,
                        weight = FontWeight.Normal
                    )
                )
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(Res.drawable.search_icon),
                    contentDescription = "Search",
                    tint = MaterialTheme.colorScheme.surfaceContainerHighest
                )
            },
        )
    }
}