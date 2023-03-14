package com.example.ue_proyectointegrador.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "CINES", indices = {@Index(value = {"idCine"}, unique = true)})
public class Cines {

    //Direccion, nombre, idCine

    @PrimaryKey
    @NonNull
    public String idCine;

    @ColumnInfo(name = "nombre")
    public String nombre;

    @ColumnInfo(name = "longitud")
    public Double longitud;

    @ColumnInfo(name = "latitud")
    public Double latitud;

    public Cines(@NonNull String idCine, String nombre, Double longitud, Double latitud) {
        this.idCine = idCine;
        this.nombre = nombre;
        this.longitud = longitud;
        this.latitud = latitud;
    }


    @NonNull
    public String getIdCine() {
        return idCine;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getLongitud() {
        return longitud;
    }
    public Double getLatitud() {
        return latitud;
    }
}
