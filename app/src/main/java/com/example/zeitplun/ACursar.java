package com.example.zeitplun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


import java.util.ArrayList;

public class ACursar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_a_cursar);
        ArrayList<String> Nm = getIntent().getStringArrayListExtra(("datos"));
        ListView tv = findViewById(R.id.list_viewsirveplis);//Si quitamos esta linea El codigo funciona
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_view_diego, Nm);
        tv.setAdapter(adapter);//Si quitamos esta linea el codigo funciona
    }

    public void volver(View view) {
        Intent intent = new Intent(this, CrearHorario.class);
        startActivity(intent);
    }
}