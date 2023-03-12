package com.example.ue_proyectointegrador;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ue_proyectointegrador.model.DataSource;
import com.example.ue_proyectointegrador.model.Movie;
import com.example.ue_proyectointegrador.rvutil.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton imageBttLogo;
    ImageButton imageBttLocation;
    TextView txtLocation;
    Button btnProfile;
    EditText edtSearch;
    ImageButton imageBttSearch;
    RecyclerView rvMovies;
    RecyclerView.LayoutManager llm;
    ArrayList<Movie> movies = new ArrayList<>();
    DataSource dataSource = new DataSource();
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reference();
        configRv();
    }

    private void configRv() {
        llm = new LinearLayoutManager(this);
        rvMovies.setLayoutManager(llm);
        adapter = new Adapter(dataSource.getListMovies());
        rvMovies.setAdapter(adapter);
        rvMovies.setHasFixedSize(true);
    }

    private void reference() {
        imageBttLogo = findViewById(R.id.imageBttLogo);
        imageBttLocation = findViewById(R.id.imageBttLocation);
        txtLocation = findViewById(R.id.tvLocation);
        btnProfile = findViewById(R.id.btnProfile);
        edtSearch = findViewById(R.id.edtSearch);
        imageBttSearch = findViewById(R.id.imageBttSearch);
        rvMovies = findViewById(R.id.rvMovies);
    }

    @Override
    public void onClick(View v) {

    }
}