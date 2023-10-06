package com.example.recyclerviewejemplo;

import androidx.appcompat.app.AppCompatActivity;
import static com.example.recyclerviewejemplo.MostrarListaTB.lstTrabajador;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.recyclerviewejemplo.models.Trabajador;
import com.example.recyclerviewejemplo.models.TrabajadorHora;
import com.example.recyclerviewejemplo.models.TrabajadorTiempoCompleto;

public class TrabajadorPorHora extends AppCompatActivity {

    private EditText edtnombre, edtapellido, edtedad, edtvalorh, edthr, edtsalario;
    private TextView txvvalor, txvhr, txvSlr;
    Bundle bundle;
    private Button btnProcesar;
    private int idEleccionTrab = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trabajador_por_hora);

        edtnombre = findViewById(R.id.edtNombre);
        edtapellido = findViewById(R.id.edtApellido);
        edtedad = findViewById(R.id.edtEdad);
        txvvalor =findViewById(R.id.txvValorHora);
        edtvalorh = findViewById(R.id.edtValor);
        txvhr = findViewById(R.id.txvH);
        edthr = findViewById(R.id.edtHora);
        btnProcesar = findViewById(R.id.btnProcesarTH);
        txvSlr = findViewById(R.id.txvSTC);
        edtsalario = findViewById(R.id.edtS);

        bundle = getIntent().getExtras();
        idEleccionTrab = bundle.getInt("tipoEleccionTr");

        if(idEleccionTrab == 1){
            txvSlr.setVisibility(View.GONE);
            edtsalario.setVisibility(View.GONE);
        }else if(idEleccionTrab == 2){
            txvhr.setVisibility(View.GONE);
            txvvalor.setVisibility(View.GONE);
            edthr.setVisibility(View.GONE);
            edtvalorh.setVisibility(View.GONE);
        }


        btnProcesar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(idEleccionTrab == 1){
                    lstTrabajador.add(new TrabajadorHora(lstTrabajador.size() + 1, edtnombre.getText().toString(), edtapellido.getText().toString(),
                            Integer.valueOf(edtedad.getText().toString()),Integer.valueOf(edthr.getText().toString()), Integer.valueOf(edtvalorh.getText().toString())));
                    AlertaDialogo();
                } else if (idEleccionTrab == 2) {
                    lstTrabajador.add(new TrabajadorTiempoCompleto(lstTrabajador.size() + 1, edtnombre.getText().toString(),
                            edtapellido.getText().toString(), Integer.valueOf(edtedad.getText().toString()), Float.valueOf(edtsalario.getText().toString())));
                    AlertaDialogo();
                }
            }
        });
    }
    private void AlertaDialogo(){
        new AlertDialog.Builder(this)
                .setTitle("¡REGISTRO!")
                .setMessage("Los datos han sido registrados")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(TrabajadorPorHora.this, MainActivity.class));
                    }
                })
                .show();
    }
}