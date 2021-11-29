package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListadoProducto extends AppCompatActivity {

    private String productos [] = {"Gaseosa","fewef","Dante","Castillo","José", "Samuel", "Diego"};
    //private String edades [] = {"12","22","55","23","33","78","64"};

    private TextView tv1;
    private ListView lv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado_producto);

        tv1 = (TextView)findViewById(R.id.tv1);
        lv1 = (ListView)findViewById(R.id.lv1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_item_geekipedia, productos);
        lv1.setAdapter(adapter);

        /*lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("La edad de: "+lv1.getItemAtPosition(i)+" es : "+edades[i]+ " años.");
            }
        });*/

    }


    public void irConfiguracionUsuario(View view){
        Intent intent = new Intent(this,ConfiguracionUsuario.class);
        startActivity(intent);
    }
}