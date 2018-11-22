package com.example.dm2.ud02_parte3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad01_Condiciones extends AppCompatActivity {

    private TextView mensaje;
    private Button aceptar;
    private Button rechazar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad01__condiciones);

        Bundle extras = getIntent().getExtras();
        String nombre = extras.getString("nombre");
        String apellidos = extras.getString("apellidos");

        mensaje = (TextView) findViewById(R.id.mensaje);
        mensaje.setText("Hola " + nombre.toUpperCase() +" "+ apellidos.toString() + " ¿Aceptas las condiciones?");

        aceptar = (Button) findViewById(R.id.aceptar);
        rechazar = (Button) findViewById(R.id.rechazar);


    }

    protected void enviarRespuesta(View view){
        String respuesta;
        if(aceptar.isPressed()){
            respuesta = "Acepto las condiciones";
        }else{
            respuesta = "Rechazo las condiciones";
        }

        Intent intent = new Intent();
        intent.putExtra("respuesta", respuesta);
        setResult(RESULT_OK, intent);
        finish();

    }


}
