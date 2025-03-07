package com.example.retrocoin_final.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.retrocoin_final.screens.HomeScreen
import com.example.retrocoin_final.screens.SegundaTela
import com.example.retrocoin_final.screens.TerceiraTela

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("segunda") { SegundaTela(navController) }
        composable("terceira/{numero}") { backStackEntry ->
            val numero = backStackEntry.arguments?.getString("numero") ?: ""
            TerceiraTela(navController, numero)
        }
    }
}