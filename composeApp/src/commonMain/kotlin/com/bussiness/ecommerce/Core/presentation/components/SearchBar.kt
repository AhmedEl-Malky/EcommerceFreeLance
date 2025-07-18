package com.bussiness.ecommerce.Core.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.Search_for_products
import e_commercefreelance.composeapp.generated.resources.search_icon
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun SearchBar(
    query:String,
    onQueryChange:(String) -> Unit
){
    val focusRequester = remember { FocusRequester() }
    LaunchedEffect(Unit){
        focusRequester.requestFocus()
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, bottom = 8.dp),
    ) {
        PrimaryTextField(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
                .focusRequester(focusRequester),
            value = query,
            onValueChange = { onQueryChange(it) },
            placeholder = {
                Text(
                    modifier = Modifier.padding(start = 0.5.dp),
                    text = stringResource(Res.string.Search_for_products),
                    color = MaterialTheme.colorScheme.surfaceContainerHighest,
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
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