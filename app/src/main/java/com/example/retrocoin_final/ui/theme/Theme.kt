package com.example.retrocoin_final.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Defina as cores do seu tema. Pode ajustar conforme necessário.
private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF6200EE),
    secondary = Color(0xFF03DAC6),
    background = Color.White
)

private val Typography = Typography(
    // Você pode personalizar suas fontes aqui, se necessário
    // Exemplo:
    // h1 = TextStyle(fontFamily = customFontFamily, fontWeight = FontWeight.Bold, fontSize = 30.sp)
)

@Composable
fun RetroCoinFinalTheme(content: @Composable () -> Unit) {
    // Aqui você pode adicionar a lógica para temas claros e escuros se desejar
    val colors = LightColorScheme
    MaterialTheme(
        colorScheme = colors,
        typography = Typography, // Passando a instância de Typography
        content = content
    )
}