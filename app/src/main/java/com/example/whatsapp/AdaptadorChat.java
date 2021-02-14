package com.example.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorChat extends BaseAdapter {

    private Chat[]chats;
    private Context contexto;

    public AdaptadorChat (Chat[] chat, Context contexto){
this.chats=chat;
        this.contexto=contexto;

    }


    @Override
    public int getCount() {
        return chats.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       Chat chat = chats[position];
       if(convertView==null){
           final LayoutInflater inflador= LayoutInflater.from(contexto);
           convertView=inflador.inflate(R.layout.diseno,null);

       }
        TextView titulo= convertView.findViewById(R.id.Titulo);
        TextView cuerpo= convertView.findViewById(R.id.cuerpo);
        ImageView imagen= convertView.findViewById(R.id.imagen);

        titulo.setText(chat.getTitulo());
        cuerpo.setText(chat.getCuerpo());
        imagen.setImageBitmap(chat.getImagen());

        return convertView;
    }
}
