package com.example.QuizPapeleria.Controlador;

import com.example.QuizPapeleria.Modelo.DetalleVenta;
import com.example.QuizPapeleria.Servicio.DetalleVentaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/detalles")
public class DetalleVentaControlador {

    @Autowired
    private DetalleVentaServicio detalleVentaServicio;

    @GetMapping
    public List<DetalleVenta> listar() {
        return detalleVentaServicio.listarDetalles();
    }

    @GetMapping("/{id}")
    public Optional<DetalleVenta> obtener(@PathVariable Long id) {
        return detalleVentaServicio.obtenerPorId(id);
    }

    @PostMapping
    public DetalleVenta guardar(@RequestBody DetalleVenta detalleVenta) {
        return detalleVentaServicio.guardar(detalleVenta);
    }

    @PutMapping("/{id}")
    public DetalleVenta actualizar(@PathVariable Long id, @RequestBody DetalleVenta detalleVenta) {
        return detalleVentaServicio.actualizar(id, detalleVenta);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        detalleVentaServicio.eliminar(id);
    }

    @GetMapping("/clientes")
    public List<DetalleVenta> listarConClientes() {
        return detalleVentaServicio.listarDetallesConClientes();
    }
}
