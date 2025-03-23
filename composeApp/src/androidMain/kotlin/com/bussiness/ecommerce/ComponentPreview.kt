package com.bussiness.ecommerce

import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bussiness.ecommerce.Core.presentation.components.PrimaryButton
import com.bussiness.ecommerce.Core.presentation.components.ProductItem
import com.bussiness.ecommerce.Core.presentation.theme.AppTheme
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily
import e_commercefreelance.composeapp.generated.resources.Add_to_cart
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.minus_icon
import e_commercefreelance.composeapp.generated.resources.plus_icon
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Preview
@Composable
fun ComponentPreview() {
    AppTheme {

    }
}


