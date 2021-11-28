package com.example.proyectofinal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.proyectofinal.DAO.UsuarioDAO;
import com.example.proyectofinal.ENTIDADES.Usuario;

public class RegistroUsuario extends AppCompatActivity {

    EditText txtUsuario, txtContrasenia,txtNombre,txtApellidos,txtDireccion;
    Button btnRegistrar;
    Usuario usu=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        asignarReferencias();
    }

    private void asignarReferencias() {
        txtUsuario = findViewById(R.id.txtUsuario);
        txtContrasenia = findViewById(R.id.txtContrasenia);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellidos = findViewById(R.id.txtApellidos);
        txtDireccion = findViewById(R.id.txtDireccion);



        btnRegistrar = findViewById(R.id.btnRegistrar);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (capturarDatos()){
                    UsuarioDAO usuarioDAO = new UsuarioDAO(RegistroUsuario.this);
                    usuarioDAO.abrirBD();
                    String mensaje = usuarioDAO.registrarUsuario(usu);
                    mostrarMensaje(mensaje);

                }
            }
        });


    }


    private void mostrarMensaje(String mensaje){


        AlertDialog.Builder ventana = new AlertDialog.Builder(this);
        ventana.setTitle("Mensaje Informativo");
        ventana.setMessage(mensaje);
        ventana.setPositiveButton("Aceptar",null);
        ventana.create().show();


    }



    private boolean capturarDatos(){ //METODO PARA VALIDAR

        String usuario = txtUsuario.getText().toString();
        String contrasenia = txtContrasenia.getText().toString();
        String nombre = txtNombre.getText().toString();
        String apellidos = txtApellidos.getText().toString();
        String direccion = txtDireccion.getText().toString();



        boolean valida = true;
        //En los if estoy validando que hayan datos
        if(usuario.equals("")){
            txtUsuario.setError("El Usuario es Obligatorio =)");
            valida = false;
        }
        if(contrasenia.equals("")){
            txtContrasenia.setError("La contraseña es Obligatorio =)");
            valida = false;
        }
        if(nombre.equals("")){
            txtNombre.setError("El nombre es Obligatorio =)");
            valida = false;

        }

        if(apellidos.equals("")){
            txtApellidos.setError("El Apellido es Obligatorio =)");
            valida = false;

        }

        if(direccion.equals("")){
            txtDireccion.setError("La direccion es Obligatoria =)");
            valida = false;

        }




        if(valida){
            usu = new Usuario(String.valueOf(txtUsuario), String.valueOf(txtContrasenia));
            usu.setNombre( String.valueOf(txtNombre) );
            usu.setApellido( String.valueOf(txtApellidos) );
            usu.setDireccion( String.valueOf(txtDireccion) );

        }




        return  valida;



    }

}