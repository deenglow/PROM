package com.example.dm2.pruebas;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorLista extends BaseAdapter{

    protected Activity activity;
    protected ArrayList<Persona> items;

    //costructor en el cual enviaremos informacion
    public AdaptadorLista(Activity actividad, ArrayList <Persona> items) {
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
            v = inf.inflate(R.layout.lista_personas, null);
        }

        //creamos un objeto de la clase Persona
        Persona objWebs = items.get(position);

        //Asignamos los recursos a las variable
        TextView nombre = (TextView) v.findViewById(R.id.nombrePersona);
        TextView telefono = (TextView) v.findViewById(R.id.tlfPersona);
        ImageView imagen = (ImageView) v.findViewById(R.id.imagen);

        //Enviamos informacion a la vista apartir de la informacion que contenga la clase:
        nombre.setText(objWebs.getNombre());
        telefono.setText(objWebs.getTelefono());
        imagen.setImageResource(objWebs.getImagen());

        return v;
    }

    public void addAll(ArrayList<Persona> personas){
        for (int i= 0; i<personas.size(); i++) {
            items.add(personas.get(i));
        }
    }


}
