package com.example.ue_proyectointegrador.listas;


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
                "El joven Peter Parker intenta desesperadamente volver a su vida normal tras los eventos de Spider-Man: Lejos de casa, pero se ve envuelto en una peligrosa conspiración multiversal.", "spider-man.jpg"));

        listaPeliculas.add(new Peliculas("PEL2", "Matrix Resurrections", 148.0, "Acción, Ciencia ficción",
                "Neo se encuentra de nuevo en el mundo de Matrix, pero no recuerda nada de su vida pasada. Pronto deberá enfrentarse a su destino y liberar a la humanidad de la opresión de las máquinas.", "matrix.jpg"));

        listaPeliculas.add(new Peliculas("PEL3", "Dune", 155.0, "Acción, Aventura",
                "En un futuro lejano, el joven Paul Atreides debe liderar a su pueblo en una lucha por el control del planeta desértico Arrakis, que alberga una valiosa especia.", "dune.jpg"));

        listaPeliculas.add(new Peliculas("PEL4", "The French Dispatch", 107.0, "Comedia, Drama",
                "Un grupo de periodistas americanos trabaja en una revista en una ciudad francesa ficticia del siglo XX.", "french_dispatch.jpg"));

        listaPeliculas.add(new Peliculas("PEL5", "The Power of the Dog", 125.0, "Drama, Western",
                "En la década de 1920, un ranchero adinerado y solitario comienza a acosar a su cuñado y a su hijo cuando su hermano se casa con una viuda.", "power_of_the_dog.jpg"));

        listaPeliculas.add(new Peliculas("PEL6", "Licorice Pizza", 133.0, "Comedia, Drama",
                "Gary y Alana son dos jóvenes en la década de 1970 que tratan de hacer realidad sus sueños mientras navegan por el caos y las oportunidades del Valle de San Fernando.", "licorice_pizza.jpg"));

        listaPeliculas.add(new Peliculas("PEL7", "The Lost Daughter", 120.0, "Drama, Thriller",
                "Una profesora universitaria de mediana edad viaja a Grecia para reflexionar sobre su vida y su carrera, pero pronto se ve involucrada en la vida de una joven madre y su hija.", "lost_daughter.jpg"));

        listaPeliculas.add(new Peliculas("PEL8", "Belfast", 97.0, "Drama",
                "En la década de 1960, un niño crece en Belfast en medio de la violencia sectaria y el cambio social.", "belfast.jpg"));

        listaPeliculas.add(new Peliculas("PEL9", "West Side Story", 156.0, "Drama, Musical",
                "Una versión actualizada del clásico musical de Broadway de 1957, que sigue a dos jóvenes amantes de diferentes bandas callejeras en la ciudad de Nueva York.", "west_side_story.jpg"));

        listaPeliculas.add(new Peliculas("PEL10", "Don't Look Up", 138.0, "Comedia, Ciencia ficción",
                "Dos astrónomos descubren un cometa que se dirige hacia la Tierra y tratan de advertir al mundo del inminente desastre, pero nadie les cree.", "dont_look_up.jpg"));


        return listaPeliculas;
    }
}
