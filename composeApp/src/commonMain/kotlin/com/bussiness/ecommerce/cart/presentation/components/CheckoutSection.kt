package com.bussiness.ecommerce.cart.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bussiness.ecommerce.Core.presentation.components.PrimaryButton
import com.bussiness.ecommerce.Core.presentation.components.PrimaryTextField
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily
import e_commercefreelance.composeapp.generated.resources.Add_promo_code
import e_commercefreelance.composeapp.generated.resources.Apply
import e_commercefreelance.composeapp.generated.resources.Delivery_fee
import e_commercefreelance.composeapp.generated.resources.Discount
import e_commercefreelance.composeapp.generated.resources.Go_to_checkout
import e_commercefreelance.composeapp.generated.resources.Order_summary
import e_commercefreelance.composeapp.generated.resources.Res
import e_commercefreelance.composeapp.generated.resources.Subtotal
import e_commercefreelance.composeapp.generated.resources.Total
import e_commercefreelance.composeapp.generated.resources.promo_code_icon
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource

@Composable
fun CheckoutSection(){
    Column(
        modifier = Modifier
            .padding(top = 4.dp, bottom = 12.dp)
            .clip(RoundedCornerShape(20.dp))
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.outline,
                shape = RoundedCornerShape(20.dp)
            )
            .padding(20.dp),
    ) {
        Text(
            modifier = Modifier.padding(bottom = 16.dp),
            text = stringResource(Res.string.Order_summary),
            fontSize = 20.sp,
            fontFamily = FontFamily(
                weight = FontWeight.Bold
            ),
            color = MaterialTheme.colorScheme.onBackground
        )
        Column(
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = stringResource(Res.string.Subtotal),
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Normal
                    ),
                    color = MaterialTheme.colorScheme.tertiary
                )
                Text(
                    text = "240 ج",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Bold
                    ),
                    color = MaterialTheme.colorScheme.onBackground
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "${stringResource(Res.string.Discount)} (-20%)",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Normal
                    ),
                    color = MaterialTheme.colorScheme.tertiary
                )
                Text(
                    text = "100- ج",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Bold
                    ),
                    color = MaterialTheme.colorScheme.onError
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = stringResource(Res.string.Delivery_fee),
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Normal
                    ),
                    color = MaterialTheme.colorScheme.tertiary
                )
                Text(
                    text = "15 ج",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Bold
                    ),
                    color = MaterialTheme.colorScheme.onBackground
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.outline)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = stringResource(Res.string.Total),
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Normal
                    ),
                    color = MaterialTheme.colorScheme.onBackground
                )
                Text(
                    text = "155 ج",
                    fontSize = 20.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Bold
                    ),
                    color = MaterialTheme.colorScheme.onBackground
                )
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            PrimaryTextField(
                modifier = Modifier.weight(2f).height(48.dp),
                value = "",
                onValueChange = {},
                placeholder = {
                    Text(
                        text = stringResource(Res.string.Add_promo_code),
                        fontSize = 14.sp,
                        fontFamily = FontFamily(
                            weight = FontWeight.Normal
                        ),
                        color = MaterialTheme.colorScheme.tertiary
                    )
                },
                leadingIcon = {
                    Icon(
                        painter = painterResource(Res.drawable.promo_code_icon),
                        contentDescription = "Add Promo Code"
                    )
                }
            )
            Spacer(modifier = Modifier.width(12.dp))
            PrimaryButton(
                modifier = Modifier.weight(1f).height(48.dp),
                onClick = {}
            ) {
                Text(
                    text = stringResource(Res.string.Apply),
                    fontSize = 14.sp,
                    fontFamily = FontFamily(
                        weight = FontWeight.Medium
                    ),
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }

        }
        PrimaryButton(
            modifier = Modifier.fillMaxWidth().height(54.dp),
            onClick = {}
        ) {
            Text(
                text = stringResource(Res.string.Go_to_checkout),
                fontSize = 14.sp,
                fontFamily = FontFamily(
                    weight = FontWeight.Medium
                ),
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}