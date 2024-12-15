package com.example.interfaz_din.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.interfaz_din.Screens.FutbolScreen
import com.example.interfaz_din.Screens.LoginScreen
import com.example.interfaz_din.Screens.NBAScreen
import com.example.interfaz_din.Screens.OpcionEquipoScreen
import com.example.interfaz_din.Screens.PerfilScreen
import com.example.interfaz_din.Screens.PortadaScreen
import com.example.interfaz_din.Screens.UFCScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = AppScreen.Portada.route) {
        composable(AppScreen.Portada.route) { PortadaScreen(navController) }
        composable(AppScreen.Login.route) { LoginScreen(navController) }
        composable(AppScreen.Perfil.route) { PerfilScreen(navController) }
        composable(AppScreen.OpcionEquipo.route) { OpcionEquipoScreen(navController) }
        composable(AppScreen.FutbolScreen.route) { FutbolScreen(navController) }
        composable(AppScreen.NBAScreen.route) { NBAScreen(navController) }
        composable(AppScreen.UFCScreen.route) { UFCScreen(navController) }
    }
}
