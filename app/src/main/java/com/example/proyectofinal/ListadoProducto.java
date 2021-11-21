package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListadoProducto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_producto);
    }


    public void irConfiguracionUsuario(View view){
        Intent intent = new Intent(this,ConfiguracionUsuario.class);
        startActivity(intent);
    }
}