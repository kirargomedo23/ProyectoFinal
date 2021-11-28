package com.example.proyectofinal.UTILS;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class UsuarioBD extends SQLiteOpenHelper {

    public UsuarioBD(Context context){
        super(context,Constantes.NOMBRE_BD,null,Constantes.VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //CREACION DE LA TABLA USUARIO

        String query ="CREATE TABLE "+Constantes.NOMBRE_TABLA+
                "( " +
                "id INTEGER PRIMARY KEY NOT NULL, "+
                " usuario TEXT NOT NULL, " +
                " contrasenia TEXT NOT NULL,"+
                " nombre TEXT NOT NULL, "+
                " apellidos TEXT NOT NULL, "+
                " direccion TEXT NOT NULL "+
                ");";
        db.execSQL(query);//EJECUTA EL QUERY


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
