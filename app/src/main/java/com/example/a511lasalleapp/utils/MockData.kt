package com.example.a511lasalleapp.utils

import com.example.a511lasalleapp.models.Community
import com.example.a511lasalleapp.models.Materia
import com.example.a511lasalleapp.models.News
import com.example.a511lasalleapp.models.User

val newsList = listOf(
    News(
        id = 1,
        title = "Evento de Construcción de la Paz",
        description = "La Salle Bajío realiza un foro para fomentar la construcción de la paz en la comunidad estudiantil.",
        image =  "https://www.lasallebajio.edu.mx/noticias/images/4701_1.jpg"
    ),
    News(
        id = 2,
        title = "Conferencia de Liderazgo",
        description = "Una conferencia que destaca la importancia del liderazgo en la comunidad universitaria.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_2.jpg"
    ),
    News(
        id = 3,
        title = "Semana Cultural 2024",
        description = "Celebración anual de la Semana Cultural con diversas actividades artísticas y deportivas.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_3.jpg"
    )
)

val communities = listOf(
    Community(1,"https://www.lasallebajio.edu.mx/comunidad/images/tile_documentos_inspiradores.jpg"),
    Community(2,"https://www.lasallebajio.edu.mx/comunidad/images/tile_boletin.jpg"),
    Community(3,"https://www.lasallebajio.edu.mx/comunidad/images/tile_cat_souv_22.jpg  "),
    Community(4,"https://www.lasallebajio.edu.mx/comunidad/images/tile_tramites.jpg"),
    Community(5,"https://www.lasallebajio.edu.mx/comunidad/images/tile_blog.jpg"),
)

val alumno = User(
    id = 1,
    name = "Máximo Camacho Hernández",
    fechaNac = "03-03-2004",
    correo="mach77013@lasalle.edu.mx",
    imagen = "https://i.pinimg.com/736x/95/18/c7/9518c7baecedd451cc171af7ec775a51.jpg",
    carrera = "ISSC",
    semestre = 5,
    promedio = 0.0,
    materias = listOf(
        Materia(
            id = 1,
            nombreMateria = "Desarrollo Web en JavaScript",
            promedioAcumulado = 0.0,
            calificaciones = listOf(9.3, 9.0, 8.9)
        ),
        Materia(
            id = 2,
            nombreMateria = "Sistemas Operativos",
            promedioAcumulado = 0.0,
            calificaciones = listOf(8.6, 8.4, 8.9)
        ),
        Materia(
            id = 3,
            nombreMateria = "Matemáticas Discretas",
            promedioAcumulado = 0.0,
            calificaciones = listOf(8.1, 8.0, 8.5)
        ),
        Materia(
            id = 4,
            nombreMateria = "Redes de Computadoras",
            promedioAcumulado = 0.0,
            calificaciones = listOf(9.2, 8.7, 9.1)
        ),
        Materia(
            id = 5,
            nombreMateria = "Procesamiento Digital de Imágenes",
            promedioAcumulado = 0.0,
            calificaciones = listOf(8.9, 9.0, 9.2)
        )
    )
)