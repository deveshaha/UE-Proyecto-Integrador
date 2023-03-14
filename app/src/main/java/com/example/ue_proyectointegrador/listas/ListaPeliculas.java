package com.example.ue_proyectointegrador.listas;


import com.example.ue_proyectointegrador.R;
import com.example.ue_proyectointegrador.entity.Peliculas;

import java.util.ArrayList;

public class ListaPeliculas {

    private static ArrayList<Peliculas> listaPeliculas = null;

    public static ArrayList<Peliculas> getListaPeliculas() {
        if (listaPeliculas != null) {
            return listaPeliculas;
        }
        listaPeliculas = new ArrayList<>();

        listaPeliculas.add(new Peliculas("PEL1", "Spider-Man: No Way Home", 147.0, "Acción, Aventura",
                "El joven Peter Parker intenta desesperadamente volver a su vida normal tras los eventos de Spider-Man: Lejos de casa, pero se ve envuelto en una peligrosa conspiración multiversal.", R.drawable.im_movie_1));

        listaPeliculas.add(new Peliculas("PEL2", "Matrix Resurrections", 148.0, "Acción, Ciencia ficción",
                "Neo se encuentra de nuevo en el mundo de Matrix, pero no recuerda nada de su vida pasada. Pronto deberá enfrentarse a su destino y liberar a la humanidad de la opresión de las máquinas.", R.drawable.im_movie_2));

        listaPeliculas.add(new Peliculas("PEL3", "Dune", 155.0, "Acción, Aventura",
                "En un futuro lejano, el joven Paul Atreides debe liderar a su pueblo en una lucha por el control del planeta desértico Arrakis, que alberga una valiosa especia.", R.drawable.im_movie_3));

        listaPeliculas.add(new Peliculas("PEL4", "The French Dispatch", 107.0, "Comedia, Drama",
                "Un grupo de periodistas americanos trabaja en una revista en una ciudad francesa ficticia del siglo XX.", R.drawable.im_movie_4));

        listaPeliculas.add(new Peliculas("PEL5", "The Power of the Dog", 125.0, "Drama, Western",
                "En la década de 1920, un ranchero adinerado y solitario comienza a acosar a su cuñado y a su hijo cuando su hermano se casa con una viuda.", R.drawable.im_movie_5));

        listaPeliculas.add(new Peliculas("PEL6", "Licorice Pizza", 133.0, "Comedia, Drama",
                "Gary y Alana son dos jóvenes en la década de 1970 que tratan de hacer realidad sus sueños mientras navegan por el caos y las oportunidades del Valle de San Fernando.", R.drawable.im_movie_6));

        listaPeliculas.add(new Peliculas("PEL7", "The Lost Daughter", 120.0, "Drama, Thriller",
                "Una profesora universitaria de mediana edad viaja a Grecia para reflexionar sobre su vida y su carrera, pero pronto se ve involucrada en la vida de una joven madre y su hija.", R.drawable.im_movie_7));

        listaPeliculas.add(new Peliculas("PEL8", "Belfast", 97.0, "Drama",
                "En la década de 1960, un niño crece en Belfast en medio de la violencia sectaria y el cambio social.", R.drawable.im_movie_8));

        return listaPeliculas;
    }
}
