package com.example.retrocoin_final

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.retrocoin_final.screens.AppNavigation
import com.example.retrocoin_final.ui.theme.RetroCoinFinalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RetroCoinFinalTheme { // Aqui estava o erro: chave extra '{{'
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    AppNavigation() // Chamando a navegação do app
                }
            }
        }
    }
}