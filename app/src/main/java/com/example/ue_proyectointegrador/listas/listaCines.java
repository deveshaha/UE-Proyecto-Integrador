package com.example.ue_proyectointegrador.listas;

import com.example.ue_proyectointegrador.entity.Cines;

import java.util.ArrayList;

public class listaCines {

    private static ArrayList<Cines> listaCines = null;

    public static ArrayList<Cines> getListaCines() {
        if (listaCines != null) {
            return listaCines;
        }
        listaCines = new ArrayList<>();

        listaCines.add(new Cines("CINE001", "Cine Yelmo Ideal", "Calle Doctor Cortezo, 6, 28012 Madrid"));
        listaCines.add(new Cines("CINE002", "Cinesa Proyecciones", "Calle de Fuencarral, 136, 28010 Madrid"));
        listaCines.add(new Cines("CINE003", "Cine Capitol", "Calle de Gran Vía, 41, 28013 Madrid"));
        listaCines.add(new Cines("CINE004", "Cine Renoir Princesa", "Calle de la Princesa, 3, 28008 Madrid"));
        listaCines.add(new Cines("CINE005", "Cine Golem", "Calle de Martín de los Heros, 14, 28008 Madrid"));
        listaCines.add(new Cines("CINE006", "Cinesa Manoteras", "Calle de Agastia, 66, 28043 Madrid"));
        listaCines.add(new Cines("CINE007", "Cine Paz", "Calle de Fuencarral, 125, 28010 Madrid"));
        listaCines.add(new Cines("CINE008", "Cine Princesa", "Calle de la Princesa, 3, 28008 Madrid"));
        listaCines.add(new Cines("CINE009", "Cine Yelmo Islazul", "Calle de Calderilla, 1, 28054 Madrid"));
        listaCines.add(new Cines("CINE010", "Cines Dreams Palacio de Hielo", "Calle de Silvano, 77, 28043 Madrid"));

        return listaCines;
    }
}
