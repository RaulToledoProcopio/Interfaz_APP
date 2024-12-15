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
fun UFCScreen(navController: NavController) {
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
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = com.example.interfaz_din.R.drawable.logo_ufc),
                contentDescription = "Logo",
                modifier = Modifier.size(100.dp),
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text("Resultados de la jornada", fontSize = 24.sp, color = Color.White)

            Spacer(modifier = Modifier.height(8.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .border(2.dp, Color.Gray, shape = RoundedCornerShape(8.dp))
                    .padding(16.dp)
            ) {

                Column {
                    Text("Julianna Peña derrotó a Raquel Pennington por Decisión", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Mario Bautista derrotó a Jose Aldo por Decisión", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Kayla Harrison derrotó a Ketlen Vieira por Decisión", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Roman Dolidze derrotó a Kevin Holland por TKO por Lesión", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Renato Moicano derrotó a Benoit Saint Denis por TKO (Parada del médico)", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Nassourdine Imavov derrotó a Brendan Allen por Decisión", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("William Gomis derrotó a Joanderson Brito por Decisión", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Bryan Battle derrotó a Kevin Jousset por TKO", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Morgan Charriere derrotó a Gabriel Miranda por TKO", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Gilbert Burns derrotó a Jorge Masvidal por Decisión", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
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
                        painter = painterResource(id = com.example.interfaz_din.R.drawable.imagen_ufc1),
                        contentDescription = "Imagen 1",
                        modifier = Modifier
                            .size(250.dp)
                            .padding(8.dp)
                    )
                    Image(
                        painter = painterResource(id = com.example.interfaz_din.R.drawable.imagen_ufc2),
                        contentDescription = "Imagen 2",
                        modifier = Modifier
                            .size(250.dp)
                            .padding(8.dp)
                    )
                    Image(
                        painter = painterResource(id = com.example.interfaz_din.R.drawable.imagen_ufc3),
                        contentDescription = "Imagen 3",
                        modifier = Modifier
                            .size(250.dp)
                            .padding(8.dp)
                    )
                    Image(
                        painter = painterResource(id = com.example.interfaz_din.R.drawable.imagen_ufc4),
                        contentDescription = "Imagen 4",
                        modifier = Modifier
                            .size(250.dp)
                            .padding(8.dp)
                    )
                    Image(
                        painter = painterResource(id = com.example.interfaz_din.R.drawable.imagen_ufc5),
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
