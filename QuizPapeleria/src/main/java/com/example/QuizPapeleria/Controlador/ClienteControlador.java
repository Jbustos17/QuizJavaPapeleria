package com.example.QuizPapeleria.Controlador;

import com.example.QuizPapeleria.Modelo.Cliente;
import com.example.QuizPapeleria.Servicio.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteControlador {

    @Autowired
    private ClienteServicio clienteServicio;


    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return clienteServicio.guardarCliente(cliente);
    }


    @GetMapping
    public List<Cliente> obtenerTodos() {
        return clienteServicio.obtenerTodos();
    }


    @GetMapping("/{id}")
    public Optional<Cliente> obtenerPorId(@PathVariable Long id) {
        return clienteServicio.obtenerPorId(id);
    }


    @PutMapping("/{id}")
    public Cliente actualizarCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        return clienteServicio.actualizarCliente(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable Long id) {
        clienteServicio.eliminarCliente(id);
    }
}
