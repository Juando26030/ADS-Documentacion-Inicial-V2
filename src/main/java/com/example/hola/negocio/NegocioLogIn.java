package com.example.hola.negocio;

import com.example.hola.Constantes;
import com.example.hola.dominio.Cliente;
import com.example.hola.integracion.IntegradorFileSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class NegocioLogIn implements INegocioLogIn{

    private NegocioRentarCarro negocioRentarCarro=new NegocioRentarCarro();

    private List<Cliente> clientes= new ArrayList<>();
    private Cliente clienteact= new Cliente();

    public Cliente getClienteact() {
        return clienteact;
    }

    private final IntegradorFileSystem integrador=new IntegradorFileSystem();
    public void cargarClientes (){
        clientes=integrador.cargarClientes(Constantes.CLIENTESJSON);
    }
    @Override
    public Cliente clienteActual(String nombre) {
        Cliente vacio =new Cliente("","0000");
        for(Cliente cliente:clientes) {
            if (Objects.equals(cliente.getNombre(), nombre)) {
                negocioRentarCarro.actualizarClienteRenta(cliente);
                return cliente;
            }
        }
        return vacio;
    }
    public List<Cliente> getClientes() {
        return clientes;
    }
}
