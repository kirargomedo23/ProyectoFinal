package com.example.proyectofinal.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.proyectofinal.ENTIDADES.Usuario;
import com.example.proyectofinal.ENTIDADES.Venta;
import com.example.proyectofinal.UTILS.Constantes;
import com.example.proyectofinal.UTILS.VentaBD;


public class VentaDAO {
    private VentaBD ventaBD;
    private SQLiteDatabase db;
    private Context context;

    public VentaDAO(Context context){
        ventaBD = new VentaBD(context);
        this.context = context;
    }

    public void abrirBD(){
        db = ventaBD.getWritableDatabase();
    }

    public String registrarVenta(Venta venta){
        String mensaje= " ";
        try{
            ContentValues valores =new ContentValues();

            valores.put("nombre_producto",venta.getNombre());
            valores.put("cantidad",venta.getCantidad());
            valores.put("precio",venta.getPrecio());

            long resultado= db.insert(Constantes.NOMBRE_TABLA_VENTA,null,valores);
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

}
