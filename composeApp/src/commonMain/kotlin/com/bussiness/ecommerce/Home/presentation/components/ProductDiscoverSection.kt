package com.bussiness.ecommerce.Home.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bussiness.ecommerce.Core.presentation.components.ProductItem
import com.bussiness.ecommerce.Core.presentation.components.SecondaryButton
import com.bussiness.ecommerce.Core.presentation.theme.Font
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily
import com.bussiness.ecommerce.app.navigation.Navigator
import com.bussiness.ecommerce.app.navigation.Route
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.View_all
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun ProductsDiscoverSection(
    title: StringResource,
    navigator: Navigator
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
            .padding(top = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(title),
            fontSize = 32.sp,
            fontFamily = FontFamily(
                font = Font.Elmessiri,
                weight = FontWeight.Bold
            ),
            color = MaterialTheme.colorScheme.onBackground
        )
        Spacer(modifier = Modifier.height(32.dp))
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(list) {
                ProductItem(
                    navigate = { navigator.navigate(Route.Product)}
                )
            }
        }
        Spacer(modifier = Modifier.height(24.dp))
        SecondaryButton(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(46.dp)
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = stringResource(Res.string.View_all),
                fontSize = 14.sp,
                fontFamily = FontFamily(
                    weight = FontWeight.Medium
                ),
                color = MaterialTheme.colorScheme.onBackground
            )
        }
        Spacer(modifier = Modifier.height(40.dp))
        HorizontalDivider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .background(MaterialTheme.colorScheme.outline)
        )
    }
}

val list = listOf(
    "1",
    "2",
    "3",
    "4",
    "5",
    "6",
    "7",
    "8",
    "9",
    "10"
)
