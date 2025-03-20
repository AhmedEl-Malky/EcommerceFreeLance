package com.bussiness.ecommerce.Core.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily

@Composable
fun ProductItem(){
    Column(
        modifier = Modifier.width(200.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .clip(RoundedCornerShape(14.dp))
                .background(MaterialTheme.colorScheme.secondary)
        ) {

        }
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = "إسم المنتج",
                fontSize = 16.sp,
                fontFamily = FontFamily(

                    weight = FontWeight.Bold
                ),
                textAlign = TextAlign.Start,
                color = MaterialTheme.colorScheme.onBackground
            )

            Text(
                text = "120 ج",
                fontSize = 20.sp,
                fontFamily = FontFamily(

                    weight = FontWeight.Bold
                ),
                color = MaterialTheme.colorScheme.onBackground
            )

        }
    }
}