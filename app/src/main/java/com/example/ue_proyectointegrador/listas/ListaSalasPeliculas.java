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


        //Listado de salas y peliculas hasta la SALA50
        //idSala, idPelicula, titulo

//Listado de salas y peliculas hasta la SALA50
        listaSalasPeliculas.add(new Entradas("SALA01", "PELI1", "Oso vicioso" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA01", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA01", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA01", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA01", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA01", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA01", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA01", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));

        listaSalasPeliculas.add(new Entradas("SALA02", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA02", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA02", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA02", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA02", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA02", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA02", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA03", "PELI1", "Oso vicioso" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA03", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA03", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA03", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA03", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA03", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA03", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA03", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));

        listaSalasPeliculas.add(new Entradas("SALA04", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA04", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA04", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA04", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA04", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA04", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA04", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA05", "PELI1", "Oso vicioso" , 7.5 ));

        listaSalasPeliculas.add(new Entradas("SALA05", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA05", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA05", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA05", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA05", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA05", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA05", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA06", "PELI1", "Oso vicioso" , 7.5 ));

        listaSalasPeliculas.add(new Entradas("SALA06", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA06", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA06", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA06", "PELI5", "M3GAN" , 7.5 ));

        listaSalasPeliculas.add(new Entradas("SALA07", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA07", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA07", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA07", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA07", "PELI6", "Missing" , 7.5 ));

        listaSalasPeliculas.add(new Entradas("SALA08", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA08", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA08", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA08", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA08", "PELI7", "Creed III" , 7.5 ));

        listaSalasPeliculas.add(new Entradas("SALA09", "PELI1", "Oso vicioso" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA09", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA09", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA09", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA09", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA09", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA09", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA09", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));

        listaSalasPeliculas.add(new Entradas("SALA10", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA10", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA10", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA11", "PELI1", "Oso vicioso" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA11", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA11", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA11", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA11", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA11", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA11", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA11", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA12", "PELI1", "Oso vicioso" , 7.5 ));

        listaSalasPeliculas.add(new Entradas("SALA12", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA12", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA12", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA12", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA12", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA12", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA12", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA13", "PELI1", "Oso vicioso" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA13", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA13", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA13", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA13", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA13", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA14", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA14", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA14", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA14", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA14", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));

        listaSalasPeliculas.add(new Entradas("SALA15", "PELI1", "Oso vicioso" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA15", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA15", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA15", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA15", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA15", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA15", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA15", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));


        listaSalasPeliculas.add(new Entradas("SALA16", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA16", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA16", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA17", "PELI1", "Oso vicioso" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA17", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA17", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA17", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA17", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA17", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA18", "PELI1", "Oso vicioso" , 7.5 ));

        listaSalasPeliculas.add(new Entradas("SALA18", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA18", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA18", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA18", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA18", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA18", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA18", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));

        listaSalasPeliculas.add(new Entradas("SALA19", "PELI1", "Oso vicioso" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA19", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA19", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA19", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA19", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA19", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA19", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA19", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));

        listaSalasPeliculas.add(new Entradas("SALA20", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA20", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA20", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA20", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA20", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA21", "PELI1", "Oso vicioso" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA21", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA21", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA21", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA21", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA21", "PELI6", "Missing" , 7.5 ));

        listaSalasPeliculas.add(new Entradas("SALA22", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA22", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA22", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA22", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA22", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA22", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA23", "PELI1", "Oso vicioso" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA23", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA23", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA23", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA23", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA23", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA23", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA23", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));

        listaSalasPeliculas.add(new Entradas("SALA24", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA24", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA24", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA24", "PELI6", "Missing" , 7.5 ));

        listaSalasPeliculas.add(new Entradas("SALA25", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA25", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA25", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA25", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));

        listaSalasPeliculas.add(new Entradas("SALA26", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA26", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA26", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA26", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA27", "PELI1", "Oso vicioso" , 7.5 ));

        listaSalasPeliculas.add(new Entradas("SALA27", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA27", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA27", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA28", "PELI1", "Oso vicioso" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA28", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA28", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));

        listaSalasPeliculas.add(new Entradas("SALA29", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA29", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA29", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA29", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA29", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA30", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA30", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA30", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA30", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA30", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA30", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA30", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA31", "PELI1", "Oso vicioso" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA31", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA31", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA31", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA31", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA31", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA32", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA32", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA32", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA32", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA32", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA33", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA33", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA33", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA34", "PELI1", "Oso vicioso" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA34", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA34", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA34", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA34", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA34", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA34", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA34", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA35", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA35", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA35", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA36", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA36", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA36", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA36", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA36", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA36", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA37", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA37", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA37", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA37", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA37", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA37", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA38", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA38", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA38", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA39", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA39", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA39", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA39", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA40", "PELI1", "Oso vicioso" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA40", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA40", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA40", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA40", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA40", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA40", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA40", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA41", "PELI1", "Oso vicioso" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA41", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA41", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA41", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA42", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA42", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA42", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA42", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA42", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA43", "PELI1", "Oso vicioso" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA43", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA43", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA43", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA43", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA43", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA44", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA44", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA44", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA44", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA44", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA44", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA44", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA45", "PELI1", "Oso vicioso" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA45", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA45", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA45", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA46", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA46", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA46", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA46", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA46", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA47", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA47", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA47", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA48", "PELI1", "Oso vicioso" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA48", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA48", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA48", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA49", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA49", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA49", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA49", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA50", "PELI2", "Llaman a la puerta" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA50", "PELI3", "El peor vecino del mundo" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA50", "PELI4", "El piloto" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA50", "PELI5", "M3GAN" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA50", "PELI6", "Missing" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA50", "PELI7", "Creed III" , 7.5 ));
        listaSalasPeliculas.add(new Entradas("SALA50", "PELI8", "Ant-Man y la Avispa: Quantumanía" , 7.5 ));



            return listaSalasPeliculas;
    }
}
