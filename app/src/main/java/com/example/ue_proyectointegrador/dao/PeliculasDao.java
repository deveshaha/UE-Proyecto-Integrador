package com.example.ue_proyectointegrador.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.ue_proyectointegrador.entity.Butacas;
import com.example.ue_proyectointegrador.entity.Cines;
import com.example.ue_proyectointegrador.entity.CinesSalas;
import com.example.ue_proyectointegrador.entity.DisponibilidadSalasButacas;
import com.example.ue_proyectointegrador.entity.Entradas;
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

    @Insert
    void insertAllCinesSalas(List<CinesSalas> cinesSalas);

    @Insert
    void insertAllButacas(List<Butacas> butacas);

    @Insert
    void insertAllUsuarios(List<Usuario> usuarios);

    @Insert
    void insertAllSalas(List<Salas> salas);

    @Insert
    void insertAllSalasPeliculas(List<Entradas> salasPeliculas);

    @Insert
    void insertDisponibilidadSalasButacas(List<DisponibilidadSalasButacas> disponibilidad);



    //TODO: ARREGLAR ESTO
    //Pasamos el nombre de la pelicula y nos devuelve un listado de los cines que tienen esa pelicula
    @Query("SELECT PELICULAS_SALAS.idSala, PELICULAS_SALAS.titulo, PELICULAS_SALAS.precio " +
            "FROM CINES INNER JOIN CINES_SALAS " +
            "ON CINES.idCine = CINES_SALAS.idCine " +
            "INNER JOIN PELICULAS_SALAS " +
            "ON PELICULAS_SALAS.idSala = PELICULAS_SALAS.idSala " +
            "WHERE PELICULAS_SALAS.titulo LIKE :titulo")
    public List<Entradas> getCinesByPelicula(String titulo);

    //una query que le de un titulo y me de todos los cines donde esta esa pelicula
    @Query("SELECT CINES.nombre " +
            "FROM CINES INNER JOIN CINES_SALAS " +
            "ON CINES.idCine = CINES_SALAS.idCine " +
            "INNER JOIN PELICULAS_SALAS " +
            "ON PELICULAS_SALAS.idSala = PELICULAS_SALAS.idSala " +
            "WHERE PELICULAS_SALAS.titulo LIKE :titulo")
    public List<String> getCinesByPelicula2(String titulo);

    //Pasamos el nombre de la pelicula y nos devuelve un listado de las salas que tienen esa pelicula
    @Query("SELECT SALAS.idSala " +
            "FROM SALAS INNER JOIN PELICULAS_SALAS " +
            "ON SALAS.idSala = PELICULAS_SALAS.idSala " +
            "WHERE PELICULAS_SALAS.titulo LIKE :titulo")
    public List<String> getSalasByPelicula(String titulo);


    //Vemos si en esa sala hay algun asiento ocupado
    @Query("SELECT * " +
            "FROM DISPONIBILIDAD_SALAS_BUTACAS " +
            "WHERE idSala LIKE :idSala AND numButaca LIKE :idButaca AND fechaHora LIKE :fechaHora")
    public List<DisponibilidadSalasButacas> getDisponibilidadBySala(String idSala, String idButaca, String fechaHora);


    //Pasamos el nombre de la pelicula y nos devuelve las peliculas con ese nombre
    @Query("SELECT * FROM PELICULAS WHERE titulo LIKE :titulo")
    public List<Peliculas> getPeliculasByTitulo(String titulo);



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

    @Query("SELECT * FROM PELICULAS_SALAS")
    public List<Entradas> getAllPeliculasSalas();

    //Query para consultar una pelicula por su id
    @Query("SELECT * FROM PELICULAS WHERE idPelicula LIKE :idPelicula")
    public Peliculas getPeliculaById(String idPelicula);

}
