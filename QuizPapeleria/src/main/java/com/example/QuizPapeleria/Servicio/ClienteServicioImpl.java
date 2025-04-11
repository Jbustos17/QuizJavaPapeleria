package com.example.QuizPapeleria.Servicio;


import com.example.QuizPapeleria.Modelo.Cliente;
import com.example.QuizPapeleria.Repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServicioImpl implements ClienteServicio {

    @Autowired
    private ClienteRepositorio repositorio;

    @Override
    public Cliente guardarCliente(Cliente cliente) {
        return repositorio.save(cliente);
    }

    @Override
    public List<Cliente> obtenerTodos() {
        return repositorio.findAll();
    }

    @Override
    public Optional<Cliente> obtenerPorId(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public Cliente actualizarCliente(Long id, Cliente cliente) {
        if (repositorio.existsById(id)) {
            cliente.setIdCliente(id);
            return repositorio.save(cliente);
        }
        return null;
    }

    @Override
    public void eliminarCliente(Long id) {
        repositorio.deleteById(id);
    }
}
