package com.example.ue_proyectointegrador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ue_proyectointegrador.fragments.MovieFragment;

public class MovieActivity extends AppCompatActivity {

    Button btnSelect;
    TextView txtMovieName;
    TextView txtMovieDescription;
    TextView txtMovieDuration;
    TextView txtMovieDirector;
    TextView txtIbdmRating;
    TextView txtUserRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        //TODO: ID movie para implementar
        String idMovie = getIntent().getStringExtra(MovieFragment.TAG_MOVIE);
        btnSelect = findViewById(R.id.btn_select);
        txtMovieName = findViewById(R.id.tv_movie_name);

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MovieActivity.this, SessionActivity.class);
                startActivity(intent);
            }
        });
    }
}