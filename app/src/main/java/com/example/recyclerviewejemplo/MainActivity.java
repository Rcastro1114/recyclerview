package com.example.recyclerviewejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnAgregarT, btnMostrarList, btnAcercaDeR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAgregarT = findViewById(R.id.btnAgregarTrabajador);
        btnMostrarList = findViewById(R.id.btnMostrarListaTrab);
        btnAcercaDeR = findViewById(R.id.btnAcercaDe);

        btnAgregarT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AgregarTrab.class));
            }
        });

        btnMostrarList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MostrarListaTB.class));
            }
        });

        btnAcercaDeR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AcercaDe.class));
            }
        });

    }
}