package com.example.ue_proyectointegrador.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "USUARIOS", indices = {@Index(value = {"email"}, unique = true)})
public class Usuario {

    @PrimaryKey
    @NonNull
    public String email;

    @ColumnInfo(name = "password")
    public String password;

    @ColumnInfo(name = "nombre")
    public String nombre;

    @ColumnInfo(name = "saldo")
    public double saldo;


    public Usuario(@NonNull String email, String password, String nombre, double saldo) {
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
