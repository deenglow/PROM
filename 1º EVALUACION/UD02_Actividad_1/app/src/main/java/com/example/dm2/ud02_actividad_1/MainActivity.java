package com.example.dm2.ud02_actividad_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText valorUno;
    EditText valorDos;
    TextView resultado;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorUno = (EditText) findViewById(R.id.primerValor);
        valorDos = (EditText) findViewById(R.id.segundoValor);
        resultado = (TextView) findViewById(R.id.resultado);

    }

    protected void operar(View view){

        switch(view.getId()){
            case R.id.suma:
               resultado.setText( "RESULTADO: " + String.valueOf(Integer.parseInt(valorUno.getText().toString()) + Integer.parseInt(valorDos.getText().toString())));
                break;
            case R.id.resta:
                resultado.setText("RESULTADO: " + String.valueOf(Integer.parseInt(valorUno.getText().toString()) - Integer.parseInt(valorDos.getText().toString())));
                break;
            case R.id.multiplicacion:
                resultado.setText( "RESULTADO: " + String.valueOf(Integer.parseInt(valorUno.getText().toString()) * Integer.parseInt(valorDos.getText().toString())));
                break;
            case R.id.division:
                resultado.setText("RESULTADO: " + String.valueOf(Integer.parseInt(valorUno.getText().toString()) / Integer.parseInt(valorDos.getText().toString())));
                break;
        }
    }
}
