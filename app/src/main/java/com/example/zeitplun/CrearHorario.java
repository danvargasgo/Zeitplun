package com.example.zeitplun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Scanner;

public class CrearHorario extends AppCompatActivity {
    int numaterias;
    WebView pagina;
    EditText Datosmaterias;
    Scanner sc = new Scanner(System.in);
    ArrayList<String> materias = new ArrayList<String>();
    String linea = null;
    ArrayList<String> NombreDeLasMaterias=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_crear_horario);
        Datosmaterias = findViewById(R.id.Datosmaterias);

        pagina = findViewById(R.id.wv);

        pagina.setWebViewClient(new WebViewClient());
        pagina.getSettings().setJavaScriptEnabled(true);
        pagina.getSettings().setLoadWithOverviewMode(true);
        pagina.getSettings().setUseWideViewPort(true);
        pagina.loadUrl("https://sia.unal.edu.co/ServiciosApp/");
    }

    public void openActivity1(View view){
        Intent intent = new Intent(this, Principal.class);
        startActivity(intent);
    }

    public void agregar(View view){

        String datoss = Datosmaterias.getText().toString();
        ArrayList<String> partes = new ArrayList<String>();
        for(String linea:datoss.split("\n")){

            if(!linea.trim().equals("")){
                partes.add(linea.trim());}
        }

        if (Datosmaterias.length()<=20){
            Toast.makeText(this,"Ingrese los datos de la materia de forma correcta",Toast.LENGTH_LONG).show();
        }
       // else if ((!partes[2].equals("Información de la asignatura")) && (!partes[-1].equals("Portal de Servicios Académicos (V. 4.3.7) |￼ Todos los derechos reservados￼"))) {
        //    Toast.makeText(this, "Datos ingresados incorrectos", Toast.LENGTH_LONG).show();
       // }
        else{
            NombreDeLasMaterias.add(partes.get(4));
          //  materias13[numaterias] = partes.get(4);
          /*  ArrayList<String>NDLM=new ArrayList<String>();
            int x = 4;
            while (x < partes.size()) {

                if(x!=5&&x!=7&&x!=8&&x!=9&&x!=10) {
                    if (partes.get(x).equals("Prerrequisitos")) {
                        break;
                    }

                    NDLM.add(partes.get(x));
                }
                x++;
            }
            NombreDeLasMaterias.add(NDLM);
          /*  4 nombre;
            6 Creditos;
            11-22 grupo 1;
            23-34 grupo 2 ;
            35 prerequisitos ;
            */
            }

            Toast.makeText(this, partes.get(4) + " agregada", Toast.LENGTH_LONG).show();
            numaterias += 1;
        Datosmaterias.getText().clear();
    }

    public void openActivity3(View view){
        Intent x = new Intent(this, Horario.class);
        x.putExtra("datos", NombreDeLasMaterias);
        startActivity(x);

    }

    public void cursarActivity(View view){
        Intent intent = new Intent(this, ACursar.class);
        intent.putExtra("datos", NombreDeLasMaterias);
        startActivity(intent);
    }
    }




