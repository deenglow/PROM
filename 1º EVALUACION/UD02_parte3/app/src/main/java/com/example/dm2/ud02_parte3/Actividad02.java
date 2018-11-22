package com.example.dm2.ud02_parte3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad02 extends AppCompatActivity {

    private EditText primernum;
    private EditText segundonum;
    private EditText respuesta;
    private TextView comprobacion;
    private int resultadoSuma;
    private int fallo;
    private int acierto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad02);

        primernum = (EditText) findViewById(R.id.numerox);
        segundonum = (EditText) findViewById(R.id.numeroy);
        respuesta = (EditText) findViewById(R.id.sumaxy);
        comprobacion = (TextView) findViewById(R.id.aciertosFallos);

        fallo=0;
        acierto=0;

        Bundle extras = getIntent().getExtras();
        int x = extras.getInt("primerNumero");
        int y = extras.getInt("segundoNumero");
        resultadoSuma = x+y;

        primernum.setText(String.valueOf(x));//No se el porque pero no acepta un entero por eso lo convertimos en String
        segundonum.setText(String.valueOf(y));

    }

    protected void comprobarSuma(View V){
        Intent intent = new Intent(Actividad02.this, Actividad02_comprobacion.class);
        intent.putExtra("sumaxy", resultadoSuma);
        intent.putExtra("respuestaSuma", Integer.parseInt(respuesta.getText().toString()));
        startActivityForResult(intent, 123);

    }

    protected void onActivityResult (int requestCode, int resultCode, Intent data){
        if (requestCode==123) {
            if(data.getExtras().getInt("envioComprob")== 1){
                    acierto++;
            }else{
                    fallo++;
            }
            comprobacion.setText("PREGUNTAS -> CORRECTAS: "+ acierto +"  INCORRECTAS: "+fallo);
        }
    }
}
