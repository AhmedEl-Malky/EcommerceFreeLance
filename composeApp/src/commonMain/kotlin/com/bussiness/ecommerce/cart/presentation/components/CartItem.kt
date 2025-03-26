package com.bussiness.ecommerce.cart.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.hero
import e_commercefreelance.composeapp.generated.resources.plus_icon
import e_commercefreelance.composeapp.generated.resources.trash_icon
import org.jetbrains.compose.resources.painterResource

@Composable
fun CartItem(){
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
            .border(width = 1.dp, color = MaterialTheme.colorScheme.outline, shape = RoundedCornerShape(20.dp))
            .padding(14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .weight(1.3f)
                .aspectRatio(1f),
            painter = painterResource(Res.drawable.hero),
            contentDescription = "Product Img",
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(14.dp))
        Column(
            modifier = Modifier
                .weight(2f)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 2.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.weight(1f),
                    text = "إسم المنتج",
                    fontSize = 20.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Bold
                    ),
                    color = MaterialTheme.colorScheme.onBackground,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                IconButton(
                    onClick = {},
                ) {
                    Icon(
                        painter = painterResource(Res.drawable.trash_icon),
                        contentDescription = "Delete product from cart",
                        tint = MaterialTheme.colorScheme.onError
                    )
                }
            }
            Text(
                text = "الحجم : كبير",
                fontSize = 16.sp,
                fontFamily = FontFamily(
                    weight = FontWeight.Normal
                ),
                color = MaterialTheme.colorScheme.tertiary
            )
            Text(
                modifier = Modifier.padding(bottom = 11.dp),
                text = "اللون : أسود",
                fontSize = 16.sp,
                fontFamily = FontFamily(
                    weight = FontWeight.Normal
                ),
                color = MaterialTheme.colorScheme.tertiary
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "120 ج",
                    fontSize = 20.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Bold
                    ),
                    color = MaterialTheme.colorScheme.onBackground
                )

                Row(
                    modifier = Modifier
                        .clip(RoundedCornerShape(50.dp))
                        .background(MaterialTheme.colorScheme.secondary),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(Res.drawable.plus_icon),
                            contentDescription = "Increase products count"
                        )
                    }
                    Text(
                        text = "99",
                        fontSize = 16.sp,
                        fontFamily = FontFamily(
                            weight = FontWeight.Medium
                        )
                    )
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(Res.drawable.plus_icon),
                            contentDescription = "Increase products count"
                        )
                    }
                }
            }
        }

    }
}