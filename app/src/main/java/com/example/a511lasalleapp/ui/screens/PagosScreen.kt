package com.example.a511lasalleapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.a511lasalleapp.ui.theme._511LaSalleAppTheme
import com.example.a511lasalleapp.utils.meses
import com.example.a511lasalleapp.R

@Composable
fun PagosScreen(innerPadding: PaddingValues, navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color.White),
    ){
        Column {
            Text("Pagado")
            meses.forEach { mes ->
                if (mes.pagado) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 2.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(horizontal = 20.dp)

                                .clip(RoundedCornerShape(16.dp))
                                .background(Color(0xFFDEE2E6)),

                            ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 2.dp, horizontal = 4.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically

                            ){
                                Text(
                                    text = mes.nombre,
                                    modifier = Modifier.padding(4.dp)
                                )

                                // Selección de imagen según el estado pagado
                                val imageResource = if (mes.pagado) {
                                    R.drawable.bien// Imagen si está pagado
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
            }
        Text("NO PAGADO")
        Column {
            meses.forEach { mes ->
                if (mes.pagado==false) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 2.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(horizontal = 20.dp)

                                .clip(RoundedCornerShape(16.dp))
                                .background(Color(0xFFDEE2E6)),

                            ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 2.dp, horizontal = 4.dp),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically

                            ){
                                Text(
                                    text = mes.nombre,
                                    modifier = Modifier.padding(4.dp)
                                )

                                // Selección de imagen según el estado pagado
                                val imageResource = if (mes.pagado) {
                                    R.drawable.bien// Imagen si está pagado
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
        }
    }
    Text(
        text = "Pagos screen"
    )
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