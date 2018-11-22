package com.example.dm2.ud02_parte6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class DetalleActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        FragmentDetallePeliculas f = (FragmentDetallePeliculas) getSupportFragmentManager().findFragmentById(R.id.frgDetalle);

        Bundle b = getIntent().getExtras();

        f.mostrarDetalle((Pelicula) b.get("Pelicula"));
    }
}
