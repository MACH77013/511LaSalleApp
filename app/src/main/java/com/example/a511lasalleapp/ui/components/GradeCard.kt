package com.example.a511lasalleapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.a511lasalleapp.models.Materia

@Composable
fun GradeCard(materia: Materia, onClick:(Materia)->Unit) {
    Card(
        modifier = Modifier.fillMaxWidth()
            .padding(10.dp)
            .background(color = MaterialTheme.colorScheme.background)
            .clickable { onClick(materia) },

    ){
        Box(
            modifier = Modifier.fillMaxWidth(),
        ){
            Row(
                modifier = Modifier.padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
            ){
                Text(text = materia.nombreMateria)
                Text(text = ""+materia.promedioAcumulado)

            }
        }
    }
}