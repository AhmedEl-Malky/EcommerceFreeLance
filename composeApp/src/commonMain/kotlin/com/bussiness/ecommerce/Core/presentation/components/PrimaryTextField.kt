package com.bussiness.ecommerce.Core.presentation.components

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.OutlinedTextFieldDefaults.Container
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bussiness.ecommerce.Core.presentation.theme.FontFamily
import com.bussiness.ecommerce.Core.presentation.theme.FontType

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PrimaryTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    prefix: @Composable (() -> Unit)? = null,
    suffix: @Composable (() -> Unit)? = null,
    supportingText: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
) {
    val interactionSource = remember { MutableInteractionSource() }
    BasicTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        interactionSource = interactionSource,
        enabled = enabled,
        readOnly = readOnly,
        textStyle = TextStyle(
            textAlign = TextAlign.Start,
            fontSize = 14.sp,
            color = MaterialTheme.colorScheme.onSurface,
            fontFamily = FontFamily(
                fontType = FontType.SATOSHI,
                weight = FontWeight.Normal
            )
        ),
        maxLines = maxLines,
        minLines = minLines,
        keyboardActions = keyboardActions,
        keyboardOptions = keyboardOptions,
        cursorBrush = SolidColor(MaterialTheme.colorScheme.primary),
        visualTransformation = visualTransformation,
        singleLine = singleLine,
    ) { innerTextField ->
        OutlinedTextFieldDefaults.DecorationBox(
            value = value,
            visualTransformation = VisualTransformation.None,
            innerTextField = innerTextField,
            enabled = enabled,
            singleLine = singleLine,
            leadingIcon = leadingIcon,
            trailingIcon = trailingIcon,
            prefix = prefix,
            suffix = suffix,
            placeholder = placeholder,
            label = label,
            supportingText = supportingText,
            interactionSource = interactionSource,
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
            container = {
                Container(
                    enabled = enabled,
                    isError = isError,
                    interactionSource = interactionSource,
                    shape = RoundedCornerShape(62.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = MaterialTheme.colorScheme.secondary,
                        unfocusedContainerColor = MaterialTheme.colorScheme.secondary,
                        focusedBorderColor = MaterialTheme.colorScheme.secondary,
                        unfocusedBorderColor = MaterialTheme.colorScheme.secondary,
                        focusedTextColor = MaterialTheme.colorScheme.surfaceVariant,
                        unfocusedTextColor = MaterialTheme.colorScheme.surfaceVariant,
                        errorContainerColor = MaterialTheme.colorScheme.background,
                        errorBorderColor = MaterialTheme.colorScheme.error,
                        errorSupportingTextColor = MaterialTheme.colorScheme.error,
                        unfocusedSupportingTextColor = MaterialTheme.colorScheme.error,
                        focusedSupportingTextColor = MaterialTheme.colorScheme.error
                    )
                )
            }
        )
    }
}