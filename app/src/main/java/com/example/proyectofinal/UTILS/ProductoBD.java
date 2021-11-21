package com.example.proyectofinal.UTILS;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class ProductoBD  extends SQLiteOpenHelper {

    public ProductoBD(Context context) {
        super(context, Constantes.NOMBRE_BD, null, Constantes.VERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "CREATE TABLE " + Constantes.TABLA_CATEGORIA + " (" +
                " ID_CATEGORIA INTEGER NOT NULL, "+
                " ID_PRODUCTO INTEGER PRIMARY KEY AUTOINCREMENT,"+
                " NOMBRE TEXT NOT NULL " +
                ");";

        sqLiteDatabase.execSQL(query);


        String query2 = "CREATE TABLE " + Constantes.TABLA_PRODUCTO + " (" +
                " ID_PRODUCTO INTEGER PRIMARY KEY AUTOINCREMENT, "+
                " NOMBRE TEXT NOT NULL ," +
                " DESCRIPCION TEXT NOT NULL, "+
                " PRECIO INTEGER NOT NULL, "+
                " SEXO INTEGER NOT NULL, "+
                " CANTIDAD INTEGER NOT NULL, "+
                " STOCK INTEGER NOT NULL "+
                ");";

        sqLiteDatabase.execSQL(query2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
