package com.example.ue_proyectointegrador.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "CINES_SALAS", foreignKeys = {
        @ForeignKey(entity = Cines.class, parentColumns = "idCine", childColumns = "idCine"),
        @ForeignKey(entity = Salas.class, parentColumns = "idSala", childColumns = "idSala")
    })
public class CinesSalas {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "idCine")
    @NonNull
    public String idCine;

    @ColumnInfo(name = "idSala")
    @NonNull
    public String idSala;

    @ColumnInfo(name = "nombreCine")
    @NonNull
    public String nombreCine;

    public CinesSalas(@NonNull String idCine, @NonNull String idSala, @NonNull String nombreCine) {
        this.idCine = idCine;
        this.idSala = idSala;
        this.nombreCine = nombreCine;
    }

    @NonNull
    public String getIdCine() {
        return idCine;
    }

    @NonNull
    public String getIdSala() {
        return idSala;
    }

    @NonNull
    public String getNombreCine() {
        return nombreCine;
    }
}
