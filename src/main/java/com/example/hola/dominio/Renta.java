package com.example.hola.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Renta {
    private LocalDate fecha;
    private Carro carro;
    private Cliente cliente;
    private Pago pago;
    private ArrayList<Item> items;

    public Renta(LocalDate fecha, Cliente cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Renta{" +
                "fecha='" + fecha + '\'' +
                ", carro=" + carro +
                ", cliente=" + cliente +
                ", pagos=" + pago +
                ", items=" + items +
                '}';
    }

    public Renta(LocalDate fecha, Carro carro, Cliente cliente, Pago pago, ArrayList<Item> items) {
        this.fecha = fecha;
        this.carro = carro;
        this.cliente = cliente;
        this.pago = pago;
        this.items = items;
    }

    public Renta() {
        items= new ArrayList<>();
    }
}
