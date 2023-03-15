package com.example.ue_proyectointegrador.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "PELICULAS", indices = {@Index(value = {"idPelicula"}), @Index(value = {"titulo"}, unique = true)})
public class Peliculas {

    @PrimaryKey
    @NonNull
    public String idPelicula;

    @ColumnInfo(name = "titulo")
    public String titulo;

    @ColumnInfo(name = "genero")
    public String genero;

    @ColumnInfo(name = "valoracion")
    public double valoracion;

    @ColumnInfo(name = "director")
    public String director;

    @ColumnInfo(name = "duracion")
    public String duracion;

    @ColumnInfo(name = "sinopsis")
    public String sinopsis;

    @ColumnInfo(name = "imagen")
    public int imagen;


    public Peliculas(@NonNull String idPelicula, String titulo, String genero,
                     double valoracion, String director, String duracion, String sinopsis, int imagen) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.genero = genero;
        this.valoracion = valoracion;
        this.director = director;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.imagen = imagen;
    }

    @NonNull
    public String getIdPelicula() {
        return idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public double getValoracion() {
        return valoracion;
    }

    public String getDirector() {
        return director;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public int getImagen() {
        return imagen;
    }
}
