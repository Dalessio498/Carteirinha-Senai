package com.senai.carteirinha_dalessio.App

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.senai.carteirinha_dalessio.Core.designSystem.Theme.Carteirinha_WillTheme
import com.senai.carteirinha_dalessio.App.Navigation.AppNavHost

@Composable
fun App ()
{
    Carteirinha_WillTheme() {
        val navController = rememberNavController()
        AppNavHost(
            navController = navController
        )
    }
}