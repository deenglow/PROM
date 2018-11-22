package com.example.dm2.ud02_parte6;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentListado.PeliculasListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentListado flist = (FragmentListado) getSupportFragmentManager().findFragmentById(R.id.frgListado);
        flist.setPeliculaListener(this);
    }

    @Override
    public void onPeliculaSeleccionado(Pelicula p){

        boolean hayFragDetalle = getSupportFragmentManager().findFragmentById(R.id.frgDetalle) != null;

        if(hayFragDetalle){
            FragmentDetallePeliculas f = (FragmentDetallePeliculas) getSupportFragmentManager().findFragmentById(R.id.frgDetalle);
            f.mostrarDetalle(p);
        } else {
            Intent intent = new Intent(this, DetalleActivity.class);
            intent.putExtra("Pelicula", p);
            startActivity(intent);
        }

    }
}
