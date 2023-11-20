package com.example.hola.integracion;

import com.example.hola.dominio.Carro;
import com.example.hola.dominio.Servicio;

import java.util.List;

public interface IIntegracionFileSystem {

    List<Carro> cargarCarros(String carrosJson);
    List<Servicio> cargarServicios(String serviciosJson);
}
