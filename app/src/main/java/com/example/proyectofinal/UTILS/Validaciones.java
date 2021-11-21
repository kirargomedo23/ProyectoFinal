package com.example.proyectofinal.UTILS;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {

    public Validaciones(){}

    public Boolean esValidoTexto(String texto){ //Valida solo letras y espacios.
        CharSequence inputStr = texto;
        Pattern pattern = Pattern.compile(new String ("^[a-z A-Z]+$"));
        Matcher matcher = pattern.matcher(inputStr);

        if(matcher.matches()){
            return true;
        }
        return false;
    }

    public Boolean esValidoNumero(String numero){
        CharSequence inputStr = numero;
        Pattern pattern = Pattern.compile(new String ("^[0-9]+$"));
        Matcher matcher = pattern.matcher(inputStr);

        if(matcher.matches()){
            return true;
        }
        return false;
    }

    public Integer obtenerCantidadDeCaracteres(String text){
        return (Integer)text.length();
    }

}
