package com.example.dm2.ud02_actividad_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numero;
    EditText letra;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = (EditText) findViewById(R.id.numero);
        letra = (EditText) findViewById(R.id.letra);
        resultado = (TextView) findViewById(R.id.feelback);

    }

    protected void validarDNI(View view){
        boolean ok=true;
        if (numero.length()==8){
            if(letra.length()==1) {
                int num = Integer.parseInt(numero.getText().toString());
                int resto;
                resto = num % 23;
                char let = 0;
                switch(resto) {
                    case 0:
                        let = 'T';
                        break;
                    case 1:
                        let = 'R';
                        break;
                    case 2:
                        let = 'W';
                        break;
                    case 3:
                        let = 'A';
                        break;
                    case 4:
                        let = 'G';
                        break;
                    case 5:
                        let = 'M';
                        break;
                    case 6:
                        let = 'Y';
                        break;
                    case 7:
                        let = 'F';
                        break;
                    case 8:
                        let = 'P';
                        break;
                    case 9:
                        let = 'D';
                        break;
                    case 10:
                        let = 'X';
                        break;
                    case 11:
                        let = 'B';
                        break;
                    case 12:
                        let = 'N';
                        break;
                    case 13:
                        let = 'J';
                        break;
                    case 14:
                        let = 'Z';
                        break;
                    case 15:
                        let = 'S';
                        break;
                    case 16:
                        let = 'Q';
                        break;
                    case 17:
                        let = 'V';
                        break;
                    case 18:
                        let = 'H';
                        break;
                    case 19:
                        let = 'L';
                        break;
                    case 20:
                        let = 'C';
                        break;
                    case 21:
                        let = 'K';
                        break;
                    case 22:
                        let = 'E';
                        break;
                }
                if(!letra.getText().toString().equalsIgnoreCase(String.valueOf(let))){

                    ok=false;
                }

            }else{
                ok=false;
            }
        }else{
           ok=false;
        }

        if(ok){
            resultado.setText("DNI CORRECTO");

        }else{

            resultado.setText("DNI INCORRECTO");
        }


    }
}
