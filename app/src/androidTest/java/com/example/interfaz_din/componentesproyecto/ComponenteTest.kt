package com.example.interfaz_din.componentesproyecto

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsEnabled
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performScrollTo
import androidx.navigation.NavController
import androidx.test.core.app.ApplicationProvider
import com.example.interfaz_din.Screens.FutbolScreen
import com.example.interfaz_din.Screens.LoginScreen
import com.example.interfaz_din.Screens.NBAScreen
import com.example.interfaz_din.Screens.PerfilScreen
import com.example.interfaz_din.Screens.UFCScreen
import org.junit.Rule
import org.junit.Test

class ComponenteTest {
    @get : Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testButtonLogin() {
        val navController = NavController(ApplicationProvider.getApplicationContext())
        composeTestRule.setContent {
            LoginScreen(navController)
        }
        composeTestRule.onNodeWithTag("BotonLogin")
            .assertIsEnabled() // Verificar que el botón de login está activado
    }

    @Test
    fun testEmailFieldStartsEmpty() {
        composeTestRule.setContent {
            LoginScreen()
        }
        composeTestRule.onNodeWithTag("CampoEmail")
            .assertTextEquals("") // Verificar que el campo de email aparece vacío
    }

    @Test
    fun testLogoIsDisplayed() {

        composeTestRule.setContent {
            LoginScreen()
        }

        composeTestRule.onNodeWithContentDescription("Logo")
            .assertExists() // Verifica que el logo del login está
    }

    @Test
    fun testDropdownMenuOpens() {

        composeTestRule.setContent {
            FutbolScreen()
        }

        composeTestRule.onNodeWithContentDescription("Menú usuario")
            .performClick() // Abre el menú desplegable del usuario
        composeTestRule.onNodeWithText("Cerrar sesión")
            .assertExists() // Verifica que el menú desplegable se abre y se ve la opción de cerrar sesión.
    }

    @Test
    fun testTituloVisible() {

        composeTestRule.setContent {
            NBAScreen()
        }
        composeTestRule.onNodeWithText("Resultados de la jornada")
            .assertIsDisplayed() // Verifica que el título "Resultados de la jornada" es visible
    }

    @Test
    fun testHorizontalScroll() {

        composeTestRule.setContent {
            NBAScreen()
        }

        composeTestRule.onNodeWithContentDescription("Imagen 1") // Asegurarse de que la primera imagen sea visible
            .assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Imagen 2") // Hace scroll a la derecha
            .performScrollTo()
        composeTestRule.onNodeWithContentDescription("Imagen 2") // Asegurarse de que la segunda imagen ahora es visible
            .assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Imagen 3") // Hace scroll a la derecha otra vez
            .performScrollTo()
        composeTestRule.onNodeWithContentDescription("Imagen 3")
            .assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Imagen 4")
            .performScrollTo()
        composeTestRule.onNodeWithContentDescription("Imagen 4")
            .assertIsDisplayed()
        composeTestRule.onNodeWithContentDescription("Imagen 5")
            .performScrollTo()
        composeTestRule.onNodeWithContentDescription("Imagen 5")
            .assertIsDisplayed()
    }

    @Test
    fun testResultadosCajaVisibility() {

        composeTestRule.setContent {
            UFCScreen()
        }
        composeTestRule.onNodeWithTag("Resultados") // Verifica si la caja de resultados es visible
            .assertIsDisplayed()
    }

    @Test
    fun testResultadosDentroDeLaCajaVisibility() {

        composeTestRule.setContent {
            UFCScreen()
        }
        composeTestRule.onNodeWithText("Julianna Peña derrotó a Raquel Pennington por Decisión") // Verifica si al menos uno de los resultados dentro de la caja es visible
            .assertIsDisplayed()
    }

    @Test
    fun testImagenDeUsuarioVisibility() {

        composeTestRule.setContent {
            PerfilScreen()
        }
        composeTestRule.onNodeWithTag("ImagenUsuario") // Verificamos que la imagen de usuario es visible
            .assertIsDisplayed()
    }

    @Test
    fun testMenuHambuesaVisibility() {
        composeTestRule.setContent {
            PerfilScreen()
        }

        composeTestRule.onNodeWithContentDescription("Menú hamburguesa") // Hacemos clic en el ícono del menú hamburguesa
            .performClick()

        // Verifica que el menú hamburguesa está desplegado mostrando las opciones de navegación
        composeTestRule.onNodeWithText("Fútbol")
            .assertIsDisplayed()
        composeTestRule.onNodeWithText("UFC")
            .assertIsDisplayed()
        composeTestRule.onNodeWithText("NBA")
            .assertIsDisplayed()
    }
}