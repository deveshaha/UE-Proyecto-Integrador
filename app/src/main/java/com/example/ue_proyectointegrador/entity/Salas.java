package com.example.ue_proyectointegrador.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "SALAS", indices = {@Index(value = {"idSala"})})
public class Salas {

    //IDSala, Aforo, Disponibilidad

    @PrimaryKey
    @NonNull
    public String idSala;

    @ColumnInfo(name = "aforo")
    public int aforo;

    @ColumnInfo(name = "disponibilidad")
    public boolean disponibilidad;

    public Salas(@NonNull String idSala, int aforo, boolean disponibilidad) {
        this.idSala = idSala;
        this.aforo = aforo;
        this.disponibilidad = disponibilidad;
    }

    @NonNull
    public String getIdSala() {
        return idSala;
    }

    public int getAforo() {
        return aforo;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    @Override
    public String toString() {
        return "Salas{" +
                "idSala='" + idSala + '\'' +
                ", aforo=" + aforo +
                ", disponibilidad=" + disponibilidad +
                '}';
    }
}
