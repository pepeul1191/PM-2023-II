package pe.edu.ulima.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.edu.ulima.app.ui.theme.AppTheme
import pe.edu.ulima.app.ui.theme.Orange400
import pe.edu.ulima.app.ui.theme.White400

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun LogoImage() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.CenterStart,
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Image(
                painter = painterResource(id = R.drawable.ic_ulima), // Replace with your SVG resource ID
                contentDescription = "Universidad de Lima",
                modifier = Modifier.size(100.dp),
                colorFilter = ColorFilter.tint(if (!isSystemInDarkTheme()) Orange400 else White400),
            )
            Text(
                modifier = Modifier.padding(top = 5.dp),
                text = stringResource(id = R.string.app_title),
                style = MaterialTheme.typography.h1,
                textAlign = TextAlign.Center,
            )
        }
    }
}

@Composable
fun Greeting(name: String) {
    LogoImage()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AppTheme {
        Greeting("Android")
    }
}