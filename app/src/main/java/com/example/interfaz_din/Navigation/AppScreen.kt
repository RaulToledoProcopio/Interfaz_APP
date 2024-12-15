package com.example.interfaz_din.Navigation

    sealed class AppScreen(val route: String) {
        object Portada : AppScreen("portada")
        object Login : AppScreen("login")
        object Perfil : AppScreen("perfil")
        object OpcionEquipo : AppScreen("opcion_equipo")
        object FutbolScreen : AppScreen("futbol_screen")
        object UFCScreen : AppScreen("ufc_screen")
        object NBAScreen : AppScreen("nba_screen")
    }
