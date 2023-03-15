package com.example.ue_proyectointegrador.rvutil;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ue_proyectointegrador.R;
import com.example.ue_proyectointegrador.entity.SalasPeliculas;

import java.util.ArrayList;
import java.util.List;

public class SessionAdapter extends RecyclerView.Adapter<SessionAdapter.SessionVH> implements View.OnClickListener {

    private View.OnClickListener listener;
    private ArrayList<SalasPeliculas> peliculas; //double check

    @Override
    public void onClick(View v) {
        if (listener != null)
            listener.onClick(v);
    }

    public SessionAdapter(List<String> cines, View.OnClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public SessionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_session, parent, false);
        view.setOnClickListener(this);
        return new SessionVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SessionVH holder, int position) {
        holder.bindData(peliculas.get(position));
    }

    @Override
    public int getItemCount() {
        return peliculas.size();
    }

    public void filter(String cine) {
        //TODO: Implementar el filtrado de las sesiones
    }

    public static class SessionVH extends RecyclerView.ViewHolder {

        private TextView tvCinemma;
        private TextView tvHour;
        private TextView tvPrice;

        public SessionVH(@NonNull View itemView) {
            super(itemView);
            tvCinemma = itemView.findViewById(R.id.tv_cinema);
            tvHour = itemView.findViewById(R.id.tv_time);
            tvPrice = itemView.findViewById(R.id.tv_price);
        }

        public void bindData(SalasPeliculas session) {
            //TODO: Implementar el bind de los datos de la sesión
            //NOTE: Testing purposes!!!
            tvCinemma.setText("Cine Callao");
            //tvPrice.setText(session.getPrice());
        }
    }
}
