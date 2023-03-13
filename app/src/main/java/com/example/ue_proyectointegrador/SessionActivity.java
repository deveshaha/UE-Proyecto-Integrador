package com.example.ue_proyectointegrador;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ue_proyectointegrador.R;
import com.example.ue_proyectointegrador.dialog.DialogFilter;
import com.example.ue_proyectointegrador.model.DataSource;
import com.example.ue_proyectointegrador.rvutil.SessionAdapter;

public class SessionActivity extends AppCompatActivity implements DialogFilter.OnDatosListener, View.OnClickListener {

    RecyclerView rvSessions;
    RecyclerView.LayoutManager llm;
    DataSource dataSource = new DataSource();
    SessionAdapter adapter;
    Button btnFilter;
    String cine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesssion);
        rvSessions = findViewById(R.id.rvSessions);
        btnFilter = findViewById(R.id.btn_filter);
        btnFilter.setOnClickListener(this);
        configRv();
    }

    private void configRv() {
        llm = new LinearLayoutManager(this);
        rvSessions.setLayoutManager(llm);
        adapter = new SessionAdapter(dataSource.getListMovies(),this);
        rvSessions.setAdapter(adapter);
        rvSessions.setHasFixedSize(true);
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