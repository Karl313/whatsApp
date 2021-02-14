package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
private ListView lista;
private Bitmap imagen= BitmapFactory.decodeFile("./res/drawable/Jonan.bmp");

private Chat[] chats={new Chat("Titulo","cuerpo",imagen ),new Chat("Titulo","cuerpo",imagen  ),new Chat("Titulo","cuerpo",imagen  ),new Chat("Titulo","cuerpo",imagen)};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=findViewById(R.id.lista);

        AdaptadorChat adaptador= new AdaptadorChat(chats,getApplicationContext());
        lista.setAdapter(adaptador);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflador= getMenuInflater();
        inflador.inflate(R.menu.menu,menu);
        return true;


    }
}