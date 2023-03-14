package com.example.ue_proyectointegrador.listas;

import com.example.ue_proyectointegrador.entity.Cines;

import java.util.ArrayList;

public class ListaCines {

    private static ArrayList<Cines> listaCines = null;

    public static ArrayList<Cines> getListaCines() {
        if (listaCines != null) {
            return listaCines;
        }
        listaCines = new ArrayList<>();

        listaCines.add(new Cines("CINE001", "Cine Yelmo Ideal", "40.413653, -3.703872"));
        listaCines.add(new Cines("CINE002", "Cinesa Proyecciones", "40.4333131, -3.7041275."));
        listaCines.add(new Cines("CINE003", "Cine Capitol", "40.420391666667, -3.7066888888889"));
        listaCines.add(new Cines("CINE004", "Cine Renoir Princesa", "40.4249437, -3.7132192"));
        listaCines.add(new Cines("CINE005", "Cine Golem", "40.4256682, -3.7147338"));
        listaCines.add(new Cines("CINE006", "Cinesa Manoteras", "40.2910, -3.3957"));
        listaCines.add(new Cines("CINE007", "Cine Paz", "40.4333131, -3.7041275"));
        listaCines.add(new Cines("CINE008", "Cine Princesa", "40.4249437, -3.7132192"));
        listaCines.add(new Cines("CINE009", "Cine Yelmo Islazul", "40.3646206, -3.737685"));
        listaCines.add(new Cines("CINE010", "Cines Dreams Palacio de Hielo", "40.4630989, -3.63679933866482"));

        return listaCines;
    }
}
