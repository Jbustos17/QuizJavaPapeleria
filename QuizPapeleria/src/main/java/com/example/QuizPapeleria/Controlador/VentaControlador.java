package com.example.QuizPapeleria.Controlador;

import com.example.QuizPapeleria.Modelo.Venta;
import com.example.QuizPapeleria.Servicio.VentaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ventas")
public class VentaControlador {

    @Autowired
    private VentaServicio ventaServicio;

    @GetMapping
    public List<Venta> listarVentas() {
        return ventaServicio.listarVentas();
    }

    @GetMapping("/{id}")
    public Optional<Venta> obtenerVenta(@PathVariable Long id) {
        return ventaServicio.obtenerVentaPorId(id);
    }

    @PostMapping
    public Venta guardarVenta(@RequestBody Venta venta) {
        return ventaServicio.guardarVenta(venta);
    }

    @PutMapping("/{id}")
    public Venta actualizarVenta(@PathVariable Long id, @RequestBody Venta venta) {
        return ventaServicio.actualizarVenta(id, venta);
    }

    @DeleteMapping("/{id}")
    public void eliminarVenta(@PathVariable Long id) {
        ventaServicio.eliminarVenta(id);
    }

    @GetMapping("/empleado/{empleadoId}")
    public List<Venta> obtenerVentasPorEmpleado(@PathVariable Long empleadoId) {
        return ventaServicio.obtenerVentasPorEmpleado(empleadoId);
    }

    @GetMapping("/empleado/{empleadoId}/fecha/{fecha}")
    public List<Venta> obtenerVentasPorEmpleadoYFecha(@PathVariable Long empleadoId, @PathVariable String fecha) {
        return ventaServicio.obtenerVentasPorEmpleadoYFecha(empleadoId, LocalDate.parse(fecha));
    }
}
