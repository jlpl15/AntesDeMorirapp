package com.caffeinelabs.antesdemorirapp;

import android.graphics.Bitmap;

/**
 * Created by caffeinelabs07 on 2/3/16.
 */
public class Things {
    public String descripción;
    public String Nombre;
    //public Bitmap imagen;

    public Things(String descripción, String Nombre){
        descripción=this.descripción;

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }


}
