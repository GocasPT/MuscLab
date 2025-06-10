package dev.gocas.musclab.ui.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.gocas.musclab.ui.navigation.Routes.HOME_PAGE
import dev.gocas.musclab.ui.navigation.Routes.PROFILE_PAGE
import dev.gocas.musclab.ui.theme.MuscLabTheme

@Composable
fun AppNavHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = HOME_PAGE
    ) {
        composable(HOME_PAGE) {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                Column {
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )

                    Button(onClick = {
                        navController.navigate(PROFILE_PAGE)
                    }) { Text("Profile page") }
                }
            }
        }

        composable(PROFILE_PAGE) {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                Column {
                    Text(
                        text = "User",
                        modifier = Modifier.padding(innerPadding)
                    )

                    Button(onClick = {
                        navController.navigate(HOME_PAGE)
                    }) { Text("Back to Home") }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MuscLabTheme {
        Greeting("Android")
    }
}