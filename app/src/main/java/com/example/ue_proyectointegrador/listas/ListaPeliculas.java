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

        listaPeliculas.add(new Peliculas("PEL1", "Oso vicioso", "1h 35m", "Comedia",
                "Un varipinto grupo formado por policías, delincuentes, turistas y adolescentes converge en un bosque de Georgia donde un oso negro de 500 libras se vuelve loco después de ingerir cocaína sin querer, que cayó del avión de un narcotraficante.", R.drawable.im_movie_1));

        listaPeliculas.add(new Peliculas("PEL2", "Llaman a la puerta", "1h 40m", "Misterio y suspenso",
                "Durante unas vacaciones en una cabaña en un bosque alejada de todo, una niña y sus padres se convierten en rehenes de cuatro desconocidos armados que obligan a la familia a tomar una decisión imposible para evitar el apocalipsis. Con acceso limitado al mundo exterior, la familia deberá decidir qué creer antes de que todo esté perdido", R.drawable.im_movie_2));

        listaPeliculas.add(new Peliculas("PEL3", "El peor vecino del mundo", "2h 06m", "Drama, Comedia",
                "Otto Anderson (Tom Hanks) es un viudo cascarrabias y muy obstinado. Cuando una alegre joven familia se muda a la casa de al lado, Otto encuentra la horma de su zapato en la espabilada, y muy embarazada, Marisol, con la que entablará una muy improbable amistad que pondrá su mundo patas arriba... Remake de la película sueca 'A Man Called Ove' de 2015.", R.drawable.im_movie_3));

        listaPeliculas.add(new Peliculas("PEL4", "El piloto", "1h 47m", "Accion, Aventuras, Suspenso",
                "En la noche de fin de año, el piloto experto Brodie Torrance (Gerard Butler) realiza un arriesgado aterrizaje cuando su avión, repleto de pasajeros, es alcanzado por un rayo. Perdidos en medio de una isla devastada por la guerra, Torrance se dará cuenta que sobrevivir al vuelo sólo ha sido el principio de una terrible aventura llena de peligros. El piloto deberá usar todo su ingenio para intentar llevar a los pasajeros a sus destinos sanos y salvos.", R.drawable.im_movie_4));

        listaPeliculas.add(new Peliculas("PEL5", "M3GAN", "1h 42m", "Terror, Ciencia Ficción",
                "La amistad ha evolucionado.\n" +
                        "\n" +
                        "Un ingeniero en robótica de una empresa de juguetes construye una muñeca realista que comienza a cobrar vida propia.", R.drawable.im_movie_5));

        listaPeliculas.add(new Peliculas("PEL6", "Missing", "1h 51m", "Drama, Misterio y suspenso",
                "Tras la desaparición de su madre, una joven intenta encontrarla desde su casa utilizando las herramientas que tiene a su disposición en Internet.", R.drawable.im_movie_6));

        listaPeliculas.add(new Peliculas("PEL7", "Creed III", "1h 51m", "Drama, Boxeo",
                "Cuando Damian (Jonathan Majors), un amigo de la infancia y antiguo prodigio del boxeo, reaparece después de cumplir una larga condena en prisión, Adonis Creed quiere demostrar que merece una oportunidad en el ring. El enfrentamiento entre estos antiguos amigos es algo más que una simple pelea.", R.drawable.im_movie_7));

        listaPeliculas.add(new Peliculas("PEL8", "Ant-Man y la Avispa: Quantumanía", "2h 4m", "Accion, Aventuras, Ciencia Ficción",
                "La pareja de superhéroes Scott Lang y Hope van Dyne regresa para continuar sus aventuras como Ant-Man y la Avispa. Los dos, junto a los padres de Hope, Hank Pym y Janet van Dyne y la hija de Scott, Cassie Lang, se dedican a explorar el Mundo Cuántico, interactuando con nuevas y extrañas criaturas y embarcándose en una aventura que les llevará más allá de los límites de lo que creían posible.", R.drawable.im_movie_8));

        return listaPeliculas;
    }
}
