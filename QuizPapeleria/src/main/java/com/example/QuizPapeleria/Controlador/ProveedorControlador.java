package com.example.QuizPapeleria.Controlador;

import com.example.QuizPapeleria.Modelo.Proveedor;
import com.example.QuizPapeleria.Servicio.ProveedorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorControlador {

    @Autowired
    private ProveedorServicio proveedorServicio;

    @GetMapping
    public List<Proveedor> listarProveedores() {
        return proveedorServicio.listarProveedores();
    }

    @GetMapping("/{id}")
    public Optional<Proveedor> obtenerPorId(@PathVariable Long id) {
        return proveedorServicio.obtenerProveedorPorId(id);
    }

    @PostMapping
    public Proveedor guardar(@RequestBody Proveedor proveedor) {
        return proveedorServicio.guardarProveedor(proveedor);
    }

    @PutMapping("/{id}")
    public Proveedor actualizar(@PathVariable Long id, @RequestBody Proveedor proveedor) {
        return proveedorServicio.actualizarProveedor(id, proveedor);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        proveedorServicio.eliminarProveedor(id);
    }
}
