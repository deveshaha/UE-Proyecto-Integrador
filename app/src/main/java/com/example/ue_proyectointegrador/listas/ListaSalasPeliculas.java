package com.example.ue_proyectointegrador.listas;

import com.example.ue_proyectointegrador.entity.Peliculas;
import com.example.ue_proyectointegrador.entity.Salas;
import com.example.ue_proyectointegrador.entity.Entradas;

import java.util.ArrayList;
import java.util.Collections;

public class ListaSalasPeliculas {

    private static ArrayList<Entradas> listaSalasPeliculas = null;

    public static ArrayList<Entradas> getListaSalasPeliculas() {
        if (listaSalasPeliculas != null) {
            return listaSalasPeliculas;
        }

        listaSalasPeliculas = new ArrayList<>();
        ArrayList<Salas> listaSalas2 = ListaSalas.getListaSalas();
        ArrayList<Peliculas> listaPeliculas2 = ListaPeliculas.getListaPeliculas();


        for (Salas sala : listaSalas2) {

            Collections.shuffle(listaPeliculas2);

            for (Peliculas pelicula : listaPeliculas2) {

                Entradas entrada = new Entradas(sala.getIdSala(), pelicula.getIdPelicula(), pelicula.getTitulo());

                listaSalasPeliculas.add(entrada);
            }
        }

            return listaSalasPeliculas;
    }
}
