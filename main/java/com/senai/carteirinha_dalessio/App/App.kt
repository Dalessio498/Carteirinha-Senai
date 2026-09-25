package com.senai.carteirinha_dalessio.App

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.senai.carteirinha_dalessio.App.Navigation.AppNavHost
import com.senai.carteirinha_dalessio.Core.designSystem.Theme.CarteirinhaDalessioTheme

@Composable
fun App() {

    CarteirinhaDalessioTheme {

        val navController = rememberNavController()

        AppNavHost(
            navController = navController
        )
    }
}