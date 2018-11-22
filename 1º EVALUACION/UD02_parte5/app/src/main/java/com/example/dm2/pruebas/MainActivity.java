package com.example.dm2.pruebas;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //creamos las variables para las listView
    ListView listaLlamadas;
    ListView listaChats;
    ListView listaContactos;
    //creamos las siguientes variables
    ArrayList<Persona> personas = new ArrayList<Persona>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CREACION DE TABS

        Resources res = getResources();

        //Referenciamos al TabHost del xml
        TabHost tabs = (TabHost) findViewById(android.R.id.tabhost);
        //Con setup lo preparamos para su configuracion
        tabs.setup();

        //Creamos un tabSpec para cada una de las pestañas que tendra la app
        TabHost.TabSpec spec = tabs.newTabSpec("LLamadas");
        //Asignamos el layout de contenido con setContent
        spec.setContent(R.id.tab1);
        //Con setIndicator lo que hacemos es indicar que texto o icono queremos mostrar
        spec.setIndicator("LLamadas");
        //Agregamos el tab
        tabs.addTab(spec);

        spec = tabs.newTabSpec("Chats");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Chats");
        tabs.addTab(spec);

        spec =  tabs.newTabSpec("Contactos");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Contactos");
        tabs.addTab(spec);

        //Con setCurrentTab indicamos que TAB queremos que se muestre primero
        tabs.setCurrentTab(0);

        //CREACION LISTA

        //Asignamos la lista del xml de cada tab
        listaContactos = (ListView) findViewById(R.id.listaContactos);
        listaLlamadas = (ListView) findViewById(R.id.listaLLamadas);
        listaChats = (ListView) findViewById(R.id.listaChats);

        //Empezamos a llenar el arrayList el cual contendra los datos que deseamos
        personas.add(new Persona("Jorge","666333222",R.mipmap.telefono));
        personas.add(new Persona("Sonia","636258145",R.mipmap.telefono));
        personas.add(new Persona ("Maria","669547852",R.mipmap.telefono));
        //creamos un objeto del adaptador que creamos al cual le pasaremos los datos para llenar la vista
        AdaptadorLista adaptador = new AdaptadorLista(this, personas);

        //Asignamos a la listView el adaptador
        listaContactos.setAdapter(adaptador);
        listaChats.setAdapter(adaptador);
        listaLlamadas.setAdapter(adaptador);

        //Eventos TABS
        tabs.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                switch (tabId){
                    case "Chats":
                        for (int i = 0; i< personas.size(); i++){
                            personas.get(i).setImagen(R.mipmap.chats);
                        }
                        break;
                    case "Contactos":
                        for (int z = 0; z< personas.size(); z++){
                            personas.get(z).setImagen(R.mipmap.persona);

                        }
                        break;
                }
                Log.i("TABS -->", "Pestaña pulsada: " + tabId.toUpperCase());
            }
        });
    }

    //INCLUIR MENU
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
