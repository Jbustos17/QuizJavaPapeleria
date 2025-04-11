package com.example.QuizPapeleria.Servicio;

import com.example.QuizPapeleria.Modelo.DetalleVenta;

import java.util.List;
import java.util.Optional;

public interface DetalleVentaServicio {
    List<DetalleVenta> listarDetalles();
    Optional<DetalleVenta> obtenerPorId(Long id);
    DetalleVenta guardar(DetalleVenta detalleVenta);
    DetalleVenta actualizar(Long id, DetalleVenta detalleVenta);
    void eliminar(Long id);

    List<DetalleVenta> listarDetallesConClientes();
}
