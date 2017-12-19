package com.example.jorgeyya.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by JorgeYYA on 28/11/2017.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.ElementHolder> {

    private ArrayList<Element> listaCosas;

    //Constructor de la clase adaptador

    public Adaptador(ArrayList<Element> listaCosas){

        this.listaCosas = listaCosas;

    }

    @Override
    public ElementHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.element,parent,false);

        return new ElementHolder(v);
    }

    @Override
    public void onBindViewHolder(ElementHolder holder, int position) {

        holder.nombre.setText(listaCosas.get(position).getNom());
        holder.puntuacion.setRating(listaCosas.get(position).getPuntuacion());
        holder.direccion.setText(listaCosas.get(position).getDireccion());
        holder.precio.setText(listaCosas.get(position).getPreu()+"€");
        holder.imagen.setImageResource(listaCosas.get(position).getImagen());

    }

    @Override
    public int getItemCount() { return listaCosas.size(); }

    public static class ElementHolder extends RecyclerView.ViewHolder{

        TextView nombre, direccion, precio;
        RatingBar puntuacion;
        ImageView imagen;

        public ElementHolder(View itemView){

            super(itemView);

            nombre = (TextView) itemView.findViewById(R.id.nombre);
            direccion = (TextView) itemView.findViewById(R.id.direccion);
            precio = (TextView) itemView.findViewById(R.id.precio);
            puntuacion = (RatingBar) itemView.findViewById(R.id.puntuacion);
            imagen = (ImageView) itemView.findViewById(R.id.imagen);





        }


    }
}
