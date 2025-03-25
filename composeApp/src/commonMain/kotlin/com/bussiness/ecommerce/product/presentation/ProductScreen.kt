package com.bussiness.ecommerce.product.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.FlowRowOverflow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedFilterChip
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SelectableChipElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bussiness.ecommerce.Core.presentation.components.FooterSection
import com.bussiness.ecommerce.Core.presentation.components.PrimaryButton
import com.bussiness.ecommerce.Core.presentation.theme.Font
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily
import com.bussiness.ecommerce.Home.presentation.components.ProductsDiscoverSection
import com.bussiness.ecommerce.app.navigation.Navigator
import com.bussiness.ecommerce.product.presentation.components.ProductImgSection
import e_commercefreelance.composeapp.generated.resources.Add_to_cart
import e_commercefreelance.composeapp.generated.resources.Choose_variant
import e_commercefreelance.composeapp.generated.resources.Home
import e_commercefreelance.composeapp.generated.resources.May_like
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.cart_icon
import e_commercefreelance.composeapp.generated.resources.chevron
import e_commercefreelance.composeapp.generated.resources.minus_icon
import e_commercefreelance.composeapp.generated.resources.plus_icon
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun ProductScreen(
    state: ProductState,
    onAction: (ProductAction) -> Unit,
    navigator: Navigator
) {
    ProductScreenContent(
        state = state,
        onAction = onAction,
        navigator = navigator
    )
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun ProductScreenContent(
    state: ProductState,
    onAction: (ProductAction) -> Unit,
    navigator: Navigator
) {
    Scaffold(
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
                    .windowInsetsPadding(WindowInsets.statusBars),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "SHOP.CO",
                    fontSize = 26.sp,
                    fontFamily = FontFamily(
                        font = Font.Elmessiri,
                        weight = FontWeight.Bold
                    ),
                    color = MaterialTheme.colorScheme.primary
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(Res.drawable.cart_icon),
                            contentDescription = "Go to Cart",
                        )
                    }
                    IconButton(
                        onClick = {},
                    ) {
                        Icon(
                            modifier = Modifier
                                .size(24.dp)
                                .graphicsLayer {
                                    scaleX = -1f
                                },
                            painter = painterResource(Res.drawable.chevron),
                            contentDescription = "back",
                            tint = MaterialTheme.colorScheme.primary
                        )
                    }
                }
            }
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(paddingValues),
        ) {
            item {
                HorizontalDivider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .background(MaterialTheme.colorScheme.outline)
                )
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp, start = 16.dp, end = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = stringResource(Res.string.Home),
                        fontSize = 16.sp,
                        fontFamily = FontFamily(
                            weight = FontWeight.Normal
                        ),
                        color = MaterialTheme.colorScheme.onTertiary
                    )
                    Icon(
                        modifier = Modifier
                            .size(16.dp)
                            .graphicsLayer {
                                this.scaleX = -1f
                            },
                        painter = painterResource(Res.drawable.chevron),
                        contentDescription = "path"
                    )
                    Text(
                        text = "الفئة",
                        fontSize = 16.sp,
                        fontFamily = FontFamily(
                            weight = FontWeight.Normal
                        ),
                        color = MaterialTheme.colorScheme.onTertiary
                    )
                    Icon(
                        modifier = Modifier
                            .size(16.dp)
                            .graphicsLayer {
                                scaleX = -1f
                            },
                        painter = painterResource(Res.drawable.chevron),
                        contentDescription = "path"
                    )
                    Text(
                        text = "إسم المنتج",
                        fontSize = 16.sp,
                        fontFamily = FontFamily(
                            weight = FontWeight.Normal
                        ),
                        color = MaterialTheme.colorScheme.primary
                    )
                }
            }
            item {
                ProductImgSection()
            }
            item {
                Text(
                    modifier = Modifier.fillMaxWidth().padding(start = 16.dp, end = 16.dp, bottom = 12.dp),
                    text = "إسم المنتــج",
                    fontSize = 28.sp,
                    fontFamily = FontFamily(
                        font = Font.Elmessiri,
                        weight = FontWeight.Bold
                    ),
                    color = MaterialTheme.colorScheme.onBackground
                )
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        verticalAlignment = Alignment.Bottom
                    ) {
                        Text(
                            text = "120 ج",
                            fontSize = 28.sp,
                            fontFamily = FontFamily(
                                weight = FontWeight.Bold
                            ),
                            color = MaterialTheme.colorScheme.onBackground
                        )
                        Text(
                            text = "220 ج",
                            fontSize = 24.sp,
                            fontFamily = FontFamily(
                                weight = FontWeight.Bold
                            ),
                            color = MaterialTheme.colorScheme.tertiary,
                            textDecoration = TextDecoration.LineThrough
                        )
                    }
                    Text(
                        modifier = Modifier
                            .clip(RoundedCornerShape(50.dp))
                            .background(MaterialTheme.colorScheme.error)
                            .padding(vertical = 3.dp, horizontal = 8.dp),
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
            item {
                Text(
                    modifier = Modifier.padding(
                        top = 20.dp,
                        bottom = 24.dp,
                        end = 18.dp,
                        start = 16.dp
                    ),
                    text = "هذا التيشيرت الجرافيكي مثالي لأي مناسبة. مصنوع من قماش ناعم وجيد التهوية، يوفر راحة وأناقة فائقة.",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Normal
                    ),
                    color = MaterialTheme.colorScheme.onTertiary
                )
            }
            item {
                HorizontalDivider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .background(MaterialTheme.colorScheme.outline)
                )
            }
            item {
                Text(
                    modifier = Modifier.padding(
                        start = 16.dp,
                        end = 16.dp,
                        top = 24.dp,
                        bottom = 16.dp
                    ),
                    text = stringResource(Res.string.Choose_variant),
                    fontSize = 18.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Medium
                    ),
                    color = MaterialTheme.colorScheme.onTertiary
                )
            }
            item {
                FlowRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp, bottom = 24.dp),
                    maxItemsInEachRow = 3,
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                    overflow = FlowRowOverflow.Visible
                ) {
                    FilterChip(
                        selected = false,
                        onClick = {},
                        label = {
                            Text(
                                modifier = Modifier.padding(
                                    vertical = 8.dp,
                                    horizontal = 12.dp
                                ),
                                text = "Small",
                                fontSize = 16.sp,
                                fontFamily = FontFamily(
                                    weight = FontWeight.Normal
                                ),
                            )
                        },
                        shape = RoundedCornerShape(62.dp),
                        colors = FilterChipDefaults.elevatedFilterChipColors(
                            containerColor = MaterialTheme.colorScheme.surfaceContainerLowest,
                            labelColor = MaterialTheme.colorScheme.onTertiary,
                            selectedContainerColor = MaterialTheme.colorScheme.primary,
                            selectedLabelColor = MaterialTheme.colorScheme.onPrimary
                        )
                    )
                    FilterChip(
                        selected = true,
                        onClick = {},
                        label = {
                            Text(
                                modifier = Modifier.padding(
                                    vertical = 8.dp,
                                    horizontal = 12.dp
                                ),
                                text = "Medium",
                                fontSize = 16.sp,
                                fontFamily = FontFamily(
                                    weight = FontWeight.Normal
                                ),
                            )
                        },
                        shape = RoundedCornerShape(62.dp),
                        colors = FilterChipDefaults.elevatedFilterChipColors(
                            containerColor = MaterialTheme.colorScheme.surfaceContainerLowest,
                            labelColor = MaterialTheme.colorScheme.onTertiary,
                            selectedContainerColor = MaterialTheme.colorScheme.primary,
                            selectedLabelColor = MaterialTheme.colorScheme.onPrimary
                        )
                    )
                    FilterChip(
                        selected = false,
                        onClick = {},
                        label = {
                            Text(
                                modifier = Modifier.padding(
                                    vertical = 8.dp,
                                    horizontal = 12.dp
                                ),
                                text = "Large",
                                fontSize = 16.sp,
                                fontFamily = FontFamily(
                                    weight = FontWeight.Normal
                                ),
                            )
                        },
                        shape = RoundedCornerShape(62.dp),
                        colors = FilterChipDefaults.elevatedFilterChipColors(
                            containerColor = MaterialTheme.colorScheme.surfaceContainerLowest,
                            labelColor = MaterialTheme.colorScheme.onTertiary,
                            selectedContainerColor = MaterialTheme.colorScheme.primary,
                            selectedLabelColor = MaterialTheme.colorScheme.onPrimary
                        )
                    )
                    FilterChip(
                        selected = false,
                        onClick = {},
                        label = {
                            Text(
                                modifier = Modifier.padding(
                                    vertical = 8.dp,
                                    horizontal = 12.dp
                                ),
                                text = "XLarge",
                                fontSize = 16.sp,
                                fontFamily = FontFamily(
                                    weight = FontWeight.Normal
                                ),
                            )
                        },
                        shape = RoundedCornerShape(62.dp),
                        colors = FilterChipDefaults.elevatedFilterChipColors(
                            containerColor = MaterialTheme.colorScheme.surfaceContainerLowest,
                            labelColor = MaterialTheme.colorScheme.onTertiary,
                            selectedContainerColor = MaterialTheme.colorScheme.primary,
                            selectedLabelColor = MaterialTheme.colorScheme.onPrimary
                        )
                    )
                    FilterChip(
                        selected = false,
                        onClick = {},
                        label = {
                            Text(
                                modifier = Modifier.padding(
                                    vertical = 8.dp,
                                    horizontal = 12.dp
                                ),
                                text = "XXLarge",
                                fontSize = 16.sp,
                                fontFamily = FontFamily(
                                    weight = FontWeight.Normal
                                ),
                            )
                        },
                        shape = RoundedCornerShape(62.dp),
                        colors = FilterChipDefaults.elevatedFilterChipColors(
                            containerColor = MaterialTheme.colorScheme.surfaceContainerLowest,
                            labelColor = MaterialTheme.colorScheme.onTertiary,
                            selectedContainerColor = MaterialTheme.colorScheme.primary,
                            selectedLabelColor = MaterialTheme.colorScheme.onPrimary
                        )
                    )
                }
            }
            item {
                HorizontalDivider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .background(MaterialTheme.colorScheme.outline)
                )
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp, top = 24.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    PrimaryButton(
                        modifier = Modifier
                            .height(44.dp)
                            .weight(1f),
                        onClick = {}
                    ) {
                        Text(
                            text = stringResource(Res.string.Add_to_cart),
                            fontSize = 18.sp,
                            fontFamily = FontFamily(
                                weight = FontWeight.Medium
                            )
                        )
                    }
                    Row(
                        modifier = Modifier
                            .height(44.dp)
                            .clip(RoundedCornerShape(62.dp))
                            .background(MaterialTheme.colorScheme.surfaceContainerLowest),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(
                            modifier = Modifier,
                            onClick = {},
                        ) {
                            Icon(
                                modifier = Modifier.size(16.dp),
                                painter = painterResource(Res.drawable.plus_icon),
                                contentDescription = "Increase count of product",
                                tint = MaterialTheme.colorScheme.primary
                            )
                        }
                        Text(
                            text = "10",
                            fontSize = 16.sp,
                            fontFamily = FontFamily(
                                weight = FontWeight.Medium
                            ),
                            color = MaterialTheme.colorScheme.primary,
                            maxLines = 1
                        )
                        IconButton(
                            modifier = Modifier,
                            onClick = {},
                        ) {
                            Icon(
                                modifier = Modifier.size(16.dp),
                                painter = painterResource(Res.drawable.minus_icon),
                                contentDescription = "Increase count of product",
                                tint = MaterialTheme.colorScheme.primary
                            )
                        }
                    }
                }
            }
            item {
                ProductsDiscoverSection(
                    title = Res.string.May_like,
                    navigator = navigator
                )
            }
            item {
                FooterSection()
            }
        }
    }
}