package com.example.ue_proyectointegrador.listas;

import com.example.ue_proyectointegrador.entity.Butacas;


import java.util.ArrayList;

public class ListaButacas {


    private static ArrayList<Butacas> listaButacas = null;

    public static ArrayList<Butacas> getListaButacas() {
        if (listaButacas != null) {
            return listaButacas;
        }
        listaButacas = new ArrayList<>();

        String numSala, numButacas;

        for(int i = 1; i <= 50; i++) {
            numSala = "SALA" + String.format("%02d", i);
            for(int j = 1; j <= 30; j++) {
                numButacas = String.format("%03d", (i-1)*30+j);
                listaButacas.add(new Butacas(numButacas, numSala));
            }
        }

        return listaButacas;
    }
}
