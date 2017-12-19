package com.example.jorgeyya.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Element> lCosas;
    RecyclerView rvListaCosas;
    RecyclerView.LayoutManager rvLM;
    Adaptador adt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvListaCosas = (RecyclerView) findViewById(R.id.rv_cosas);

        //Creamos los dato
        lCosas = new ArrayList<Element>();
        lCosas.add(new Element("El buen nombre", 4.5f, "Aincrad", 150.5f, R.mipmap.pollito_de_troya));
        lCosas.add(new Element("El buen nombre 2", 4.0f, "Hyrule", 300.5f, R.mipmap.pollito_de_troya));
        lCosas.add(new Element("El buen nombre 3", 3.5f, "Ishbal", 200.5f, R.mipmap.pollito_de_troya));
        lCosas.add(new Element("El buen nombre 4", 3.0f, "Moderdonia", 1.5f, R.mipmap.pollito_de_troya));
        lCosas.add(new Element("私はバカです", 5.0f, "アインクラッド", 1.5f, R.mipmap.pollito_de_troya));


        //Creamos el LayoutManager
        rvLM = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        //lo asignamos al RecilclerView
        rvListaCosas.setLayoutManager(rvLM);
        //creamos el Adaptador para el ReciclerView
        adt = new Adaptador(lCosas);
        //asignamos el Adaptador al ReciclerView
        rvListaCosas.setAdapter(adt);


    }
}
