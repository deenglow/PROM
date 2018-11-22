package com.example.dm2.ud02_parte3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class Actividad03 extends AppCompatActivity {

    private EditText nombre;
    private EditText apellidos;
    private RadioGroup radioGrupo;
    private CheckBox musica;
    private CheckBox lectura;
    private CheckBox deportes;
    private CheckBox viajar;
    private Button enviar;
    private String opcionElegidaRadios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad03);

        nombre = (EditText) findViewById(R.id.nombre);
        apellidos = (EditText) findViewById(R.id.apellidos);
        radioGrupo= (RadioGroup)findViewById(R.id.radioGrupo);
        musica = (CheckBox)findViewById(R.id.ckMusica);
        lectura = (CheckBox)findViewById(R.id.ckLectura);
        deportes = (CheckBox)findViewById(R.id.ckDeportes);
        viajar = (CheckBox)findViewById(R.id.ckViajar);
        enviar = (Button)findViewById(R.id.enviarInformacion);



    }

    protected void envioInfo(View view){

        Intent intent = new Intent(Actividad03.this, Actividad03_informacion.class);
        intent.putExtra("nombre", nombre.getText().toString());
        intent.putExtra("apellidos", apellidos.getText().toString());
        intent.putExtra("radioGrupoOpcion",opcionElegidaRadios);
        ArrayList<String>listaAficiones = new ArrayList();
        if(musica.isChecked()){
            listaAficiones.add("musica");
        }
        if(lectura.isChecked()){
            listaAficiones.add("lectura");
        }
        if(deportes.isChecked()){
            listaAficiones.add("deportes");
        }
        if(viajar.isChecked()){
            listaAficiones.add("viajar");
        }
        intent.putExtra("listaAficiones",listaAficiones);
        startActivity(intent);
    }
    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.rdOpcion1:
                if (checked)
                    opcionElegidaRadios="Masculino";
                    break;
            case R.id.rdOpcion2:
                if (checked)
                    opcionElegidaRadios="Femenino";
                    break;
        }
    }
}
