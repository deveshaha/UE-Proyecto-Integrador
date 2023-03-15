package com.example.ue_proyectointegrador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ue_proyectointegrador.DB.CinesDB;
import com.example.ue_proyectointegrador.dao.PeliculasDao;
import com.example.ue_proyectointegrador.dialog.DialogFilter;
import com.example.ue_proyectointegrador.entity.Cines;
import com.example.ue_proyectointegrador.entity.SalasPeliculas;
import com.example.ue_proyectointegrador.fragments.MovieFragment;

import com.example.ue_proyectointegrador.rvutil.SessionAdapter;



public class SessionActivity extends AppCompatActivity implements DialogFilter.OnDatosListener, View.OnClickListener {

    RecyclerView rvSessions;
    RecyclerView.LayoutManager llm;
    SessionAdapter adapter;
    Button btnFilter;
    TextView tv_session_name;
    String cine;
    String movie;
    String idCine;
    CinesDB db;
    PeliculasDao peliculasDao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesssion);
        rvSessions = findViewById(R.id.rvSessions);
        btnFilter = findViewById(R.id.btn_filter);
        tv_session_name = findViewById(R.id.tv_session_name);

        idCine = getIntent().getStringExtra(MovieFragment.TAG_FILTER);
        System.out.println("ID CINE RECIBIDO SESSION ACTIVITY: " + idCine);
        movie = getIntent().getStringExtra("movie");
        System.out.println("MOVIE RECIBIDO SESSION ACTIVITY: " + movie);

        tv_session_name.setText(movie);

        btnFilter.setOnClickListener(this);

        db = CinesDB.getDatabase(this);
        peliculasDao = db.peliculasDao();

        //TODO: obtener la lista de salasPeliculas

    }

    private void configRV() {
        //TODO: configurar el recycler view
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_filter){
            Toast.makeText(this, "Filtrar", Toast.LENGTH_SHORT).show();
            showFilterDialog();
        } else if (v.getId() == R.id.rvSessions){
            Toast.makeText(this, "Reservar Entradas", Toast.LENGTH_SHORT).show();
        }
    }

    private void showFilterDialog() {
        DialogFilter filterDialog = new DialogFilter();
        filterDialog.show(getSupportFragmentManager(), "filter dialog");
        filterDialog.setCancelable(false);
    }

    @Override
    public void onAceptarDatosListener(String datos) {
        cine = datos;
        Toast.makeText(this, "Cine: " + cine, Toast.LENGTH_SHORT).show();
        adapter.filter(cine);
    }
}