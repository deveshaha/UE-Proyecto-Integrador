package com.example.ue_proyectointegrador.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "CINES_SALAS",
    primaryKeys = {"idCine"}, foreignKeys = {
        @ForeignKey(entity = Cines.class, parentColumns = "idCine", childColumns = "idCine"),
        @ForeignKey(entity = Salas.class, parentColumns = "idSala", childColumns = "idSala")
    })
public class CinesSalas {

    @ColumnInfo(name = "idCine")
    @NonNull
    public String idCine;

    @ColumnInfo(name = "idSala")
    @NonNull
    public String idSala;

    public CinesSalas(@NonNull String idCine, @NonNull String idSala) {
        this.idCine = idCine;
        this.idSala = idSala;
    }

    @NonNull
    public String getIdCine() {
        return idCine;
    }

    @NonNull
    public String getIdSala() {
        return idSala;
    }
}
