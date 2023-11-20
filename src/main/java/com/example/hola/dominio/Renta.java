package com.example.hola.dominio;

import java.util.ArrayList;
import java.util.Date;

public class Renta {
    private Date fecha;
    private Carro carro;
    private Cliente cliente;
    private Pago pago;
    private ArrayList<Item> items;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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

    public ArrayList<Item> getItems() {
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

    public Renta(Date fecha, Carro carro, Cliente cliente, Pago pago, ArrayList<Item> items) {
        this.fecha = fecha;
        this.carro = carro;
        this.cliente = cliente;
        this.pago = pago;
        this.items = items;
    }

    public Renta() {
    }
}
