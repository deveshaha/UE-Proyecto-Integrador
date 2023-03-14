package com.example.ue_proyectointegrador.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.ue_proyectointegrador.entity.Butacas;
import com.example.ue_proyectointegrador.entity.Cines;
import com.example.ue_proyectointegrador.entity.CinesSalas;
import com.example.ue_proyectointegrador.entity.Peliculas;
import com.example.ue_proyectointegrador.entity.Salas;

import com.example.ue_proyectointegrador.entity.Usuario;

import java.util.List;
@Dao
public interface PeliculasDao {

    @Insert
    void insertAllPeliculas(List<Peliculas> peliculas);

    @Insert
    void insertAllCines(List<Cines> cines);
/*
    @Insert
    void insertAllSalasPeliculas(List<SalasPeliculas> salasPeliculas);
*/
    @Insert
    void insertAllCinesSalas(List<CinesSalas> cinesSalas);

    @Insert
    void insertAllButacas(List<Butacas> butacas);

    @Insert
    void insertAllUsuarios(List<Usuario> usuarios);

    @Insert
    void insertAllSalas(List<Salas> salas);

/*

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
*/

    //Para mostrar todos los cines disponibles
    @Query("SELECT * FROM CINES")
    public List<Cines> getAllCines();

    //Para mostrar todas las salas disponibles
    @Query("SELECT * FROM SALAS")
    public List<Salas> getAllSalas();

    @Query("SELECT * FROM CINES_SALAS")
    public List<CinesSalas> getAllCinesSalas();


    @Query("SELECT * FROM PELICULAS")
    public List<Peliculas> getAllPeliculas();

    @Query("SELECT * FROM BUTACAS")
    public List<Butacas> getAllButacas();

    @Query("SELECT * FROM USUARIOS")
    public List<Usuario> getAllUsuarios();

    //TODO:Fix Salas_Peliculas
/*
    @Query("SELECT * FROM SALAS_PELICULAS")
    public List<SalasPeliculas> getAllSalasPeliculas();

 */
}
