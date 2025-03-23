package com.bussiness.ecommerce.Home.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bussiness.ecommerce.Core.presentation.theme.Font
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily
import e_commercefreelance.composeapp.generated.resources.Browse_Categories
import e_commercefreelance.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.stringResource

@Composable
fun CategoriesSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 50.dp)
            .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
            .background(MaterialTheme.colorScheme.secondary)
            .padding(top = 40.dp),
    ){
        Text(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, bottom = 20.dp)
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.secondary),
            text = stringResource(Res.string.Browse_Categories),
            fontSize = 32.sp,
            color = MaterialTheme.colorScheme.onSecondary,
            fontFamily = FontFamily(
                font = Font.Elmessiri,
                weight = FontWeight.Bold
            ),
            textAlign = TextAlign.Center,
            lineHeight = 36.sp,
        )
    }
}