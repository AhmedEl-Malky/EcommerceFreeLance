package com.bussiness.ecommerce.Home.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bussiness.ecommerce.Core.presentation.components.PrimaryButton
import com.bussiness.ecommerce.Core.presentation.theme.Font
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.Shop_now
import e_commercefreelance.composeapp.generated.resources.Slogan
import e_commercefreelance.composeapp.generated.resources.Subtitle
import e_commercefreelance.composeapp.generated.resources.hero
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun HeroSection(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.secondary)
            .padding(top = 40.dp, start = 16.dp, end = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    modifier = Modifier.width(330.dp),
                    text = stringResource(Res.string.Slogan),
                    fontSize = 34.sp,
                    color = MaterialTheme.colorScheme.onSecondary,
                    fontFamily = FontFamily(
                        font = Font.Elmessiri,
                        weight = FontWeight.Bold
                    ),
                    textAlign = TextAlign.Start,
                    lineHeight = 38.sp,
                    letterSpacing = 0.sp
                )
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = stringResource(Res.string.Subtitle),
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onTertiary,
                    fontFamily = FontFamily(
                        weight = FontWeight.Normal
                    ),
                    textAlign = TextAlign.Start,
                )
            }
            PrimaryButton(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp)
            ) {
                Text(
                    text = stringResource(Res.string.Shop_now),
                    fontSize = 18.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Medium
                    ),
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }
            Image(
                modifier = Modifier.scale(1.05f),
                painter = painterResource(Res.drawable.hero),
                contentDescription = "Hero Image",
            )
        }
    }
}