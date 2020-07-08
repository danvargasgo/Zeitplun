package com.example.zeitplun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class CargarHorario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_cargar_horario);
    }

    public void openPrincipal(View view){
        Intent intent = new Intent(this, Principal.class);
        startActivity(intent);
    }

    public void cargar(View view){
        Intent intent = new Intent(this, Horario.class);
        startActivity(intent);
    }
}