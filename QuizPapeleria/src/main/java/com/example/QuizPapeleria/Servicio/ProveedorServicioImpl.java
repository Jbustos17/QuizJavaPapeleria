package com.example.QuizPapeleria.Servicio;

import com.example.QuizPapeleria.Modelo.Proveedor;
import com.example.QuizPapeleria.Repositorio.ProveedorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorServicioImpl implements ProveedorServicio {

    @Autowired
    private ProveedorRepositorio proveedorRepositorio;

    @Override
    public List<Proveedor> listarProveedores() {
        return proveedorRepositorio.findAll();
    }

    @Override
    public Optional<Proveedor> obtenerProveedorPorId(Long id) {
        return proveedorRepositorio.findById(id);
    }

    @Override
    public Proveedor guardarProveedor(Proveedor proveedor) {
        return proveedorRepositorio.save(proveedor);
    }

    @Override
    public Proveedor actualizarProveedor(Long id, Proveedor proveedor) {
        if (proveedorRepositorio.existsById(id)) {
            proveedor.setIdProveedor(id);
            return proveedorRepositorio.save(proveedor);
        }
        return null;
    }

    @Override
    public void eliminarProveedor(Long id) {
        proveedorRepositorio.deleteById(id);
    }
}
