package com.example.dm2.ud02_parte3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad02_comprobacion extends AppCompatActivity {

    private String mensaje;
    private TextView respuesta;
    private int infoRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad02_comprobacion);

        respuesta = (TextView) findViewById(R.id.comprobacion);

        Bundle extras = getIntent().getExtras();
        if(extras.getInt("sumaxy") == extras.getInt("respuestaSuma")){
            mensaje= "El resultado de la operacion es CORRECTA";
            infoRes=1;
        }else{
            mensaje= "El resultado de la operacion es INCORRECTA";
            infoRes=0;
        }

        respuesta.setText(mensaje);

    }

    protected void enviarComprobacion(View view){
        Intent intent = new Intent();
        intent.putExtra("envioComprob", infoRes);
        setResult(RESULT_OK, intent);
        finish();
    }
}
