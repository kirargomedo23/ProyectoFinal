package com.example.proyectofinal.ENTIDADES;

public class Usuario {

    private Integer idUsuario;
    private String nombre;
    private String apellido;
    private String direccion;
    private String sexo;
    private String telefono;
    private String usuario;
    private String contrasenia;

    public Usuario(String usuario, String contrasenia){
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }


    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }


    //Validaciones.
    public boolean esValidoUsuarioYContrasenia(){

        if(this.usuario.length() == 0 || this.contrasenia.length() == 0 ){
            return false;
        }

        return true;
    }

}
