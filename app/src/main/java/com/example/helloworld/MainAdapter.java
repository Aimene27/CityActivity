package com.example.helloworld;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class MainAdapter extends FirebaseRecyclerAdapter <MainModel,MainAdapter.myViewHolder>{

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public MainAdapter(@NonNull FirebaseRecyclerOptions<MainModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull MainModel model) {

        holder.nom.setText(model.getNom());
        holder.desc.setText(model.getDesc());
        holder.prix.setText(model.getPrix());
        holder.adresse.setText(model.getAdresse());

        Glide.with(holder.img.getContext())
                .load(model.getImage())
                .placeholder((R.drawable.common_google_signin_btn_icon_dark))
                .error(R.drawable.common_google_signin_btn_icon_dark_normal)
                .into(holder.img);

    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item,parent,false);

        return new myViewHolder(view);
    }

    class myViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView nom, desc, prix, adresse;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            img = (ImageView)  itemView.findViewById(R.id.img1);
            nom = (TextView) itemView.findViewById(R.id.nomactivity);
            desc = (TextView) itemView.findViewById(R.id.descactivity);
            prix = (TextView) itemView.findViewById(R.id.prixactivity);
            adresse = (TextView) itemView.findViewById(R.id.adresseactivity);
        }
    }
}