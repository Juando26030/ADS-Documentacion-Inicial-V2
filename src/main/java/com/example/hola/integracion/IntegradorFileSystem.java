package com.example.hola.integracion;

import com.example.hola.dominio.Carro;
import com.example.hola.dominio.Cliente;
import com.example.hola.dominio.Servicio;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.google.gson.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IntegradorFileSystem implements IIntegracionFileSystem{

    @Override
    public List<Carro> cargarCarros(String carrosJson) throws JsonIOException, JsonSyntaxException {
        List<Carro> listaCarros = new ArrayList<>();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File(carrosJson));

            JsonNode carrosNode = jsonNode.get("carros");
            if (carrosNode.isArray()) {
                for (JsonNode carroNode : carrosNode) {
                    String placa = carroNode.get("placa").asText();
                    int valorRenta = carroNode.get("valorRenta").asInt();

                    Carro carro = new Carro(placa, valorRenta);
                    listaCarros.add(carro);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaCarros;
    }


    @Override
    public List<Servicio> cargarServicios(String serviciosJson) {
        List<Servicio> listaServicios = new ArrayList<>();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File(serviciosJson));

            JsonNode serviciosNode = jsonNode.get("servicios");
            if (serviciosNode.isArray()) {
                for (JsonNode carroNode : serviciosNode) {
                    String nombre = carroNode.get("nombre").asText();
                    int precio = carroNode.get("precio").asInt();

                    Servicio servicio = new Servicio(nombre, precio);
                    listaServicios.add(servicio);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaServicios;
    }

    public List<Cliente> cargarClientes(String clienteJson) {
        List<Cliente> listaCliente = new ArrayList<>();
        try {

            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File(clienteJson));

            JsonNode clientesNode = jsonNode.get("clientes");
            if (clientesNode.isArray()) {
                for (JsonNode carroNode : clientesNode) {
                    String nombre = carroNode.get("nombre").asText();
                    String cedula = carroNode.get("cedula").asText();

                    Cliente cliente = new Cliente(nombre, cedula);
                    listaCliente.add(cliente);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaCliente;
    }
}
