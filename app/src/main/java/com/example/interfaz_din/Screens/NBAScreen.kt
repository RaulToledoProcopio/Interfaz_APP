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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.interfaz_din.Navigation.AppScreen
import com.example.interfaz_din.Navigation.BottomNavigationBar

@Composable
fun NBAScreen(navController: NavController) {
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
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = com.example.interfaz_din.R.drawable.logo_nba),
                contentDescription = "Logo",
                modifier = Modifier.size(150.dp),
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text("Resultados de la jornada", fontSize = 24.sp, color = Color.White)

            Spacer(modifier = Modifier.height(8.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(6.dp)
                    .border(2.dp, Color.Gray, shape = RoundedCornerShape(8.dp))
                    .padding(6.dp)
            ) {

                Column {
                    Text("Golden State Warriors 99-93 Houston Rockets", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Philadelphia 76ers 102-94 Orlando Magic", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Atlanta Hawks 134-132 Los Angeles Lakers (OT)", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Boston Celtics 111-105 Milwaukee Bucks", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Indiana Pacers 132-123 Chicago Bulls", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Sacramento Kings 140-113 San Antonio Spurs", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Minnesota Timberwolves 107-90 Golden State Warriors", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Utah Jazz 141-99 Portland Trail Blazers", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Cleveland Cavaliers 116-102 Charlotte Hornets", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Washington Wizards 122-113 Denver Nuggets", color = Color.White)
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
                        painter = painterResource(id = com.example.interfaz_din.R.drawable.imagen_nba1),
                        contentDescription = "Imagen 1",
                        modifier = Modifier
                            .size(250.dp)
                            .padding(8.dp)
                    )
                    Image(
                        painter = painterResource(id = com.example.interfaz_din.R.drawable.imagen_nba2),
                        contentDescription = "Imagen 2",
                        modifier = Modifier
                            .size(250.dp)
                            .padding(8.dp)
                    )
                    Image(
                        painter = painterResource(id = com.example.interfaz_din.R.drawable.imagen_nba3),
                        contentDescription = "Imagen 3",
                        modifier = Modifier
                            .size(250.dp)
                            .padding(8.dp)
                    )
                    Image(
                        painter = painterResource(id = com.example.interfaz_din.R.drawable.imagen_nba4),
                        contentDescription = "Imagen 4",
                        modifier = Modifier
                            .size(250.dp)
                            .padding(8.dp)
                    )
                    Image(
                        painter = painterResource(id = com.example.interfaz_din.R.drawable.imagen_nba5),
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