package com.caffeinelabs.antesdemorirapp;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;
import java.util.ArrayList;

public class ADD extends AppCompatActivity {
    private Button add;
    public String descripcion;
    public String nombre;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        add= (Button) findViewById(R.id.btnAdd);
        descripcion= (String) findViewById(R.id.edtDescripcion).toString();
        nombre= (String) findViewById(R.id.edtNombre).toString();
        final Things ob= new Things(nombre,descripcion);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent =new Intent(ADD.this,Lista.class);
            //intent.pu("objeto", (Parcelable) ob);
                intent.putExtra("objeto", (Serializable) ob);
                startActivity(intent);
            }
        });

    }
}
