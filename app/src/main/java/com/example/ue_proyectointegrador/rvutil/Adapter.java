package com.example.ue_proyectointegrador.rvutil;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ue_proyectointegrador.R;
import com.example.ue_proyectointegrador.entity.Peliculas;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MovieVH> implements View.OnClickListener {

    private ArrayList<Peliculas> peliculas;
    private View.OnClickListener listener;

    public Adapter(ArrayList<Peliculas> peliculas, View.OnClickListener listener) {
        this.peliculas = peliculas;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MovieVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_movie, parent, false);
        view.setOnClickListener(this);
        return new MovieVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieVH holder, int position) {
        holder.bindData(peliculas.get(position));
    }

    @Override
    public int getItemCount() {
        return peliculas.size();
    }
    @Override
    public void onClick(View v) {
        if (listener != null)
            listener.onClick(v);
    }

    public static class MovieVH extends RecyclerView.ViewHolder {
        private ImageView imgMovie;
        private TextView titleMovie;
        private TextView genreMovie;
        private TextView ratingMovie;

        public MovieVH(@NonNull View itemView) {
            super(itemView);

            imgMovie = itemView.findViewById(R.id.imgMovie);
            titleMovie = itemView.findViewById(R.id.tvTitle);
            genreMovie = itemView.findViewById(R.id.tvGenre);
            ratingMovie = itemView.findViewById(R.id.tvRating);


        }
        public void bindData(Peliculas peliculas){
            imgMovie.setImageResource(peliculas.getImagen());
            titleMovie.setText(peliculas.getTitulo());
            genreMovie.setText(peliculas.getGenero());


        }

    }
}
