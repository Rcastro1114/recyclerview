package com.example.recyclerviewejemplo.adapters;

import static com.example.recyclerviewejemplo.MostrarListaTB.lstTrabajador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewejemplo.R;
import com.example.recyclerviewejemplo.models.Persona;
import com.example.recyclerviewejemplo.models.Trabajador;
import com.example.recyclerviewejemplo.viewHolders.ViewHolderPersona;

import java.util.ArrayList;
public class PersonaAdapter extends RecyclerView.Adapter<ViewHolderPersona> {
    private ArrayList<Trabajador> datos;

    public PersonaAdapter(ArrayList<Trabajador> datos){
        this.datos = datos;
    }

    @NonNull
    @Override
    public ViewHolderPersona onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_personas,parent,false);
        return new ViewHolderPersona(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPersona holder, int position) {
        holder.getNombrePersona().setText(datos.get(position).getNombrePersona());
        holder.getApellidoPersona().setText(datos.get(position).getApellidoPersona());
        holder.getEdadPersona().setText(String.valueOf(datos.get(position).getEdadPersona()));
        holder.getTt().setText(String.valueOf(datos.get(position).geTipoTrabajador()));
        holder.getSueldo().setText(String.valueOf(datos.get(position).getSueldoMensual()));

    }

    @Override
    public int getItemCount() {
        return lstTrabajador.size();
    }
}
