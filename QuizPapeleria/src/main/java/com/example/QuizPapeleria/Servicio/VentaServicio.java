package com.example.QuizPapeleria.Servicio;

import com.example.QuizPapeleria.Modelo.Venta;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface VentaServicio {
    List<Venta> listarVentas();
    Optional<Venta> obtenerVentaPorId(Long id);
    Venta guardarVenta(Venta venta);
    Venta actualizarVenta(Long id, Venta venta);
    void eliminarVenta(Long id);

    List<Venta> obtenerVentasPorEmpleado(Long empleadoId);
    List<Venta> obtenerVentasPorEmpleadoYFecha(Long empleadoId, LocalDate fecha);
}
