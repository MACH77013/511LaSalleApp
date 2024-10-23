package com.example.a511lasalleapp.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.a511lasalleapp.ui.theme._511LaSalleAppTheme

@Composable
fun GradeDetalleScreen(innerPadding: PaddingValues, gradeId : Int, navController: NavController) {

}
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GradesDetailPreview() {
    _511LaSalleAppTheme {
        GradeDetalleScreen(innerPadding = PaddingValues(0.dp), gradeId = 1, navController = rememberNavController())
    }
}