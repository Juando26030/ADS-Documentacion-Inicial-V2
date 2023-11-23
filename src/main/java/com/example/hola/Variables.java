package com.example.hola;

import com.example.hola.dominio.Renta;


public class Variables {
    private Renta renta;

    private static Variables myself;

    public Renta getRenta() {
        return renta;
    }

    private void setRenta(Renta renta) {
        this.renta = renta;
    }

    private Variables(){
        renta=new Renta();
        // NONE
    }


    public static Variables getInstance() {
        if (myself == null) {
            myself = new Variables();
        }
        return myself;
    }
}
