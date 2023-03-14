package com.example.ue_proyectointegrador.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import androidx.room.PrimaryKey;

@Entity(tableName = "PELICULAS_SALAS", foreignKeys = {
        @ForeignKey(entity = Salas.class, parentColumns = "idSala", childColumns = "idSala"),
        @ForeignKey(entity = Peliculas.class, parentColumns = "idPelicula", childColumns = "idPelicula"),
        @ForeignKey(entity = Peliculas.class, parentColumns = "titulo", childColumns = "titulo")
})
public class Entradas {

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

    public Entradas( @NonNull String idSala, @NonNull String idPelicula, @NonNull String titulo) {
        this.idSala = idSala;
        this.idPelicula = idPelicula;
        this.titulo = titulo;
    }


    @NonNull
    public String getIdSala() {
        return idSala;
    }

    public void setIdSala(@NonNull String idSala) {
        this.idSala = idSala;
    }

    @NonNull
    public String getidPelicula() {
        return idPelicula;
    }

    public void setidPelicula(@NonNull String idPelicula) {
        this.idPelicula = idPelicula;
    }

    @NonNull
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(@NonNull String titulo) {
        this.titulo = titulo;
    }
}
