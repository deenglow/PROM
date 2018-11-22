package com.example.dm2.ud02_parte3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad01 extends AppCompatActivity {

    private EditText nombre;
    private EditText apellidos;
    private TextView respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad01);

        nombre = (EditText) findViewById(R.id.nombre);
        apellidos = (EditText) findViewById(R.id.apellidos);
        respuesta = (TextView) findViewById(R.id.respuesta);
    }

    protected void verificarDatos(View view){
        Intent intent = new Intent(Actividad01.this, Actividad01_Condiciones.class);
        intent.putExtra("nombre", nombre.getText().toString());
        intent.putExtra("apellidos", apellidos.getText().toString());
        startActivityForResult(intent, 123);
    }

    protected void onActivityResult (int requestCode, int resultCode, Intent data){
        if (requestCode==123) {
            respuesta.setText("Aceptas Condiciones: "+ data.getExtras().getString("respuesta"));
        }
    }

    protected void retroceder(View view){
        finish();

    }


}
