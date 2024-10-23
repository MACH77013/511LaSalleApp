package com.example.a511lasalleapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.a511lasalleapp.ui.components.GradeCard
import com.example.a511lasalleapp.utils.Screens
import com.example.a511lasalleapp.utils.alumno

@Composable
fun MateriaDetalleScreen(innerPadding: PaddingValues, gradeId : Int,navController:NavController) {
    val materia = alumno.materias.first{it.id ==gradeId}

    Box(){
        Text(text = materia.nombreMateria)
        Text( text = ""+materia.promedioAcumulado)
    }
}