package com.example.ue_proyectointegrador.fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ue_proyectointegrador.DB.CinesDB;
import com.example.ue_proyectointegrador.R;
import com.example.ue_proyectointegrador.dao.PeliculasDao;
import com.example.ue_proyectointegrador.entity.Cines;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

public class MapsFragment extends Fragment {

    GoogleMap map;
    PeliculasDao peliculasDao;

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        @Override
        public void onMapReady(GoogleMap googleMap) {
            map = googleMap;
            map.getUiSettings().setZoomControlsEnabled(true);
            map.getUiSettings().setZoomGesturesEnabled(true);
            map.getUiSettings().setCompassEnabled(true);
            map.getUiSettings().setMyLocationButtonEnabled(true);

            LatLng madrid = new LatLng(40.416775, -3.703790);
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(madrid, 10));

            map.clear();

            List<Cines> cinesList = peliculasDao.getAllCines();

            //print cinemas DEBUG
            for (int i = 0; i < cinesList.size(); i++) {
                System.out.println(cinesList.get(i).getNombre() + " " + cinesList.get(i).getLongitud() + " " + cinesList.get(i).getLatitud());
            }

            //add markersq
            for (int i = 0; i < cinesList.size(); i++) {
                LatLng latLng = new LatLng(cinesList.get(i).getLongitud(), cinesList.get(i).getLatitud());
                map.addMarker(new MarkerOptions().position(latLng).title(cinesList.get(i).getNombre()));
                System.out.println("Marker " + cinesList.get(i).getNombre() + " added");
            }
        }
    };
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }

        peliculasDao = CinesDB.getDatabase(getContext()).peliculasDao();
    }
}