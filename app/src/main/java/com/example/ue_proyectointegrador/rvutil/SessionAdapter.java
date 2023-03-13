package com.example.ue_proyectointegrador.rvutil;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ue_proyectointegrador.R;
import com.example.ue_proyectointegrador.model.Movie;

import java.util.ArrayList;

public class SessionAdapter extends RecyclerView.Adapter<SessionAdapter.SessionVH> implements View.OnClickListener {

    private View.OnClickListener listener;
    private ArrayList<Movie> movies; //double check

    @Override
    public void onClick(View v) {
        if (listener != null)
            listener.onClick(v);
    }

    public SessionAdapter(ArrayList<Movie> movies, View.OnClickListener listener) {
        this.movies = movies;
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
        holder.bindData(movies.get(position));
    }

    @Override
    public int getItemCount() {
        return movies.size();
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

        public void bindData(Movie session) {
            //TODO: Implementar el bind de los datos de la sesión
            //NOTE: Testing purposes!!!
            tvCinemma.setText("Cine Callao");
            tvHour.setText(session.getTime());
            //tvPrice.setText(session.getPrice());
        }
    }
}
