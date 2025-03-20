package com.bussiness.ecommerce.Core.presentation.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import e_commercefreelance.composeapp.generated.resources.IntegralcfBlack
import e_commercefreelance.composeapp.generated.resources.IntegralcfBold
import e_commercefreelance.composeapp.generated.resources.IntegralcfExtrabold
import e_commercefreelance.composeapp.generated.resources.IntegralcfMedium
import e_commercefreelance.composeapp.generated.resources.IntegralcfRegular
import e_commercefreelance.composeapp.generated.resources.IntegralcfSemibold
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.SatoshiBlack
import e_commercefreelance.composeapp.generated.resources.SatoshiBold
import e_commercefreelance.composeapp.generated.resources.SatoshiLight
import e_commercefreelance.composeapp.generated.resources.SatoshiMedium
import e_commercefreelance.composeapp.generated.resources.SatoshiRegular
import org.jetbrains.compose.resources.Font

val SatoshiBlack = Res.font.SatoshiBlack
val SatoshiBold = Res.font.SatoshiBold
val SatoshiRegular = Res.font.SatoshiRegular
val SatoshiMedium = Res.font.SatoshiMedium
val SatoshiLight = Res.font.SatoshiLight


val IntegralCFBlack = Res.font.IntegralcfBlack
val IntegralCFBold = Res.font.IntegralcfBold
val IntegralCFExtraBold = Res.font.IntegralcfExtrabold
val IntegralCFMedium = Res.font.IntegralcfMedium
val IntegralCFRegular = Res.font.IntegralcfRegular
val IntegralCFSemiBold = Res.font.IntegralcfSemibold



enum class FontType{
    SATOSHI,
    INTEGRAL_CF
}

@Composable
fun FontFamily(
    fontType: FontType,
    weight: FontWeight
):FontFamily {
    return if(fontType == FontType.SATOSHI){
        when (weight) {
            FontWeight.Bold -> FontFamily(
                Font(
                    resource = SatoshiBold,
                    weight = weight
                )
            )

            FontWeight.Medium -> FontFamily(
                Font(
                    resource = SatoshiMedium,
                    weight = weight
                )
            )

            FontWeight.Light -> FontFamily(
                Font(
                    resource = SatoshiLight,
                    weight = weight
                )
            )

            FontWeight.Black -> FontFamily(
                Font(
                    resource = SatoshiBlack,
                    weight = weight
                )
            )

            else -> FontFamily(
                Font(
                    resource = SatoshiRegular,
                    weight = weight
                )
            )
        }
    }else{
        when (weight) {
            FontWeight.Bold -> FontFamily(
                Font(
                    resource = IntegralCFBold,
                    weight = weight
                )
            )

            FontWeight.Medium -> FontFamily(
                Font(
                    resource = IntegralCFMedium,
                    weight = weight
                )
            )

            FontWeight.ExtraBold -> FontFamily(
                Font(
                    resource = IntegralCFExtraBold,
                    weight = weight
                )
            )

            FontWeight.Black -> FontFamily(
                Font(
                    resource = IntegralCFBlack,
                    weight = weight
                )
            )

            FontWeight.SemiBold -> FontFamily(
                Font(
                    resource = IntegralCFSemiBold,
                    weight = weight
                )
            )

            else -> FontFamily(
                Font(
                    resource = IntegralCFRegular,
                    weight = weight
                )
            )
        }
    }
}