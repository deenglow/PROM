package com.example.dm2.ud02_parte6;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentDetallePeliculas extends Fragment {
        private TextView txtDetalle;

        @Override
        public View onCreateView(LayoutInflater inflater,
                                 ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_detalle, container, false);
        }
        public void mostrarDetalle (Pelicula p) {
            txtDetalle = (TextView)getView().findViewById(R.id.txtDetalle);
            txtDetalle.setText(p.getTitulo());
        }
}

