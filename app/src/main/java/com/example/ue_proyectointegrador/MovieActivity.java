package com.example.ue_proyectointegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ue_proyectointegrador.DB.CinesDB;
import com.example.ue_proyectointegrador.dao.PeliculasDao;
import com.example.ue_proyectointegrador.entity.Peliculas;
import com.example.ue_proyectointegrador.fragments.MovieFragment;

import java.util.ArrayList;

public class MovieActivity extends AppCompatActivity {

    Button btnSelect;
    TextView txtMovieName;
    TextView txtMovieDescription;
    TextView txtMovieDuration;
    TextView txtMovieDirector;
    TextView txtIbdmRating;
    TextView txtUserRating;
    PeliculasDao peliculasDao;
    CinesDB cinesDB;
    ImageView imgMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        txtMovieName = findViewById(R.id.tv_movie_name);
        txtMovieDescription = findViewById(R.id.tv_about);
        txtMovieDuration = findViewById(R.id.tv_runtime);
        txtMovieDirector = findViewById(R.id.tv_director);
        txtIbdmRating = findViewById(R.id.tv_imdb_rating);
        txtUserRating = findViewById(R.id.tv_usr_rating);
        btnSelect = findViewById(R.id.btn_select);
        imgMovie = findViewById(R.id.imgv_about_movie);

        String idMovie = getIntent().getStringExtra(MovieFragment.TAG_FILTER);
        System.out.println("ID MOVIE RECIBIDO: " + idMovie);

        cinesDB = CinesDB.getDatabase(this);
        peliculasDao = cinesDB.peliculasDao();
        Peliculas movie = peliculasDao.getPeliculaById(idMovie);

        txtMovieName.setText(movie.getTitulo());
        txtMovieDescription.setText(movie.getSinopsis());
        txtMovieDuration.setText("Duración: " + movie.getDuracion());
        txtMovieDirector.setText("Director: " + movie.getDirector());
        txtIbdmRating.setText(movie.getRatingUsuario());
        imgMovie.setImageResource(movie.getImagen());
        txtUserRating.setText(movie.getRatingUsuario());


        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MovieActivity.this, SessionActivity.class);
                intent.putExtra(MovieFragment.TAG_FILTER, idMovie);
                intent.putExtra("movie", movie.getTitulo());
                startActivity(intent);
            }
        });
    }
}