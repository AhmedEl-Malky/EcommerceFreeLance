package com.bussiness.ecommerce.category.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip

import androidx.compose.ui.unit.dp
import com.bussiness.ecommerce.Core.presentation.components.shimmer

@Composable
fun ShimmerProductItem(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.width(200.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .aspectRatio(1f)
                .clip(RoundedCornerShape(14.dp))
                .background(MaterialTheme.colorScheme.secondary)
                .shimmer(),
        )
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Box(
                modifier = Modifier.width(80.dp).height(16.dp).clip(RoundedCornerShape(6.dp)).shimmer()
            )
            Box(
                modifier = Modifier.fillMaxWidth().height(24.dp).clip(RoundedCornerShape(6.dp)).shimmer()
            )


        }
    }
}