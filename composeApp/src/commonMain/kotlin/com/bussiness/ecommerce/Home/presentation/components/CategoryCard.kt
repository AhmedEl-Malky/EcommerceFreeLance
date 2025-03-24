package com.bussiness.ecommerce.Home.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.category
import org.jetbrains.compose.resources.painterResource

@Composable
fun CategoryCard(
    navigate: () -> Unit
){
    Card(
        onClick = {
            navigate()
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .background(MaterialTheme.colorScheme.secondary)
            .padding(vertical = 8.dp, horizontal = 16.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background
        )
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.CenterEnd
            ) {
                Image(
                    modifier = Modifier.scale(2f),
                    painter = painterResource(Res.drawable.category),
                    contentDescription = "Category Image",
                    contentScale = ContentScale.Crop
                )
            }
            Text(
                modifier = Modifier.padding(
                    top = 16.dp,
                    start = 24.dp
                ),
                text = "فــئـــــــــــة\n ملابس الرجــال",
                fontSize = 24.sp,
                fontFamily = FontFamily(
                    weight = FontWeight.Bold,
                ),
                color = MaterialTheme.colorScheme.onBackground
            )
        }
    }
}