package com.example.recyclerviewejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.recyclerviewejemplo.models.Persona;
import com.example.recyclerviewejemplo.models.Trabajador;
import com.example.recyclerviewejemplo.models.TrabajadorTiempoCompleto;

import java.util.ArrayList;

public class AgregarTrab extends AppCompatActivity {

    private RadioButton rdbPorHora,rdbTiempoCompleto;
    private Bundle bundle;
    private RadioGroup rdgTrabajador;
    private Button btnNextAg;

    private int idEleccionTrab = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_trab);

        rdgTrabajador = findViewById(R.id.rdGroupButton);
        rdbPorHora = rdgTrabajador.findViewById(R.id.rButtPorHora);
        rdbTiempoCompleto = rdgTrabajador.findViewById(R.id.rdbuttTiempoComp);
        btnNextAg = findViewById(R.id.btnSiguienteAgr);

        rdbPorHora.setOnClickListener(v -> idEleccionTrab = 1);
        rdbTiempoCompleto.setOnClickListener(v -> idEleccionTrab = 2);

        btnNextAg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    bundle = new Bundle();
                    bundle.putInt("tipoEleccionTr", idEleccionTrab);
                    Intent intent = new Intent(AgregarTrab.this, TrabajadorPorHora.class);
                    intent.putExtras(bundle);
                    startActivity(intent);
                    //startActivity(new Intent(AgregarTrab.this, TrabajadorPorHora.class));
            }
        });
    }
}