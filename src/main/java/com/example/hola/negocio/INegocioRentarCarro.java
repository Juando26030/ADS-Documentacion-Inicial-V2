package com.example.hola.negocio;

import com.example.hola.dominio.Carro;
import com.example.hola.dominio.Item;
import com.example.hola.dominio.Renta;

import java.util.List;

public interface INegocioRentarCarro {
    Carro seleccionarCarro(); // Caso de uso Iniciar Renta A
    Renta crearRenta(); // Caso de uso Iniciar Renta B
    void totalizarRenta(Renta rentaAct); // CU Totalizar Renta
    boolean pagarRenta(Renta rentaAct); // CU terminar Renta
    boolean guardarRenta(Renta rentaAct);// CU Guardar Renta -- Crea un json y después lo guarda en el disco duro
    void listarCarros(List<Carro> carros); // Aparecen los carros en la pantalla
}
