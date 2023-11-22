package com.example.hola.integracion;

import com.example.hola.dominio.Carro;
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
            JsonNode jsonNode = objectMapper.readTree(new File("C:/Users/elice/ADS/ArchivosJson/carros.json"));

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

        return null;
    }
}
