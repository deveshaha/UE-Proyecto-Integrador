package com.example.ue_proyectointegrador.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.ue_proyectointegrador.DB.CinesDB;
import com.example.ue_proyectointegrador.R;
import com.example.ue_proyectointegrador.dao.PeliculasDao;
import com.example.ue_proyectointegrador.entity.Cines;

import java.util.ArrayList;
import java.util.List;

public class DialogFilter extends DialogFragment {

    Spinner spnCinemas;
    OnDatosListener listener;
    CinesDB db;
    PeliculasDao peliculasDao;
    ArrayList<String> listCinemas = new ArrayList<>();
    List<Cines> cinemas;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        View view = getActivity().getLayoutInflater().inflate(R.layout.dialog_filter, null);
        spnCinemas = view.findViewById(R.id.spnCinemas);

        db = CinesDB.getDatabase(getActivity().getApplicationContext());
        peliculasDao = db.peliculasDao();

        cinemas = peliculasDao.getAllCines();
        for (Cines c: cinemas) {
            listCinemas.add(c.getNombre());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, listCinemas);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnCinemas.setAdapter(adapter);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(view);

        builder.setTitle("Filtrar por Cine").setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                listener.onAceptarDatosListener(spnCinemas.getSelectedItem().toString());
            }
        });

        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.setCanceledOnTouchOutside(false);

        AlertDialog dialog = builder.create();
        return dialog;
    }

    public interface OnDatosListener{
        void onAceptarDatosListener(String datos);
    }

    @Override
    public void onAttach(@NonNull Activity Activity) {
        super.onAttach(Activity);
        try {
            listener = (OnDatosListener) Activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(Activity.toString() + " must implement OnDatosListener");
        }
    }

    @Override
    public void onDetach() {
        if (listener != null){
            listener = null;
        }
        super.onDetach();
    }

}
