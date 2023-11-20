package com.example.hola.integracion;

import com.example.hola.dominio.Carro;
import com.example.hola.dominio.Servicio;

import java.util.List;

public class IntegradorFileSystem implements IIntegracionFileSystem{

    @Override
    public List<Carro> cargarCarros(String carrosJson) {
        return null;
    }

    @Override
    public List<Servicio> cargarServicios(String serviciosJson) {
        return null;
    }
}
