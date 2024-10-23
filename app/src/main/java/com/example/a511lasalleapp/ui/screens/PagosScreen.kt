package com.example.a511lasalleapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.a511lasalleapp.ui.theme._511LaSalleAppTheme
import com.example.a511lasalleapp.utils.meses
import com.example.a511lasalleapp.R

@Composable
fun PagosScreen(innerPadding: PaddingValues, navController: NavController) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(vertical = 20.dp, horizontal = 16.dp)
            .verticalScroll(scrollState), // Agrega padding general para toda la pantalla
    ) {
        // Sección de pagos realizados
        Text(
            "PAGO DE COLEGIATURAS",
            modifier = Modifier
                .padding(vertical = 12.dp),
            color = Color.Black,
            fontSize = 25.sp
        )
        Text(
            "Pagado",
            modifier = Modifier
                .padding(vertical = 8.dp),
            color = Color.Black
        )
        meses.forEach { mes ->
            if (mes.pagado) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp) // Padding entre cada item
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color(0xFFDEE2E6))
                        .padding(12.dp) // Padding interno del item
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = mes.nombre,
                            modifier = Modifier.padding(4.dp),
                            color = Color.Black
                        )

                        // Selección de imagen según el estado pagado
                        val imageResource = if (mes.pagado) {
                            R.drawable.bien // Imagen si está pagado
                        } else {
                            R.drawable.mal // Imagen si no está pagado
                        }

                        Icon(
                            painter = painterResource(id = imageResource),
                            contentDescription = if (mes.pagado) "Pagado" else "No pagado",
                            tint = Color.Unspecified,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            }
        }

        // Sección de pagos no realizados
        Spacer(modifier = Modifier.height(16.dp)) // Separación entre secciones
        Text(
            "NO PAGADO",
            modifier = Modifier
                .padding(vertical = 8.dp),
            color = Color.Black
        )
        meses.forEach { mes ->
            if (!mes.pagado) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp) // Padding entre cada item
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color(0xFFDEE2E6))
                        .padding(12.dp) // Padding interno del item
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = mes.nombre,
                            modifier = Modifier.padding(4.dp),
                            color = Color.Black
                        )

                        // Selección de imagen según el estado pagado
                        val imageResource = if (mes.pagado) {
                            R.drawable.bien // Imagen si está pagado
                        } else {
                            R.drawable.mal // Imagen si no está pagado
                        }

                        Icon(
                            painter = painterResource(id = imageResource),
                            contentDescription = if (mes.pagado) "Pagado" else "No pagado",
                            tint = Color.Unspecified,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            }
        }
    }
    Spacer(modifier = Modifier.height(8.dp))

}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PagosScreen() {
    _511LaSalleAppTheme {
        PagosScreen(innerPadding = PaddingValues(0.dp), navController = rememberNavController())
    }
}