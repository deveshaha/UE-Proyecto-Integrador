package com.example.ue_proyectointegrador.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "PELICULAS", indices = {@Index(value = {"idPelicula"}, unique = true)})
public class Peliculas {

    @PrimaryKey
    @NonNull
    public String idPelicula;

    @ColumnInfo(name = "titulo")
    public String titulo;

    @ColumnInfo(name = "duracion")
    public double duracion;

    @ColumnInfo(name = "genero")
    public String genero;

    @ColumnInfo(name = "sinopsis")
    public String sinopsis;

    @ColumnInfo(name = "imagen")
    public String imagen;

    public Peliculas(@NonNull String idPelicula, String titulo, double duracion, String genero, String sinopsis, String imagen) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
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

    public double getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getImagen() {
        return imagen;
    }
}
