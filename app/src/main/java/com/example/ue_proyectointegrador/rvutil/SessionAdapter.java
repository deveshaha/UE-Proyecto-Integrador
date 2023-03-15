package com.example.ue_proyectointegrador.rvutil;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ue_proyectointegrador.R;
import com.example.ue_proyectointegrador.entity.CinesSalas;
import com.example.ue_proyectointegrador.entity.Entradas;

import java.util.List;

public class SessionAdapter extends RecyclerView.Adapter<SessionAdapter.SessionVH> implements View.OnClickListener {

    private View.OnClickListener listener;
    private List<CinesSalas> sessions;

    public SessionAdapter(List<CinesSalas> sessions, View.OnClickListener listener) {
        this.sessions = sessions;
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {
        if (listener != null)
            listener.onClick(v);
    }

    @NonNull
    @Override
    public SessionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_session, parent, false);
        view.setOnClickListener(this);
        return new SessionVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SessionVH holder, int position) {
        CinesSalas session = sessions.get(position);
        holder.bindData(session);
    }

    @Override
    public int getItemCount() {
        return sessions.size();
    }


    public static class SessionVH extends RecyclerView.ViewHolder {

        private TextView tvCinemma;
        private TextView tvHour;
        private TextView tvSala;

        public SessionVH(@NonNull View itemView) {
            super(itemView);
            tvCinemma = itemView.findViewById(R.id.tv_cinema);
            tvSala = itemView.findViewById(R.id.tv_price);
        }

        public void bindData(CinesSalas session) {
            tvCinemma.setText(session.getNombreCine());
            tvSala.setText(session.getIdSala());
        }
    }
}
