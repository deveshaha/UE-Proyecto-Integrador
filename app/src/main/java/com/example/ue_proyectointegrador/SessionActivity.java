package com.example.ue_proyectointegrador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ue_proyectointegrador.DB.CinesDB;
import com.example.ue_proyectointegrador.dao.PeliculasDao;
import com.example.ue_proyectointegrador.dialog.DialogFilter;
import com.example.ue_proyectointegrador.entity.Cines;
import com.example.ue_proyectointegrador.entity.CinesSalas;
import com.example.ue_proyectointegrador.entity.Entradas;
import com.example.ue_proyectointegrador.entity.SalasPeliculas;
import com.example.ue_proyectointegrador.fragments.MovieFragment;
import com.example.ue_proyectointegrador.rvutil.SessionAdapter;

import java.util.ArrayList;
import java.util.List;

public class SessionActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView rvSessions;
    RecyclerView.LayoutManager llm;
    SessionAdapter adapter;
    TextView tv_session_name;
    String cine;
    String movie;
    String idCine;
    CinesDB db;
    PeliculasDao peliculasDao;
    List<CinesSalas> sessions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesssion);
        rvSessions = findViewById(R.id.rvSessions);
        tv_session_name = findViewById(R.id.tv_session_name);

        idCine = getIntent().getStringExtra(MovieFragment.TAG_FILTER);
        System.out.println("ID CINE RECIBIDO SESSION ACTIVITY: " + idCine);
        movie = getIntent().getStringExtra("movie");
        System.out.println("MOVIE RECIBIDO SESSION ACTIVITY: " + movie);

        tv_session_name.setText(movie);

        db = CinesDB.getDatabase(this);
        peliculasDao = db.peliculasDao();
        sessions = peliculasDao.getCinesSalasByPelicula3(movie);

        /*
        //DEBUG
        System.out.println("TAMAÑO LISTA SESSIONS: " + sessions.size());

        for (int i = 0; i < sessions.size(); i++) {
            System.out.println("CINE: " + sessions.get(i).getNombreCine());
            System.out.println("SALA: " + sessions.get(i).getIdSala());
            System.out.println("ID CINE: " + sessions.get(i).getIdCine());
        }
        */
        llm = new LinearLayoutManager(this);
        rvSessions.setLayoutManager(llm);
        adapter = new SessionAdapter(sessions, this);
        rvSessions.setAdapter(adapter);

    }

    @Override
    public void onClick(View v) {
        int position = rvSessions.getChildAdapterPosition(v);
        CinesSalas session = sessions.get(position);
        Toast.makeText(this, "Cine: " + session.getNombreCine() + " Sala: " + session.getIdSala(), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, SeatActivity.class);
        intent.putExtra("cine", session.getNombreCine());
        intent.putExtra("sala", session.getIdSala());

        startActivity(intent);
    }

}