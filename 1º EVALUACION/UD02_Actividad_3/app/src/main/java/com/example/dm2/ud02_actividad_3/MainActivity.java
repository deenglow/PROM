package com.example.dm2.ud02_actividad_3;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView logo;
    private Button btnBing;
    private Button btnGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = (ImageView) findViewById(R.id.logo);
        btnBing = (Button)findViewById(R.id.btnBing);
        btnGoogle = (Button) findViewById(R.id.btnGoogle);

        btnBing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logo.setImageResource(R.drawable.bing);
            }
        });

        btnGoogle.setOnClickListener(this);
    }

    protected void mostrarLogo(View view){
        logo.setImageResource(R.drawable.yahoo);
    }

    @Override
    public void onClick(View v) {
        logo.setImageResource(R.drawable.google);
    }
}
