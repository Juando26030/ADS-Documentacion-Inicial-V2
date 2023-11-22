package com.example.hola.dominio;

public class Servicio {
    private String nombre;
    private Integer precio;

    public Servicio(String nombre, Integer precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Servicio() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre +
                ", precio: " + precio ;
    }
}
