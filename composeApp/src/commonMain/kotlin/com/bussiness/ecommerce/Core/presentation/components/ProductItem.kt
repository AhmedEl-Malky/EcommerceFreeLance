package com.bussiness.ecommerce.Core.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
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

            Row(
                modifier = Modifier.fillMaxWidth().padding(end = 6.dp),
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = "120 ج",
                        fontSize = 24.sp,
                        fontFamily = FontFamily(

                            weight = FontWeight.Bold
                        ),
                        color = MaterialTheme.colorScheme.onBackground
                    )
                    Text(
                        text = "200 ج",
                        fontSize = 20.sp,
                        fontFamily = FontFamily(
                            weight = FontWeight.Bold
                        ),
                        textDecoration = TextDecoration.LineThrough,
                        color = MaterialTheme.colorScheme.tertiary
                    )
                }
                Text(
                    modifier = Modifier
                        .clip(RoundedCornerShape(50.dp))
                        .background(MaterialTheme.colorScheme.error)
                        .padding(vertical = 3.dp, horizontal = 8.dp),
                    text = "20%-",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Medium
                    ),
                    color = MaterialTheme.colorScheme.onError
                )
            }

        }
    }
}