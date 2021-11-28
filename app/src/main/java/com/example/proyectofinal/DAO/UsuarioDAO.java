package com.example.proyectofinal.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.proyectofinal.ENTIDADES.Usuario;
import com.example.proyectofinal.UTILS.Constantes;
import com.example.proyectofinal.UTILS.UsuarioBD;

public class UsuarioDAO {
    private UsuarioBD usuarioBD;
    private SQLiteDatabase db;
    private Context context;

    public UsuarioDAO(Context context){
        usuarioBD = new UsuarioBD(context);
        this.context = context;
    }

    public void abrirBD(){

        db = usuarioBD.getWritableDatabase();
    }

    public String registrarUsuario(Usuario usuario){
        String mensaje= " ";
        try{
            ContentValues valores =new ContentValues();
            valores.put("usuario",usuario.getUsuario());
            valores.put("contrasenia",usuario.getContrasenia());
            valores.put("nombre",usuario.getNombre());
            valores.put("apellidos",usuario.getApellido());
            valores.put("direccion",usuario.getDireccion());
            valores.put("telefono",usuario.getTelefono());
            valores.put("sexo",usuario.getSexo());
            long resultado= db.insert(Constantes.NOMBRE_BD,null,valores);
            if(resultado == -1){
                mensaje= "Error al insertar";

            }else{

                mensaje=" Se registro correctamente";
            }
        }catch (Exception e){

            Log.d("==>>",e.getMessage());
        }
        return mensaje;
    }


    public Boolean registrar(){
        return true;
    }

    public Boolean actualizar(){
        return true;
    }

    public void obtenerUsuarioPorId(Integer id){

    }

    public Boolean esUsuarioDeLaAplicacion(){
        return true;
    }

}
