package com.example.ue_proyectointegrador.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ue_proyectointegrador.R;
import com.example.ue_proyectointegrador.model.DataSource;
import com.example.ue_proyectointegrador.model.Movie;
import com.example.ue_proyectointegrador.rvutil.Adapter;

import java.util.ArrayList;


public class MovieFragment extends Fragment implements View.OnClickListener {

    RecyclerView rvMovies;
    RecyclerView.LayoutManager llm;
    DataSource dataSource = new DataSource();
    Adapter adapter;


    public MovieFragment() {

    }


    //TODO: Definir que los filtros que se van a implementar

  /*  public static MovieFragment newInstance(String param1, String param2) {
        MovieFragment fragment = new MovieFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }*/


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie, container, false);
        rvMovies = view.findViewById(R.id.rvMovies);
        configRv();
        return view;
    }



    private void configRv() {
        llm = new LinearLayoutManager(getActivity());
        rvMovies.setLayoutManager(llm);
        adapter = new Adapter(dataSource.getListMovies(),this);
        rvMovies.setAdapter(adapter);
        rvMovies.setHasFixedSize(true);
    }

    @Override
    public void onClick(View v) {
        //TODO: Implementar el onClick de cada item del recycler view
    }
}