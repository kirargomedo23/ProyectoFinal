package com.example.proyectofinal.UTILS;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class VentaBD extends SQLiteOpenHelper {

    public VentaBD(Context context){
        super(context,Constantes.NOMBRE_BD,null,Constantes.VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // CREACION DE VENTA.

        String query ="CREATE TABLE "+Constantes.NOMBRE_TABLA_VENTA+
                "( " +
                    "id INTEGER PRIMARY KEY NOT NULL, "+
                    "nombre_producto TEXT NOT NULL, " +
                    "cantidad INTEGER NOT NULL,"+
                    "precio INTEGER NOT NULL "+
                ");";
        db.execSQL(query);//EJECUTA EL QUERY

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
