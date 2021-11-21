package com.example.proyectofinal.DAO;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class UsuarioDAO {

    private SQLiteDatabase db;
    private Context context;

    public UsuarioDAO(){
        this.context = context;
    }

    public void abrirConexionBD(){

    }

    public Boolean registrar(){
        return true;
    }

    public Boolean actualizar(){
        return true;
    }

    public void obtenerUsuarioPorId(Integer id){

    }

}
