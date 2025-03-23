package com.bussiness.ecommerce.Core.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bussiness.ecommerce.Core.presentation.theme.Font
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily
import e_commercefreelance.composeapp.generated.resources.Contact_us
import e_commercefreelance.composeapp.generated.resources.Copy_rights
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.Stay_Up_To_Date
import e_commercefreelance.composeapp.generated.resources.facebook_icon
import e_commercefreelance.composeapp.generated.resources.instagram_icon
import e_commercefreelance.composeapp.generated.resources.whatsapp_icon
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun FooterSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 50.dp)
            .background(MaterialTheme.colorScheme.primary)
            .padding(
                top = 30.dp,
                bottom = 28.dp,
                start = 24.dp,
                end = 24.dp
            ),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = stringResource(Res.string.Stay_Up_To_Date),
            fontSize = 32.sp,
            fontFamily = FontFamily(
                font = Font.Elmessiri,
                weight = FontWeight.Bold
            ),
            color = MaterialTheme.colorScheme.onPrimary,
            lineHeight = 36.sp
        )
        Text(
            text = stringResource(Res.string.Contact_us),
            fontSize = 24.sp,
            fontFamily = FontFamily(
                weight = FontWeight.Medium
            ),
            color = MaterialTheme.colorScheme.onPrimary
        )
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Button(
                onClick = {},
                shape = RoundedCornerShape(100.dp),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.background,
                    contentColor = MaterialTheme.colorScheme.tertiary
                ),
                border = BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.outline),
                modifier = Modifier.size(48.dp),
            ) {
                Text(
                    text = "Web",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Medium
                    ),
                    color = MaterialTheme.colorScheme.primary,
                    textAlign = TextAlign.Center
                )
            }
            Button(
                onClick = {},
                shape = RoundedCornerShape(100.dp),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.background,
                    contentColor = MaterialTheme.colorScheme.tertiary
                ),
                border = BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.outline),
                modifier = Modifier.size(48.dp)
            ) {
                Icon(
                    painter = painterResource(Res.drawable.instagram_icon),
                    contentDescription = "Contact us via instagram",
                    tint = MaterialTheme.colorScheme.primary
                )
            }
            Button(
                onClick = {},
                shape = RoundedCornerShape(100.dp),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.background,
                    contentColor = MaterialTheme.colorScheme.tertiary
                ),
                border = BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.outline),
                modifier = Modifier.size(48.dp)
            ) {
                Icon(
                    painter = painterResource(Res.drawable.facebook_icon),
                    contentDescription = "Contact us via Facebook",
                    tint = MaterialTheme.colorScheme.primary
                )
            }
            Button(
                onClick = {},
                shape = RoundedCornerShape(100.dp),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.background,
                    contentColor = MaterialTheme.colorScheme.tertiary
                ),
                border = BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.outline),
                modifier = Modifier.size(48.dp)
            ) {
                Icon(
                    painter = painterResource(Res.drawable.whatsapp_icon),
                    contentDescription = "Contact us via whatsApp",
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        }
        Spacer(modifier = Modifier.size(12.dp))
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = stringResource(Res.string.Copy_rights),
            fontSize = 14.sp,
            fontFamily = FontFamily(
                weight = FontWeight.Normal
            ),
            color = MaterialTheme.colorScheme.background,
            textAlign = TextAlign.Center
        )
    }
}