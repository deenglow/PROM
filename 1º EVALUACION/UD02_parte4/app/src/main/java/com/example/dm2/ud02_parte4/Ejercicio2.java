package com.example.dm2.ud02_parte4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Ejercicio2 extends AppCompatActivity {

    //creamos la variable para la listView
    ListView listaComun;
    //creamos las siguientes variables
    ArrayList<Pagina> webs = new ArrayList<Pagina>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        //Asignamos la lista que creamos al principio
        listaComun = (ListView) findViewById(R.id.milista);
        //Empezamos a lleanr el arrayList el cual contendra los datos de la webs que deceamos
        webs.add(new Pagina("Google","https://www.google.es",R.drawable.google));
        webs.add(new Pagina("Amazon","https://www.amazon.es/",R.drawable.amazon));
        webs.add(new Pagina("Alienxpress","https://es.aliexpress.com/es_home.htm",R.drawable.alienxpress));
        //creamos un objeto del adaptador que creamos al cual le pasaremos los datos para llenar la vista
        AdaptadorListaPersonalizada adaptador = new AdaptadorListaPersonalizada(this, webs);
        //enviamos a la lista view el objeto adaptador
        listaComun.setAdapter(adaptador);

        listaComun.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Uri url = Uri.parse(webs.get(position).getUrl());
                Intent intent = new Intent(Intent.ACTION_VIEW, url );
                startActivity(intent);
            }
        });



    }
}
