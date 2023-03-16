package com.example.ue_proyectointegrador;

import android.os.Bundle;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.ue_proyectointegrador.DB.CinesDB;
import com.example.ue_proyectointegrador.dao.PeliculasDao;
import com.example.ue_proyectointegrador.entity.Butacas;
import com.example.ue_proyectointegrador.entity.Cines;
import com.example.ue_proyectointegrador.entity.CinesSalas;
import com.example.ue_proyectointegrador.entity.Entradas;
import com.example.ue_proyectointegrador.entity.Peliculas;
import com.example.ue_proyectointegrador.entity.Salas;
import com.example.ue_proyectointegrador.entity.Usuario;
import com.example.ue_proyectointegrador.fragments.LoginFragment;
import com.example.ue_proyectointegrador.fragments.MapsFragment;
import com.example.ue_proyectointegrador.fragments.MovieFragment;
import com.example.ue_proyectointegrador.listas.ListaButacas;
import com.example.ue_proyectointegrador.listas.ListaCines;
import com.example.ue_proyectointegrador.listas.ListaCinesSalas;
import com.example.ue_proyectointegrador.listas.ListaPeliculas;
import com.example.ue_proyectointegrador.listas.ListaSalas;
import com.example.ue_proyectointegrador.listas.ListaSalasPeliculas;
import com.example.ue_proyectointegrador.listas.ListaUsuarios;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton imageBttLogo;
    ImageButton imageBttLocation;
    TextView txtLocation;
    Button btnProfile;
    EditText edtSearch;
    ImageButton imageBttSearch;

    PeliculasDao peliculasDao;

    /*
        Google Maps API Key:
        Copy this line to your local.properties file:
        MAPS_API_KEY=AIzaSyDS4ilJ4aKdvofOdTKrtiYmB7ASc3DqKkc
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadDB();
        reference();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fgContainer, new MovieFragment());
        ft.addToBackStack(null);
        ft.commit();


    }

    private void loadDB() {
        CinesDB db = CinesDB.getDatabase(this);
        peliculasDao = db.peliculasDao();
        ArrayList<Cines> listaCines = (ArrayList<Cines>) peliculasDao.getAllCines();
        ArrayList<Salas> listaSalas = (ArrayList<Salas>) peliculasDao.getAllSalas();
        ArrayList<CinesSalas> listaCinesSalas = (ArrayList<CinesSalas>) peliculasDao.getAllCinesSalas();
        ArrayList<Peliculas> listaPeliculas = (ArrayList<Peliculas>) peliculasDao.getAllPeliculas();
        ArrayList<Entradas> listaSalasPeliculas = (ArrayList<Entradas>) peliculasDao.getAllPeliculasSalas();
        ArrayList<Butacas> listaButacas = (ArrayList<Butacas>) peliculasDao.getAllButacas();
        ArrayList<Usuario> listaUsuarios = (ArrayList<Usuario>) peliculasDao.getAllUsuarios();

        if (listaCines.size() == 0){
            System.out.println("*** CARGANDO CINES ***");
            peliculasDao.insertAllCines(ListaCines.getListaCines());
        }

        if (listaSalas.size() == 0){
            System.out.println("*** CARGANDO SALAS ***");
            peliculasDao.insertAllSalas(ListaSalas.getListaSalas());
        }

        if (listaCinesSalas.size() == 0){
            System.out.println("*** CARGANDO CINES_SALAS ***");
            peliculasDao.insertAllCinesSalas(ListaCinesSalas.getListaCinesSalas());
        }

        if (listaPeliculas.size() == 0){
            System.out.println("*** CARGANDO PELICULAS ***");
            peliculasDao.insertAllPeliculas(ListaPeliculas.getListaPeliculas());
        }

        if (listaSalasPeliculas.size() == 0){
            System.out.println("*** CARGANDO SALAS_PELICULAS ***");
            peliculasDao.insertAllSalasPeliculas(ListaSalasPeliculas.getListaSalasPeliculas());
        }

        if (listaButacas.size() == 0){
            System.out.println("*** CARGANDO BUTACAS ***");
            peliculasDao.insertAllButacas(ListaButacas.getListaButacas());
        }
        if (listaUsuarios.size() == 0){
            System.out.println("*** CARGANDO USUARIOS ***");
            peliculasDao.insertAllUsuarios(ListaUsuarios.getListaUsuarios());
        }

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
        btnProfile = findViewById(R.id.btnLogin);
        edtSearch = findViewById(R.id.edtSearch);
        imageBttSearch = findViewById(R.id.imageBttSearch);
        imageBttLogo.setOnClickListener(this);
        imageBttLocation.setOnClickListener(this);
        btnProfile.setOnClickListener(this);
        imageBttSearch.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageBttLogo:
                fragmentManager(new MovieFragment());
                break;
            case R.id.imageBttLocation:
                MapsFragment mapsFragment = new MapsFragment();
                Slide mapsSlide = new Slide(Gravity.BOTTOM);
                mapsSlide.setDuration(500);
                mapsFragment.setEnterTransition(mapsSlide);
                fragmentManager(mapsFragment);
                break;
            case R.id.btnLogin:
                LoginFragment lg = new LoginFragment().newInstance();
                Slide slide = new Slide(Gravity.BOTTOM);
                slide.setDuration(500);
                lg.setEnterTransition(slide);
                fragmentManager(lg);
                btnProfile.setText(R.string.txtBtnLogin);
                break;
            case R.id.imageBttSearch:
                String search = edtSearch.getText().toString();
                if (search.isEmpty()){
                    Toast.makeText(this, "No se ha introducido ninguna búsqueda", Toast.LENGTH_SHORT).show();
                } else{
                    MovieFragment movieFragment = new MovieFragment().newInstance(search);
                    System.out.println("Buscando: " + search);
                    slide = new Slide(Gravity.BOTTOM);
                    slide.setDuration(500);
                    movieFragment.setEnterTransition(slide);
                    fragmentManager(movieFragment);
                }
                break;
        }
    }
}