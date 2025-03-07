package com.example.retrocoin_final.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun TerceiraTela(navController: NavController, numero: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "\uD83D\uDCB0 ➡\uFE0F \uD83D\uDCB5", style = MaterialTheme.typography.headlineMedium)
        Text(text = "Tela de resultado", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(16.dp))

        // Exibindo o número recebido da SegundaTela
        Text(text = "Número digitado: $numero", style = MaterialTheme.typography.bodyLarge)

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.popBackStack("segunda", inclusive = false) }) {
            Text(text = "Voltar para tela de conversão")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = { navController.popBackStack("home", inclusive = false) }) {
            Text(text = "Voltar para tela splash")
        }
    }
}