package com.vero.petagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<FDatos> lista = new ArrayList<FDatos>();
        lista.add(new FDatos ("Monny", R.drawable.perro,0));
        lista.add(new FDatos ("Keysi", R.drawable.perro1,0));
        lista.add(new FDatos ("Coqueta", R.drawable.perro2,0));
        lista.add(new FDatos ("Tilla", R.drawable.perro3,0));
        lista.add(new FDatos ("Junior", R.drawable.perro4,0));
        lista.add(new FDatos ("Bolo", R.drawable.perro5,0));
        lista.add(new FDatos ("Zeus", R.drawable.perro8,0));
        lista.add(new FDatos ("Perrito", R.drawable.perro9,0));

        RecyclerView contenedor = (RecyclerView) findViewById(R.id.contenedor);
            contenedor.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
        layout.setOrientation(LinearLayoutManager.VERTICAL);
        contenedor.setAdapter(new Adaptador(lista));
        contenedor.setLayoutManager(layout);
    }

    public void siguiente_activity (View view){
        Intent miIntent = new Intent(this, SegundoActivity.class);
        startActivity(miIntent);
    }

    }
