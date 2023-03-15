package com.example.ue_proyectointegrador.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ue_proyectointegrador.DB.CinesDB;
import com.example.ue_proyectointegrador.MovieActivity;
import com.example.ue_proyectointegrador.R;
import com.example.ue_proyectointegrador.dao.PeliculasDao;
import com.example.ue_proyectointegrador.entity.Peliculas;
import com.example.ue_proyectointegrador.model.DataSource;
import com.example.ue_proyectointegrador.rvutil.Adapter;

import java.util.ArrayList;


public class MovieFragment extends Fragment implements View.OnClickListener {


    public static final String TAG_MOVIE = "MOVIE";
    public static final String TAG_FILTER = "FILTER";
    RecyclerView rvMovies;
    RecyclerView.LayoutManager llm;
    DataSource dataSource = new DataSource();
    Adapter adapter;
    CinesDB db;
    PeliculasDao peliculasDao;
    ArrayList<Peliculas> movies = new ArrayList<>();





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
        db = CinesDB.getDatabase(getActivity().getApplicationContext());
        peliculasDao = db.peliculasDao();
        movies = (ArrayList<Peliculas>) peliculasDao.getAllPeliculas();
        configRv(movies);
        return view;
    }



    private void configRv(ArrayList<Peliculas> movies) {
        llm = new LinearLayoutManager(getActivity());
        rvMovies.setLayoutManager(llm);
        adapter = new Adapter(movies,this);
        rvMovies.setAdapter(adapter);
        rvMovies.setHasFixedSize(true);
    }

    @Override
    public void onClick(View v) {
        int position = rvMovies.getChildAdapterPosition(v);
        String idMovie = movies.get(position).idPelicula;
        Intent intent = new Intent(getActivity(), MovieActivity.class);
        intent.putExtra(TAG_FILTER, idMovie);
        startActivity(intent);
    }
}