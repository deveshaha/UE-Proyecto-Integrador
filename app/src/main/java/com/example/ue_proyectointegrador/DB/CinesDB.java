package com.example.ue_proyectointegrador.DB;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.ue_proyectointegrador.dao.PeliculasDao;
import com.example.ue_proyectointegrador.entity.Butacas;
import com.example.ue_proyectointegrador.entity.Cines;
import com.example.ue_proyectointegrador.entity.CinesSalas;
import com.example.ue_proyectointegrador.entity.DisponibilidadSalasButacas;
import com.example.ue_proyectointegrador.entity.Entradas;
import com.example.ue_proyectointegrador.entity.Peliculas;
import com.example.ue_proyectointegrador.entity.Salas;
import com.example.ue_proyectointegrador.entity.Usuario;

@Database(entities = {Cines.class, Butacas.class, CinesSalas.class, Salas.class, Entradas.class,
        DisponibilidadSalasButacas.class, Peliculas.class, Usuario.class}, version = 7, exportSchema = false)
public abstract class CinesDB extends RoomDatabase {


    public abstract PeliculasDao peliculasDao();


    private static CinesDB cinesDB;

    public static CinesDB getDatabase(Context context) {
        if (cinesDB == null) {
            cinesDB = Room.databaseBuilder(
                            context.getApplicationContext(),
                            CinesDB.class, "CINES_DB")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return cinesDB;
    }

}
