package com.example.proyectofinal.ENTIDADES;

public class Venta {
    private Integer idVenta;
    private Integer cantidad;
    private Integer precio;
    private String nombre;

    public Venta(Integer idVenta,Integer cantidad, Integer precio, String nombre){
        this.idVenta = idVenta;
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombre = nombre;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
