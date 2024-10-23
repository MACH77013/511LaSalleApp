package com.example.a511lasalleapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.a511lasalleapp.ui.theme._511LaSalleAppTheme
import com.example.a511lasalleapp.utils.alumno

@Composable
fun ChangeTemaScreen(innerPadding : PaddingValues, navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(innerPadding)
    ) {
        Text(text = "Cambiar Tema")

        Box(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red)
            .clickable {
                navController.navigate("settings")
            }
        )
        {
            Text(text = "volver")
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ChangeTemaScreen(){
    _511LaSalleAppTheme{
        ChangeTemaScreen(innerPadding = PaddingValues(0.dp), navController = rememberNavController())
    }
}