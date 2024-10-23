package com.example.a511lasalleapp.utils

import com.example.a511lasalleapp.models.Materia
import com.example.a511lasalleapp.models.User

fun Materia.calcularPromedio() : Double{
    if (calificaciones.isNotEmpty()){
        val promedioTotal = ( (calificaciones[0]*.30) + (calificaciones[1]*.30) + (calificaciones[2]*.40) )
        promedioAcumulado = promedioTotal
        return promedioAcumulado
    }
    else{
        promedioAcumulado = 0.0
        return promedioAcumulado
    }
}

fun User.calcularPromedioGeneral(): Double {
    val promedioFinal = materias.sumOf { it.calcularPromedio() }
    return if (materias.isNotEmpty()) {
        promedioFinal / materias.size
    } else {
        0.0
        }
}