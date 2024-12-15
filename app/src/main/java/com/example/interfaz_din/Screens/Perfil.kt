package com.example.interfaz_din.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.interfaz_din.Navigation.BottomNavigationBar
import com.example.interfaz_din.Navigation.AppScreen

@Composable
fun PerfilScreen(navController: NavController) {
    var menuHambuesaExpanded by remember { mutableStateOf(false) }
    var menuUsuarioExpanded by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF22162A),
                        Color(0xFF302b42)
                    ),
                    startY = 500f,
                    endY = Float.POSITIVE_INFINITY
                )
            )
    ) {

        Box(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                IconButton(onClick = { menuHambuesaExpanded = true }) {
                    Icon(
                        Icons.Default.Menu,
                        contentDescription = "Menú hamburguesa",
                        tint = Color.White
                    )
                }

                DropdownMenu(
                    expanded = menuHambuesaExpanded,
                    onDismissRequest = { menuHambuesaExpanded = false }
                ) {
                    DropdownMenuItem(
                        text = { Text("Fútbol") },
                        onClick = {
                            menuHambuesaExpanded = false
                            navController.navigate(AppScreen.FutbolScreen.route)
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("UFC") },
                        onClick = {
                            menuHambuesaExpanded = false
                            navController.navigate(AppScreen.UFCScreen.route)
                        }
                    )
                    DropdownMenuItem(
                        text = { Text("NBA") },
                        onClick = {
                            menuHambuesaExpanded = false
                            navController.navigate(AppScreen.NBAScreen.route)
                        }
                    )
                }

                Box(
                    modifier = Modifier
                        .wrapContentSize(Alignment.TopEnd)
                ) {

                    IconButton(onClick = { menuUsuarioExpanded = true }) {
                        Icon(
                            Icons.Default.Person,
                            contentDescription = "Menú usuario",
                            tint = Color.White // Cambiar color a blanco
                        )
                    }

                    DropdownMenu(
                        expanded = menuUsuarioExpanded,
                        onDismissRequest = { menuUsuarioExpanded = false }
                    ) {
                        DropdownMenuItem(
                            text = { Text("Cerrar sesión") },
                            onClick = {
                                menuUsuarioExpanded = false
                                navController.popBackStack(AppScreen.Portada.route, false)
                            }
                        )
                    }
                }
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .align(Alignment.TopCenter)
        ) {
            Spacer(modifier = Modifier.height(100.dp))

            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(Color.Gray)
                    .align(Alignment.CenterHorizontally)
            ) {

                Image(
                    painter = painterResource(id = com.example.interfaz_din.R.drawable.user_image),
                    contentDescription = "Imagen de usuario",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(50.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    "Bienvenido, Raúl",
                    fontSize = 24.sp,
                    color = Color.White,
                    modifier = Modifier.align(Alignment.Center)
                )
            }


            Spacer(modifier = Modifier.height(8.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .border(2.dp, Color.Gray, shape = RoundedCornerShape(8.dp))
                    .padding(16.dp)
            ) {

                Column {
                    Text("Nombre de Usuario : Raúl", color = Color.White)
                    Text("Código de Usuario : XXCNJVS", color = Color.White)
                    Text("Equipo favorito : Los Ángeles Lakers", color = Color.White)
                    Text("Ciudad : Cádiz", color = Color.White)
                    Text("Usuario desde : XX/XX/XXXX", color = Color.White)
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Box(
                modifier = Modifier
                    .size(250.dp)
                    .clip(CircleShape)
                    .background(Color.Gray)
                    .align(Alignment.CenterHorizontally)
            ) {

                Image(
                    painter = painterResource(id = com.example.interfaz_din.R.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .align(Alignment.BottomCenter)
        ) {
            BottomNavigationBar(navController = navController)
        }
    }
}