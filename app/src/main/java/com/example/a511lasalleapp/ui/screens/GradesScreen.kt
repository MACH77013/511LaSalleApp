package com.example.a511lasalleapp.ui.screens

import android.util.Log
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.a511lasalleapp.ui.components.CardImage
import com.example.a511lasalleapp.ui.components.GradeCard
import com.example.a511lasalleapp.utils.Screens
import com.example.a511lasalleapp.utils.alumno
import com.example.a511lasalleapp.utils.newsList

@Composable
fun GradesScreen(innerPadding : PaddingValues, navController: NavController){
    Text("Grades")

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        items(alumno.materias) { materia ->
            GradeCard(materia = materia){
                navController.navigate(Screens.MateriaDetalleScreen.route+"/${materia.id}")
            }
        }


        }
}

