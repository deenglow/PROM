package com.example.dm2.ud02_parte3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Actividad03_informacion extends AppCompatActivity {

    private TextView mostrarInformacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad03_informacion);

        mostrarInformacion = (TextView)findViewById(R.id.informacionOptenida);

        Bundle extras = getIntent().getExtras();
        String aficiones="";
        for (int i=0;i<extras.getStringArrayList("listaAficiones").size();i++){
            aficiones += "- "+extras.getStringArrayList("listaAficiones").get(i)+"\n";

        }
        mostrarInformacion.setText("Te llamas "+ extras.getString("nombre")+ " "+ extras.getString("apellidos")+ ".\nEres "+ extras.getString("radioGrupoOpcion")
                                    + ". \nTus aficiones son: \n" + aficiones);
    }
}
