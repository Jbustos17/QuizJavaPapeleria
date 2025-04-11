package com.example.QuizPapeleria.Servicio;

import com.example.QuizPapeleria.Modelo.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteServicio {
    Cliente guardarCliente(Cliente cliente);
    List<Cliente> obtenerTodos();
    Optional<Cliente> obtenerPorId(Long id); // cambiado aquí
    Cliente actualizarCliente(Long id, Cliente cliente);
    void eliminarCliente(Long id);
}