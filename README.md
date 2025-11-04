# Proyecto POO - Sistema de Contenidos Audiovisuales 🎬
**Universidad Politécnica Salesiana**  
**Estudiante:** Alexander Paltas  

## Objetivo del Proyecto
Este proyecto tiene como propósito aplicar los **principios de la Programación Orientada a Objetos (POO)** en Java, integrando conceptos avanzados como **herencia, asociación, agregación y composición**.  
A través del modelado de distintos tipos de contenido audiovisual, se busca demostrar la correcta implementación de relaciones entre clases, el uso de constructores, métodos y encapsulamiento.

## Descripción General
El sistema representa una colección de **contenidos audiovisuales** como películas, series, documentales, podcasts y webinars.  
Cada tipo de contenido posee sus propias características, y a su vez, se relaciona con otras clases que amplían su funcionalidad.

La estructura se basa en una clase abstracta principal:
- `ContenidoAudiovisual`  
De la cual heredan:
- `Pelicula`  
- `SerieDeTV`  
- `Documental`  
- `Podcast`  
- `Webinar`

Además, se integran clases adicionales para representar relaciones entre objetos:
- `Actor` → relacionada con `Pelicula` (Agregación)  
- `Temporada` → relacionada con `SerieDeTV` (Composición)  
- `Investigador` → relacionada con `Documental` (Asociación)
##  Conceptos Aplicados
- **Herencia:** reutilización de atributos y métodos comunes desde `ContenidoAudiovisual`.  
- **Asociación:** conexión entre objetos independientes (Documental ↔ Investigador).  
- **Agregación:** relación débil “todo-parte” (Pelicula ↔ Actor).  
- **Composición:** relación fuerte “todo-parte” donde una clase no existe sin la otra (SerieDeTV ↔ Temporada).  
