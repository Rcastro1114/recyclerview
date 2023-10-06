package com.example.recyclerviewejemplo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recyclerviewejemplo.adapters.PersonaAdapter;
import com.example.recyclerviewejemplo.models.Persona;
import com.example.recyclerviewejemplo.models.Trabajador;

import java.util.ArrayList;
import java.util.List;

public class MostrarListaTB extends AppCompatActivity {

    private PersonaAdapter personaAdapter;
    private RecyclerView recyclerView;
    private  LinearLayoutManager layoutManager;

    public static ArrayList<Trabajador> lstTrabajador = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_lista_tb);

        Toast.makeText(this, "DATOS: "+ lstTrabajador, Toast.LENGTH_SHORT).show();
        personaAdapter = new PersonaAdapter(lstTrabajador);
        layoutManager = new LinearLayoutManager(this);
        recyclerView = findViewById(R.id.rcvPersonas);
        recyclerView.setAdapter(personaAdapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);


        // Rellenando listado de personas
        /*lstTrabajador.add(new Trabajador(lstTrabajador.size() + 1, "Miguel Angel", "García Sosa",35));
        lstTrabajador.add(new Trabajador(lstTrabajador.size() + 1, "Karla Antonieta","Lue Gomez", 24));
        lstTrabajador.add(new Trabajador(lstTrabajador.size() + 1, "Monica Angelina","Flores García",23));

        Toast.makeText(this, "DATOS: " + lstTrabajador, Toast.LENGTH_SHORT).show(); // Configurando adaptador
        //personaAdapter = new PersonaAdapter(lstTrabajador);
        layoutManager = new LinearLayoutManager(this);
        recyclerView = findViewById(R.id.rcvPersonas);
        recyclerView.setAdapter(personaAdapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);*/
    }
}