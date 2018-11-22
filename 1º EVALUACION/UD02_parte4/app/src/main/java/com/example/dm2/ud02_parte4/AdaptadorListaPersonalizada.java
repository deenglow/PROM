package com.example.dm2.ud02_parte4;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class AdaptadorListaPersonalizada extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Pagina> items;

    //costructor en el cual enviaremos informacion
    public AdaptadorListaPersonalizada(Activity actividad, ArrayList <Pagina> items) {
        this.activity = actividad;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.lista_urls, null);
        }

        //creamos un objeto de la clase WebsEsTl
        Pagina objWebs = items.get(position);

        //Asignamos los recursos a las variable
        TextView titulo = (TextView) v.findViewById(R.id.nombrePagina);
        TextView descripcion = (TextView) v.findViewById(R.id.urlPagina);
        ImageView imagen = (ImageView) v.findViewById(R.id.imagenPagina);

        //Enviamos informacion a la vista apartir de la informacion que contenga la clase:
        titulo.setText(objWebs.getNombre());
        descripcion.setText(objWebs.getUrl());
        imagen.setImageResource(objWebs.getImagen());

        return v;
    }

    public void addAll(ArrayList<Pagina> paginas){
        for (int i= 0; i<paginas.size(); i++) {
            items.add(paginas.get(i));
        }
    }

}