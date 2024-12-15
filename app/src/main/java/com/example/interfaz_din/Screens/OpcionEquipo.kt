package com.example.interfaz_din.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.interfaz_din.Navigation.AppScreen
import com.example.interfaz_din.Navigation.BottomNavigationBar

@Composable
fun OpcionEquipoScreen(navController: NavController) {
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

                IconButton(onClick = { navController.popBackStack(AppScreen.Perfil.route, false) }) {
                    Icon(
                        Icons.Default.ArrowBack,
                        contentDescription = "Volver al perfil",
                        tint = Color.White
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
                            tint = Color.White
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
            Spacer(modifier = Modifier.height(50.dp))

            Box(
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(Color.Gray)
                    .align(Alignment.CenterHorizontally)
            ) {

                Image(
                    painter = painterResource(id = com.example.interfaz_din.R.drawable.logo_equipo),
                    contentDescription = "Imagen del equipo",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text("Últimos Resultados", fontSize = 24.sp, color = Color.White, modifier = Modifier.align(Alignment.CenterHorizontally))

            Spacer(modifier = Modifier.height(8.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .border(2.dp, Color.Gray, shape = RoundedCornerShape(8.dp))
                    .padding(16.dp)
            ) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text("Los Ángeles Lakers 112-98 Boston Celtics", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Los Ángeles Lakers 105-110 Golden State Warriors", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Los Ángeles Lakers 98-105 Phoenix Suns", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Los Ángeles Lakers 120-115 Miami Heat", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Los Ángeles Lakers 110-105 Denver Nuggets", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Los Ángeles Lakers 115-98 Chicago Bulls", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Los Ángeles Lakers 107-100 Dallas Mavericks", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Los Ángeles Lakers 125-110 Toronto Raptors", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Los Ángeles Lakers 102-108 Utah Jazz", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Los Ángeles Lakers 118-112 Portland Trail Blazers", color = Color.White)
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                Row(
                    modifier = Modifier
                        .horizontalScroll(rememberScrollState())
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {

                    Image(
                        painter = painterResource(id = com.example.interfaz_din.R.drawable.imagen_lakers1),
                        contentDescription = "Imagen 1",
                        modifier = Modifier
                            .size(250.dp)
                            .padding(8.dp)
                    )
                    Image(
                        painter = painterResource(id = com.example.interfaz_din.R.drawable.imagen_lakers2),
                        contentDescription = "Imagen 2",
                        modifier = Modifier
                            .size(250.dp)
                            .padding(8.dp)
                    )
                    Image(
                        painter = painterResource(id = com.example.interfaz_din.R.drawable.imagen_lakers3),
                        contentDescription = "Imagen 3",
                        modifier = Modifier
                            .size(250.dp)
                            .padding(8.dp)
                    )
                    Image(
                        painter = painterResource(id = com.example.interfaz_din.R.drawable.imagen_lakers4),
                        contentDescription = "Imagen 4",
                        modifier = Modifier
                            .size(250.dp)
                            .padding(8.dp)
                    )
                    Image(
                        painter = painterResource(id = com.example.interfaz_din.R.drawable.imagen_lakers5),
                        contentDescription = "Imagen 5",
                        modifier = Modifier
                            .size(250.dp)
                            .padding(8.dp)
                    )
                }
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