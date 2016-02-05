package com.caffeinelabs.antesdemorirapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista extends AppCompatActivity {
    private ListView lista;
    private Button Agregar;
    public ArrayList<Things> arr = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        lista= (ListView) findViewById(R.id.listView);
        Agregar= (Button) findViewById(R.id.btnAgregar);
            Things obj = (Things) getIntent().getSerializableExtra("objeto");
            arr.add(obj);
            ArrayAdapter<Things> adapter = new ArrayAdapter<Things>(this, R.layout.activity_lista,arr);
            lista.setAdapter(adapter);

        Agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Lista.this, ADD.class);
                startActivity(intent);
            }
        });


    }
}
