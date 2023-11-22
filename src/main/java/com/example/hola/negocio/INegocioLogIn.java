package com.example.hola.negocio;

import com.example.hola.dominio.Cliente;

public interface INegocioLogIn {
    Cliente clienteActual(String nombre); // Caso de uso Iniciar Renta
}
