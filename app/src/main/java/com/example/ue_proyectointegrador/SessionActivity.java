package com.example.ue_proyectointegrador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ue_proyectointegrador.dialog.DialogFilter;
import com.example.ue_proyectointegrador.fragments.MovieFragment;
import com.example.ue_proyectointegrador.model.DataSource;
import com.example.ue_proyectointegrador.rvutil.SessionAdapter;

public class SessionActivity extends AppCompatActivity implements DialogFilter.OnDatosListener, View.OnClickListener {

    RecyclerView rvSessions;
    RecyclerView.LayoutManager llm;
    DataSource dataSource = new DataSource();
    SessionAdapter adapter;
    Button btnFilter;
    String cine;
    String idCine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesssion);
        rvSessions = findViewById(R.id.rvSessions);
        btnFilter = findViewById(R.id.btn_filter);
        idCine = getIntent().getStringExtra(MovieFragment.TAG_FILTER);
        System.out.println("ID CINE RECIBIDO SESSION ACTIVITY: " + idCine);
        btnFilter.setOnClickListener(this);
        configRv(idCine);
    }

    private void configRv(String idCine) {
        //we need to get the cinema sessions from the database, then we need to pass them to the adapter
        //and then we need to set the adapter to the recycler view

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