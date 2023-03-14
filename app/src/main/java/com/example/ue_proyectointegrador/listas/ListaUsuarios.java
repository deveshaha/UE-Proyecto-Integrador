package com.example.ue_proyectointegrador.listas;

import com.example.ue_proyectointegrador.entity.Usuario;

import java.util.ArrayList;

public class ListaUsuarios {

    private static ArrayList<Usuario> listaUsuarios = null;

    public static ArrayList<Usuario> getListaUsuarios() {
        if (listaUsuarios != null) {
            return listaUsuarios;
        }
        listaUsuarios = new ArrayList<>();

        listaUsuarios.add(new Usuario("daniel@emailfalso.es", "1234", "Daniel", 20.50));
        listaUsuarios.add(new Usuario("kaiscer@emailfalso.es", "1234", "Kaiscer", 20.50));
        listaUsuarios.add(new Usuario("devesh@emailfalso.es", "1234", "Devesh", 20.50));

        return listaUsuarios;
    }
}