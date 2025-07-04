package com.bussiness.ecommerce.Core.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.hero
import org.jetbrains.compose.resources.painterResource

@Composable
fun ProductItem(
    navigate:() -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = {
            navigate()
        },
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
            contentColor = MaterialTheme.colorScheme.background
        ),
        shape = RoundedCornerShape(14.dp)
    ){
        Column(
            modifier = modifier.width(200.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Image(
                modifier = modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(14.dp))
                    .background(MaterialTheme.colorScheme.secondary),
                painter = painterResource(Res.drawable.hero),
                contentDescription = "Product Image"
            )
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
                    modifier = modifier.fillMaxWidth().padding(end = 6.dp),
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
                            .padding(vertical = 2.dp, horizontal = 4.dp),
                        text = "20%-",
                        fontSize = 16.sp,
                        fontFamily = FontFamily(
                            weight = FontWeight.Medium
                        ),
                        color = MaterialTheme.colorScheme.onError,
                        textAlign = TextAlign.Center
                    )
                }

            }
        }
    }
}