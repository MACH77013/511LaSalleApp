package com.example.a511lasalleapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.a511lasalleapp.ui.theme._511LaSalleAppTheme
import com.example.a511lasalleapp.utils.alumno

@Composable
fun MateriaDetalleScreen(innerPadding: PaddingValues, gradeId: Int, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(16.dp)
            .background(Color(0xFFF0F4F8)), // Fondo color claro
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Detalles de la Materia",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        val materia = alumno.materias.find { it.id == gradeId }

        materia?.let {
            val pesos = listOf(0.2, 0.3, 0.5)
            var totalPonderado = 0.0
            var totalPesos = 0.0

            for (i in it.calificaciones.indices) {
                val calificacion = it.calificaciones[i]
                val porcentaje = when (i) {
                    0 -> "20%"
                    1 -> "30%"
                    2 -> "50%"
                    else -> "0%"
                }

                totalPonderado += calificacion * pesos[i]
                totalPesos += pesos[i]

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(8.dp))
                        .background(MaterialTheme.colorScheme.secondary.copy(alpha = 0.1f))
                        .padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(
                            modifier = Modifier.weight(1f)
                        ) {
                            Text(text = "Calificación ${i + 1}", style = MaterialTheme.typography.bodyLarge)
                            Text(
                                text = "$calificacion",
                                style = MaterialTheme.typography.bodyMedium,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        Text(
                            text = porcentaje,
                            style = MaterialTheme.typography.bodySmall,
                            modifier = Modifier.align(Alignment.Bottom)
                        )
                    }
                }
            }

            val promedio = if (totalPesos > 0) totalPonderado / totalPesos else 0.0

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Promedio Final:",
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = "${String.format("%.2f", promedio)}",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.primary
            )
        } ?: run {
            Text(text = "Materia no encontrada.", color = Color.Red)
        }

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = { navController.navigate("grades") },
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
        ) {
            Text("Volver a Calificaciones")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MateriaDetallePreview() {
    _511LaSalleAppTheme {
        MateriaDetalleScreen(innerPadding = PaddingValues(0.dp), gradeId = 1, navController = rememberNavController())
    }
}
