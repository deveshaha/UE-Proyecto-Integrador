package com.example.ue_proyectointegrador.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "SALAS_PELICULAS", foreignKeys = {
        @ForeignKey(entity = Salas.class, parentColumns = "idSala", childColumns = "idSala"),
        @ForeignKey(entity = Peliculas.class, parentColumns = "idPelicula", childColumns = "idPelicula"),
        @ForeignKey(entity = Peliculas.class, parentColumns = "titulo", childColumns = "titulo")
})
public class SalasPeliculas {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "idSala")
    @NonNull
    public String idSala;

    @ColumnInfo(name = "idPelicula")
    @NonNull
    public String idPelicula;

    @ColumnInfo(name = "titulo")
    @NonNull
    public String titulo;

    public SalasPeliculas(@NonNull String idSala, @NonNull String idPelicula, @NonNull String titulo) {
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
