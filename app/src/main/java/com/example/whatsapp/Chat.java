package com.example.whatsapp;

import android.graphics.Bitmap;

public class Chat {
    private String titulo;
    private String cuerpo;
    private Bitmap imagen;


     public Chat (String titulo, String cuerpo, Bitmap imagen ){
         this.cuerpo=cuerpo;
         this.titulo=titulo;
         this.imagen=imagen;

     }

    public Bitmap getImagen() {
        return imagen;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public String getTitulo() {
        return titulo;
    }
}
