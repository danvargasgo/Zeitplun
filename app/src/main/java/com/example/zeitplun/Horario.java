package com.example.zeitplun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

import static android.view.View.INVISIBLE;

public class Horario extends AppCompatActivity {
    public Button volver, ingrupo_1, ingrupo_2, ingrupo_3, Materia1;
    private Spinner Grupos1;
    private TextView DatosGrupos;
    public TableRow hora0;
    int bthorario;
    String[] materias;
    String[] materia1;
    ArrayList<String> Nm = new ArrayList<String>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_horario);

        Grupos1 = findViewById(R.id.grupos);
        DatosGrupos = findViewById(R.id.DatosGrupos);
        ArrayList<String> Grupos = new ArrayList<String>();
        ArrayList<String> materias = new ArrayList<String>();
        Integer[] materias1 = {2000, 2001};
        Integer[] materias2 = {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6};
        // String[] dato =getIntent().getStringArrayExtra("datos");
        ArrayList<String> Nm = getIntent().getStringArrayListExtra(("datos"));
        Grupos.add("Grupo1");
        Grupos.add("Grupo 2");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Grupos);
        Grupos1.setAdapter(adapter);

        for (int x = 0; x < Nm.size(); x++) {
            Button myButton = new Button(this);
            myButton.setText(Nm.get(x));//Adentro de los parentesis deberia ir: Nm.get(x).get(0)
            LinearLayout ll = new LinearLayout(this);
            myButton.setLayoutParams(new LinearLayout.LayoutParams(20, 10));

            if (materias2[x] == 1) {
                ll = findViewById(R.id.hora0);
            } else if (materias2[x] == 2) {
                ll = findViewById(R.id.hora1);
            } else if (materias2[x] == 3) {
                ll = findViewById(R.id.hora2);
            } else if (materias2[x] == 4) {
                ll = findViewById(R.id.hora3);
            } else if (materias2[x] == 5) {
                ll = findViewById(R.id.hora4);
            } else if (materias2[x] == 6) {
                ll = findViewById(R.id.hora5);
            }

            TableRow.LayoutParams lp = new TableRow.LayoutParams(materias2[x]);
            ll.setMinimumHeight(150);
            ll.setMinimumWidth(150);
            ll.addView(myButton, lp);
            ll.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Aparecergrupos();
                }
            });
        }

    }

    public void openActivity2(View view) {
        Intent intent = new Intent(this, CrearHorario.class);
        startActivity(intent);
    }

    public void Aparecergrupos() {
        if (Grupos1.getVisibility() == INVISIBLE) {
            Grupos1.setVisibility(View.VISIBLE);
            DatosGrupos.setVisibility(View.VISIBLE);
        } else if (Grupos1.getVisibility() == View.VISIBLE) {
            Grupos1.setVisibility(View.INVISIBLE);
            DatosGrupos.setVisibility(View.INVISIBLE);

        }
    }
}