package com.example.zeitplun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Principal extends AppCompatActivity {
    private Button nuevo, cargar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_principal);

        nuevo = (Button) findViewById(R.id.btnuevo);
        nuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        cargar=(Button) findViewById(R.id.cargar);
        cargar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }

    public void openActivity2(){
        Intent intent = new Intent(this, CrearHorario.class);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent = new Intent(this, CargarHorario.class);
        startActivity(intent);
    }
}