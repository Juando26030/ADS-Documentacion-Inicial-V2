package com.example.hola.negocio;

import java.util.ArrayList;
import java.util.List;

import com.example.hola.dominio.*;
import com.example.hola.integracion.IntegradorFileSystem;

public class NegocioRentarCarro implements INegocioRentarCarro {
    @Override
    public Carro seleccionarCarro() {
        return null;
    }

    @Override
    public Renta crearRenta() {
        return null;
    }

    @Override
    public void totalizarRenta(Renta rentaAct) {
    }

    @Override
    public boolean pagarRenta(Renta rentaAct) {
        return false;
    }

    @Override
    public boolean guardarRenta(Renta rentaAct) {
        return false;
    }

    @Override
    public void listarCarros(List<Carro> carros) {

    }
}
