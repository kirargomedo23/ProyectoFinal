package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.proyectofinal.ENTIDADES.Usuario;
import com.example.proyectofinal.UTILS.Validaciones;

public class MainActivity extends AppCompatActivity {

    EditText et_Usuario, et_Contrasenia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenemos la referencia.
        et_Usuario = (EditText)findViewById(R.id.txt_usuario);
        et_Contrasenia = (EditText)findViewById(R.id.txt_contrasenia);

    }

    public void ingresar(View view){
        String usuario = String.valueOf(et_Usuario.getText().toString());
        String contrasenia = String.valueOf(et_Contrasenia.getText().toString());

        Usuario user = new Usuario(usuario, contrasenia);

        if( !user.esValidoUsuarioYContrasenia() ){  //user.esValidoUsuarioYContrasenia() ==false
            Toast.makeText(this,"Debe ingresar sus credenciales. " +
                    "Por favor, intente nuevamente",1200).show();
            return;
        }

        Validaciones validacion = new Validaciones();

        if(!validacion.esValidoTexto(user.getUsuario())){
            Toast.makeText(this,"No se admite números. " +
                    "Por favor, intente nuevamente",1200).show();
            return;
        }

        Intent intent = new Intent(this, ListadoProducto.class);
        startActivity(intent);


    }

    public void registrarme(View view){
        Intent intent = new Intent(this, RegistroUsuario.class);
        startActivity(intent);
    }

}