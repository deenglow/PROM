package com.example.dm2.ud02_parte6;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class FragmentListado extends Fragment {


    private Pelicula[] datos = new Pelicula[]{
            new Pelicula("La Roca", "Pelicula de accion",R.drawable.roca),
            new Pelicula("La Cosa", "Pelicula de terror",R.drawable.cosa),
            new Pelicula("Titanic", "Pelicula romantica",R.drawable.titanic),
    };

    private ListView lsListado;
    private PeliculasListener listener;

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_lista, container, false);
    }

    @Override
    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);
        lsListado = (ListView)getView().findViewById(R.id.LstListado);
        lsListado.setAdapter(new AdaptadorPeliculas(this));

        lsListado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int pos, long id)
            {
                if (listener != null){
                    listener.onPeliculaSeleccionado((Pelicula)lsListado.getAdapter().getItem(pos));

                }
            }
        });
    }
    class AdaptadorPeliculas extends ArrayAdapter<Pelicula> {
        Activity context;
        AdaptadorPeliculas (Fragment context) {
            super (context.getActivity(), R.layout.lista_peliculas, datos);
            this.context = context.getActivity();
        }
        public View getView (int position, View convertView, ViewGroup parent){
            LayoutInflater inflater =context.getLayoutInflater();
            View item = inflater.inflate(R.layout.lista_peliculas, null);
            ImageView imagen =(ImageView) item.findViewById(R.id.imagen);
            imagen.setImageResource(datos[position].getImagen());
            TextView lblTitulo= (TextView) item.findViewById(R.id.tituloPelicula);
            lblTitulo.setText(datos[position].getTitulo());
            TextView lblDescrip = (TextView) item.findViewById(R.id.descripcionPelicula);
            lblDescrip.setText(datos[position].getDescripcion());
            return (item);
        }
    }
    public interface PeliculasListener {
        void onPeliculaSeleccionado(Pelicula p);
    }
    public void setPeliculaListener (PeliculasListener listener){
        this.listener = listener;
    }
}

