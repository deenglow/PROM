package com.example.dm2.ud02_parte4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Ejercicio1 extends AppCompatActivity {

    private ListView list;
    private String[] paises={"España","Francia","Portugal","Alemania","Irlanda","Holanda"};
    private String [] infoPaises={"505,990","643,801","92,212","357,386","70,274","41,543"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        list = (ListView) findViewById(R.id.listaPaises);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, paises);

        list.setAdapter(adaptador);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), paises[position] + " tiene una superficie de " + infoPaises[position] + " km2" , Toast.LENGTH_SHORT).show();
            }
        });

    }
}
