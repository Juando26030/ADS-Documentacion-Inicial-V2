package com.example.hola.dominio;

public class Carro {
    private String placa;
    private Float valorRenta;

    public Carro(String placa, Float valorRenta) {
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

    public Float getValorRenta() {
        return valorRenta;
    }

    public void setValorRenta(Float valorRenta) {
        this.valorRenta = valorRenta;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", valorRenta=" + valorRenta +
                '}';
    }
}
