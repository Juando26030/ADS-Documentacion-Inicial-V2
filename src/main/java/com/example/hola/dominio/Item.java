package com.example.hola.dominio;

import java.util.Objects;

public class Item {
    private Integer pasajeros;
    private Servicio servicio;

    public Item(Integer pasajeros, Servicio servicio) {
        this.pasajeros = pasajeros;
        this.servicio = servicio;
    }

    public Item() {
    }

    public Integer getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Integer pasajeros) {
        this.pasajeros = pasajeros;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return "Item{" +
                "pasajeros=" + pasajeros +
                ", servicio=" + servicio +
                '}';
    }


    public boolean equals(Item item) {
        if(Objects.equals(this.getServicio().getNombre(), item.getServicio().getNombre())){
            return true;
        }else{
            return false;
        }
    }
}
