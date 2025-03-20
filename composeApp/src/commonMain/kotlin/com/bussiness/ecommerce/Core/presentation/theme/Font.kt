package com.bussiness.ecommerce.Core.presentation.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.ZainBlack
import e_commercefreelance.composeapp.generated.resources.ZainBold
import e_commercefreelance.composeapp.generated.resources.ZainExtraBold
import e_commercefreelance.composeapp.generated.resources.ZainExtraLight
import e_commercefreelance.composeapp.generated.resources.ZainLight
import e_commercefreelance.composeapp.generated.resources.ZainRegular
import org.jetbrains.compose.resources.Font

val ZainBlack = Res.font.ZainBlack
val ZainBold = Res.font.ZainExtraBold
val ZainMedium = Res.font.ZainBold
val ZainExtraLight = Res.font.ZainExtraLight
val ZainRegular = Res.font.ZainRegular
val ZainLight = Res.font.ZainLight


@Composable
fun FontFamily(
    weight: FontWeight
): FontFamily {
    return when (weight) {
        FontWeight.Bold -> FontFamily(
            Font(
                resource = ZainBold,
                weight = weight
            )
        )

        FontWeight.Medium -> FontFamily(
            Font(
                resource = ZainMedium,
                weight = weight
            )
        )

        FontWeight.Light -> FontFamily(
            Font(
                resource = ZainLight,
                weight = weight
            )
        )

        FontWeight.Black -> FontFamily(
            Font(
                resource = ZainBlack,
                weight = weight
            )
        )

        FontWeight.ExtraLight -> FontFamily(
            Font(
                resource = ZainExtraLight,
                weight = weight
            )
        )

        else -> FontFamily(
            Font(
                resource = ZainRegular,
                weight = weight
            )
        )
    }
}
