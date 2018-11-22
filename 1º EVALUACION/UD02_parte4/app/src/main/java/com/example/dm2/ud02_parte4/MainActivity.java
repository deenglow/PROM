package com.example.dm2.ud02_parte4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    protected void llamarActividad1(View view){
        Intent intent = new Intent(MainActivity.this,Ejercicio1.class);
        startActivity(intent);

    }

    protected void llamarActividad2(View view){
        Intent intent = new Intent(MainActivity.this,Ejercicio2.class);
        startActivity(intent);

    }
}
