package com.example.QuizPapeleria.Controlador;

import com.example.QuizPapeleria.Modelo.Producto;
import com.example.QuizPapeleria.Servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/productos")
public class ProductoControlador {

    @Autowired
    private ProductoServicio productoServicio;

    @GetMapping
    public List<Producto> listar() {
        return productoServicio.listarProductos();
    }

    @GetMapping("/{id}")
    public Optional<Producto> obtener(@PathVariable Long id) {
        return productoServicio.obtenerPorId(id);
    }

    @PostMapping
    public Producto guardar(@RequestBody Producto producto) {
        return productoServicio.guardarProducto(producto);
    }

    @PutMapping("/{id}")
    public Producto actualizar(@PathVariable Long id, @RequestBody Producto producto) {
        return productoServicio.actualizarProducto(id, producto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        productoServicio.eliminarProducto(id);
    }

    @GetMapping("/proveedor/{proveedorId}")
    public List<Producto> productosPorProveedor(@PathVariable Long proveedorId) {
        return productoServicio.productosPorProveedor(proveedorId);
    }
}
