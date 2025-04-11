package com.example.QuizPapeleria.Servicio;

import com.example.QuizPapeleria.Modelo.Proveedor;

import java.util.List;
import java.util.Optional;

public interface ProveedorServicio {
    List<Proveedor> listarProveedores();
    Optional<Proveedor> obtenerProveedorPorId(Long id);
    Proveedor guardarProveedor(Proveedor proveedor);
    Proveedor actualizarProveedor(Long id, Proveedor proveedor);
    void eliminarProveedor(Long id);
}
