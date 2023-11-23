package com.example.hola.negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.hola.EventosLogIn;
import com.example.hola.dominio.*;
import com.example.hola.integracion.IntegradorFileSystem;

public class NegocioRentarCarro implements INegocioRentarCarro {

    Renta rentaAct= new Renta();


    public Renta getRentaAct() {
        return rentaAct;
    }

    public void setRentaAct(Renta rentaAct) {
        this.rentaAct = rentaAct;
    }

    @Override
    public Carro seleccionarCarro() {
        return null;
    }

    public void actualizarCarroRenta(Carro carro) {
        rentaAct.setCarro(carro);
    }
    public void actualizarClienteRenta(Cliente cliente) {
        rentaAct.setCliente(cliente);
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
