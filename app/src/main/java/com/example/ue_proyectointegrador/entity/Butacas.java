package com.example.ue_proyectointegrador.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "BUTACAS", indices = {@Index(value = {"numButaca"}, unique = true)},
        foreignKeys = @ForeignKey(entity = Salas.class, parentColumns = "idSala", childColumns = "idSala"))
public class Butacas {

    @PrimaryKey
    @NonNull
    public String numButaca;

    @ColumnInfo(name = "idSala")
    @NonNull
    public String idSala;

    public Butacas(String numButaca, @NonNull String idSala) {
        this.numButaca = numButaca;
        this.idSala = idSala;
    }

    public String getNumButaca() {
        return numButaca;
    }

    @NonNull
    public String getIdSala() {
        return idSala;
    }


}
