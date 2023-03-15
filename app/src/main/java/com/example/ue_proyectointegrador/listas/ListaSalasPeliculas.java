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

        //Generamos combinaciones aleatorias
        Collections.shuffle(listaSalas2);
        Collections.shuffle(listaPeliculas2);

        // Iterar por las listas de salas y películas para crear combinaciones
        for (int i = 0; i < listaSalas2.size(); i++) {
            Salas sala = listaSalas2.get(i);
            Peliculas pelicula = listaPeliculas2.get(i);
            String idSala = sala.getIdSala();
            String idPelicula = pelicula.getIdPelicula();
            String titulo = pelicula.getTitulo();

            // Agregar combinación a la lista de salas y películas
            listaSalasPeliculas.add(new Entradas(idSala, idPelicula, titulo));

        }


            return listaSalasPeliculas;
    }
}
