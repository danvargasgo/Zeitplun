package com.example.zeitplun;

import android.view.View;
import android.widget.Button;

public class Botones {
    Button elemento;

    Botones(Button boton){
        elemento = boton;
    }

    void visibilidad(){
        if (elemento.getVisibility() == View.VISIBLE) {
            elemento.setVisibility(View.GONE);
        } else{
            elemento.setVisibility(View.VISIBLE);
        }
    }
}
