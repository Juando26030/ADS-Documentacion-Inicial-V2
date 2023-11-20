package com.example.hola.negocio;

import com.example.hola.dominio.Carro;
import com.example.hola.dominio.Renta;
import com.example.hola.dominio.Servicio;

import java.util.List;

public interface INegocioItems {
    void listarItems(Renta rentaAct); // CU Listar servicios de la compra
    void añadirItem(Renta rentaAct); // CU Agregar servicios a la renta
    void eliminarItem(Renta rentaAct); // CU Eliminar Servicio
    void modificarItem(Renta rentaAct); // CU Modificar Cantidad de Servicio
    void listarServicios(List<Servicio> servicios); // Aparecen los servicios en la pantalla
}
