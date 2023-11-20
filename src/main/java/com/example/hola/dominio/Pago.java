package com.example.hola.dominio;

import java.util.ArrayList;

public class Pago {
    private ArrayList<Integer> denominaciones = new ArrayList<>();

    public ArrayList<Integer> getDenominaciones() {
        return denominaciones;
    }

    public void setDenominaciones(ArrayList<Integer> denominaciones) {
        this.denominaciones = denominaciones;
    }

    public Pago(ArrayList<Integer> denominaciones) {
        this.denominaciones = denominaciones;
    }

    public Pago() {
    }

    @Override
    public String toString() {
        return "Pago{" +
                "denominaciones=" + denominaciones +
                '}';
    }
}
