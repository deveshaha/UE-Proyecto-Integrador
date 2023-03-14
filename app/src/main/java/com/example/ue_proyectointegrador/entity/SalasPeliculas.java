package com.example.ue_proyectointegrador.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "SALAS_PELICULAS", foreignKeys = {
        @ForeignKey(entity = Salas.class, parentColumns = "idSala", childColumns = "idSala"),
        @ForeignKey(entity = Peliculas.class, parentColumns = "idPelicula", childColumns = "idPelicula"),
        @ForeignKey(entity = Peliculas.class, parentColumns = "titulo", childColumns = "titulo")
})
public class SalasPeliculas {

    @ColumnInfo(name = "idSala")
    public String idSala;

    @ColumnInfo(name = "idPelicula")
    public String idPelicula;

    @ColumnInfo(name = "titulo")
    public String titulo;

    public SalasPeliculas(String idSala, String idPelicula, String titulo) {
        this.idSala = idSala;
        this.idPelicula = idPelicula;
        this.titulo = titulo;
    }

    public String getIdSala() {
        return idSala;
    }

    public String getIdPelicula() {
        return idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }
}
