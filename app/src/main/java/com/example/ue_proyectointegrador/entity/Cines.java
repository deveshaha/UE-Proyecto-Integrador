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
    public String longitud;

    @ColumnInfo(name = "latitud")
    public String latitud;

    public Cines(@NonNull String idCine, String nombre, String longitud, String latitud) {
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

    public String getLongitud() {
        return longitud;
    }
    public String getLatitud() {
        return latitud;
    }
}
