package com.example.ue_proyectointegrador.dao;

import androidx.room.Query;

import com.example.ue_proyectointegrador.entity.Cines;

import java.util.List;

public interface PeliculasDao {

    //Pasamos el nombre de la pelicula y nos devuelve un listado de los cines que tienen esa pelicula
    @Query("SELECT CINES.nombre " +
            "FROM CINES INNER JOIN CINES_SALAS " +
            "ON CINES.idCine = CINES_SALAS.idCine " +
            "INNER JOIN SALAS_PELICULAS " +
            "ON SALAS_PELICULAS.idSala = SALAS_PELICULAS.idSala " +
            "WHERE SALAS_PELICULAS.titulo LIKE :titulo")
    public List<Cines> getCinesByPelicula(String titulo);


    //Pasamos el nombre de la pelicula y nos devuelve un listado de las salas que tienen esa pelicula
    @Query("SELECT SALAS.idSala " +
            "FROM SALAS INNER JOIN SALAS_PELICULAS " +
            "ON SALAS.idSala = SALAS_PELICULAS.idSala " +
            "WHERE SALAS_PELICULAS.titulo LIKE :titulo")
    public List<String> getSalasByPelicula(String titulo);


    //Para mostrar todos los cines disponibles
    @Query("SELECT * FROM CINES")
    public List<Cines> getAllCines();


    //Listado de las peliculas que hay e total con un distinct para que no se repitan
    @Query("SELECT DISTINCT titulo " +
            "FROM SALAS_PELICULAS")
    public List<String> getAllPeliculas();



}
