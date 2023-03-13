package com.example.ue_proyectointegrador.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "CINES", indices = {@Index(value = {"direccion"}, unique = true)})
public class Cines {

    //Direccion, nombre, idCine

    @PrimaryKey
    @NonNull
    public String idCine;


    @ColumnInfo(name = "nombre")
    public String nombre;


    @ColumnInfo(name = "direccion")
    public String direccion;

    public Cines(@NonNull String idCine, String nombre, String direccion) {
        this.idCine = idCine;
        this.nombre = nombre;
        this.direccion = direccion;
    }


    @NonNull
    public String getIdCine() {
        return idCine;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Cines{" +
                "idCine='" + idCine + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
