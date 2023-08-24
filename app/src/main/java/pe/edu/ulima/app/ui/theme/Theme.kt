package pe.edu.ulima.app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import pe.edu.ulima.app.R

private val DarkColorPalette = darkColors(
    primary = Orange400,
    primaryVariant = Orange800,
    secondary = Gray400
)

private val LightColorPalette = lightColors(
    primary = Orange400,
    primaryVariant = Orange800,
    secondary = Gray800

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun AppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val CustomTitleColor = if (!isSystemInDarkTheme()) Orange400 else White400
    println("1 ++++++++++++++++++++++++++++++++++")
    println(isSystemInDarkTheme())
    println("2 ++++++++++++++++++++++++++++++++++")
    val customTypography = Typography(
        h1 = TextStyle(
            fontFamily = FontFamily(Font(R.font.caslon_classico_sc_regular)), // Your custom font
            fontSize = 30.sp,
            color = CustomTitleColor
        ),
        // Define other typography styles as needed
    )

    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = customTypography,
        shapes = Shapes,
        content = content
    )
}