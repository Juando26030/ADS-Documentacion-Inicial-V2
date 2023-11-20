package com.example.hola.dominio;

public class Servicio {
    private String nombre;
    private Float precio;

    public Servicio(String nombre, Float precio) {
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

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
