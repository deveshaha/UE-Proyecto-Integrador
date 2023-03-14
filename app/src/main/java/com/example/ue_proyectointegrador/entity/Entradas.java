package com.example.ue_proyectointegrador.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "ENTRADAS", indices = {@Index(value = {"idEntrada"})},
        foreignKeys = @ForeignKey(entity = Salas.class, parentColumns = "idSala", childColumns = "idSala"))
public class Entradas {

    @PrimaryKey
    @NonNull
    public int idEntrada;

    @ColumnInfo(name = "idSala")
    @NonNull
    public String idSala;

    @ColumnInfo(name = "numButaca")
    @NonNull
    public String numButaca;

    @ColumnInfo(name = "titulo")
    @NonNull
    public String titulo;

    public Entradas(int idEntrada, @NonNull String idSala, @NonNull String numButaca, @NonNull String titulo) {
        this.idEntrada = idEntrada;
        this.idSala = idSala;
        this.numButaca = numButaca;
        this.titulo = titulo;
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

    @NonNull
    public String getIdSala() {
        return idSala;
    }

    public void setIdSala(@NonNull String idSala) {
        this.idSala = idSala;
    }

    @NonNull
    public String getNumButaca() {
        return numButaca;
    }

    public void setNumButaca(@NonNull String numButaca) {
        this.numButaca = numButaca;
    }

    @NonNull
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(@NonNull String titulo) {
        this.titulo = titulo;
    }
}
