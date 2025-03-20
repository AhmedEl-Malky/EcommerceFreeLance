package com.bussiness.ecommerce.Core.presentation.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme

private val DarkColorScheme = darkColorScheme(
    background = BackgroundDark,
    onBackground = ForegroundDark,
    surface = CardDark,
    onSurface = CardForegroundDark,
    inverseSurface = PopOverDark,
    inverseOnSurface = PopOverForegroundDark,
    surfaceVariant = InputDark,
    primary = PrimaryDark,
    onPrimary = PrimaryForeGroundDark,
    onPrimaryContainer = BackgroundDark,
    secondary = SecondaryDark,
    onSecondary = SecondaryForeGroundDark,
    tertiary = MutedDark,
    onTertiary = MutedForeGroundDark,
    surfaceContainerHigh = Chart_1Dark,
    surfaceContainerLow = Chart_2Dark,
    surfaceContainerHighest = AccentDark,
    surfaceContainerLowest = AccentForeGroundDark,
    error = DestructiveDark,
    onError = DestructiveForeGroundDark,
    outline = BorderDark,
    scrim = RingDark,
)

private val LightColorScheme = lightColorScheme(
    background = BackgroundLight,
    onBackground = ForegroundLight,
    surface = CardLight,
    onSurface = CardForegroundLight,
    inverseSurface = PopOverLight,
    inverseOnSurface = PopOverForegroundLight,
    surfaceVariant = InputLight,
    primary = PrimaryLight,
    onPrimary = PrimaryForeGroundLight,
    onPrimaryContainer = BackgroundLight,
    secondary = SecondaryLight,
    onSecondary = SecondaryForeGroundLight,
    tertiary = MutedLight,
    onTertiary = MutedForeGroundLight,
    surfaceContainerHigh = Golden,
    surfaceContainerHighest = AccentLight,
    surfaceContainerLowest = AccentForeGroundLight,
    error = DestructiveLight,
    onError = DestructiveForeGroundLight,
    outline = BorderLight,
)
//
//@Composable
//fun MotagerTheme(
//    darkTheme: Boolean = isSystemInDarkTheme(),
//    content: @Composable () -> Unit
//) {
//    val colorScheme = when {
//        darkTheme -> DarkColorScheme
//        else -> LightColorScheme
//    }
//
//    MaterialTheme(
//        colorScheme = colorScheme,
//        content = content
//    )
//}