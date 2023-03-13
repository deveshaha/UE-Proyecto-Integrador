package com.example.ue_proyectointegrador;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.ue_proyectointegrador.fragments.LoginFragment;
import com.example.ue_proyectointegrador.fragments.MovieFragment;

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
                Toast.makeText(this, "Ubicación", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnProfile:
                LoginFragment lg = new LoginFragment().newInstance();
                Slide slide = new Slide(Gravity.BOTTOM);
                slide.setDuration(500);
                lg.setEnterTransition(slide);
                fragmentManager(lg);
                break;
            case R.id.imageBttSearch:
                Toast.makeText(this, "Buscar", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}