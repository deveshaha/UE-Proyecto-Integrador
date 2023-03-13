package com.example.ue_proyectointegrador;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
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

import com.example.ue_proyectointegrador.fragments.MovieFragment;
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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reference();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fgContainer, new MovieFragment());
        ft.addToBackStack(null);
        ft.commit();

    }
    private void fragmentManager(Fragment fragment){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fgContainer, fragment)
                .addToBackStack(null)
                .commit();
    }



    private void reference() {
        imageBttLogo = findViewById(R.id.imageBttLogo);
        imageBttLocation = findViewById(R.id.imageBttLocation);
        txtLocation = findViewById(R.id.tvLocation);
        btnProfile = findViewById(R.id.btnProfile);
        edtSearch = findViewById(R.id.edtSearch);
        imageBttSearch = findViewById(R.id.imageBttSearch);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageBttLogo:
                Toast.makeText(this, "Logo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageBttLocation:
               //TODO: Invocar a el metodo fragmentManager y pasarle el fragmento del mapa
                break;
            case R.id.btnProfile:
                Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageBttSearch:
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}