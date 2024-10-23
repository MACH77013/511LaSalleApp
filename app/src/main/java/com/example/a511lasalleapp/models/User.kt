package com.example.a511lasalleapp.models

data class User(
    val id : Int,
    val name : String,
    val fechaNac : String,
    val correo : String,
    val imagen : String,
    val carrera: String,
    val semestre: Int,
    val promedio: Double,
    val materias:List<Materia>
)