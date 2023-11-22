package com.example.hola.dominio;

public class Carro {
    private String placa;
    private Integer valorRenta;

    public Carro(String placa, Integer valorRenta) {
        this.placa = placa;
        this.valorRenta = valorRenta;
    }

    public Carro() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getValorRenta() {
        return valorRenta;
    }

    public void setValorRenta(Integer valorRenta) {
        this.valorRenta = valorRenta;
    }

    @Override
    public String toString() {
        return "placa: " + placa +
                ", precio: " + valorRenta ;
    }
}
