package com.bussiness.ecommerce

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
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bussiness.ecommerce.Core.presentation.theme.AppTheme
import com.bussiness.ecommerce.Core.presentation.theme.Font
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily
import com.bussiness.ecommerce.Home.presentation.components.ProductsDiscoverSection
import e_commercefreelance.composeapp.generated.resources.Contact_us
import e_commercefreelance.composeapp.generated.resources.Copy_rights
import e_commercefreelance.composeapp.generated.resources.New_Arrivals
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.Stay_Up_To_Date
import e_commercefreelance.composeapp.generated.resources.facebook_icon
import e_commercefreelance.composeapp.generated.resources.instagram_icon
import e_commercefreelance.composeapp.generated.resources.website_icon
import e_commercefreelance.composeapp.generated.resources.whatsapp_icon
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource


@Preview
@Composable
fun Preview() {
    CompositionLocalProvider(
        LocalLayoutDirection provides LayoutDirection.Rtl
    ) {
        AppTheme {
            ProductsDiscoverSection(title = Res.string.New_Arrivals)
        }
    }
}




