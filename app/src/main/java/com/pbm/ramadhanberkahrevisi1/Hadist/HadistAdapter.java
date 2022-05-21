package com.pbm.ramadhanberkahrevisi1.Hadist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pbm.ramadhanberkahrevisi1.R;

import java.util.ArrayList;

public class HadistAdapter extends RecyclerView.Adapter<HadistAdapter.HadistViewHolder>{
    private  ArrayList<Hadist> listHadist;
    private RecyclerViewClickListener listener;

    public HadistAdapter(ArrayList<Hadist> listHadist, RecyclerViewClickListener listener) {
        this.listHadist = listHadist;
        this.listener = listener;
    }

    @NonNull
    @Override
    public HadistAdapter.HadistViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_hadist, parent, false);
        return new HadistViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull HadistAdapter.HadistViewHolder holder, int position) {
        holder.tvJudul.setText(listHadist.get(position).getJudul());
        holder.tvParagraf.setText(listHadist.get(position).getParagraf());
    }

    @Override
    public int getItemCount() {
        return (listHadist!= null) ? listHadist.size() : 0;
    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }


    public class HadistViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView tvJudul, tvParagraf;


        public HadistViewHolder (final View view) {
            super(view);
            tvJudul = view.findViewById(R.id.tv_judul);
            tvParagraf = view.findViewById(R.id.tv_paragraf);
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());
        }
    }
}





