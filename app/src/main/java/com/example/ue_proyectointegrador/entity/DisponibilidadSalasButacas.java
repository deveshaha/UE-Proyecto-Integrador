package com.example.ue_proyectointegrador.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "DISPONIBILIDAD_SALAS_BUTACAS",foreignKeys = {
        @ForeignKey(entity = Salas.class, parentColumns = "idSala", childColumns = "idSala"),
        @ForeignKey(entity = Butacas.class, parentColumns = "numButaca", childColumns = "numButaca")
})
public class DisponibilidadSalasButacas {

    //idSala, numButaca, fecchaHora

    @ColumnInfo(name = "idSala")
    public String idSala;

    @ColumnInfo(name = "numButaca")
    public String numButaca;

    @ColumnInfo(name = "fechaHora")
    public String fechaHora;

    public DisponibilidadSalasButacas(String idSala, String numButaca, String fechaHora) {
        this.idSala = idSala;
        this.numButaca = numButaca;
        this.fechaHora = fechaHora;
    }

    public String getIdSala() {
        return idSala;
    }

    public void setIdSala(String idSala) {
        this.idSala = idSala;
    }

    public String getNumButaca() {
        return numButaca;
    }

    public void setNumButaca(String numButaca) {
        this.numButaca = numButaca;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }
}
