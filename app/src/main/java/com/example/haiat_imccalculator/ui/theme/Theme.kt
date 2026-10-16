package com.example.haiat_imccalculator.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val LightColorScheme = lightColorScheme(
    primary = ForestGreenPrimary,
    onPrimary = ForestGreenOnPrimary,
    primaryContainer = SageGreenContainer,
    onPrimaryContainer = SageGreenOnContainer,
    secondary = MossSecondary,
    onSecondary = MossOnSecondary,
    secondaryContainer = MossContainer,
    onSecondaryContainer = MossOnContainer,
    tertiary = EucalyptusTertiary,
    onTertiary = EucalyptusOnTertiary,
    background = NaturalBackground,
    onBackground = NaturalOnBackground,
    surface = NaturalSurface,
    onSurface = NaturalOnSurface,
    surfaceVariant = NaturalSurfaceVariant,
    onSurfaceVariant = NaturalOnSurfaceVariant,
    outline = NaturalOutline,
    outlineVariant = NaturalOutlineVariant
)

private val DarkColorScheme = darkColorScheme(
    primary = ForestGreenPrimaryDark,
    onPrimary = ForestGreenOnPrimaryDark,
    primaryContainer = SageGreenContainerDark,
    onPrimaryContainer = SageGreenOnContainerDark,
    secondary = MossSecondaryDark,
    onSecondary = MossOnSecondaryDark,
    secondaryContainer = MossContainerDark,
    onSecondaryContainer = MossOnContainerDark,
    background = NaturalBackgroundDark,
    onBackground = NaturalOnBackgroundDark,
    surface = NaturalSurfaceDark,
    onSurface = NaturalOnSurfaceDark,
    surfaceVariant = NaturalSurfaceVariantDark,
    onSurfaceVariant = NaturalOnSurfaceVariantDark,
    outline = NaturalOutlineDark,
    outlineVariant = NaturalOutlineVariantDark
)

@Composable
fun HAIAT_IMCCALCULATORTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false, // Set to false to prioritize our natural green theme
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}