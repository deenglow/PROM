package com.example.dm2.ud02_parte3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void iniciarActividad1(View view){
        Intent intent = new Intent(MainActivity.this, Actividad01.class);
        startActivity(intent);

    }

    protected void iniciarActividad2(View view){

        int x = (int)(Math.random()*100);
        int y = (int)(Math.random()*100);
        /*Log.i("NUMEROS", x+"");
        Log.i("NUMEROS", y+"");*/


        Intent intent = new Intent(MainActivity.this, Actividad02.class);
        intent.putExtra("primerNumero", x);
        intent.putExtra("segundoNumero", y);
        startActivity(intent);

    }

    protected void iniciarActividad3(View view){
        Intent intent = new Intent(MainActivity.this, Actividad03.class);
        startActivity(intent);

    }

    protected void cerrarPrograma(View view){
        finish();

    }
}
