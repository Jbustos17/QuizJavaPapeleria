package com.example.QuizPapeleria.Servicio;

import com.example.QuizPapeleria.Modelo.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoServicio {
    List<Producto> listarProductos();
    Optional<Producto> obtenerPorId(Long id);
    Producto guardarProducto(Producto producto);
    Producto actualizarProducto(Long id, Producto producto);
    void eliminarProducto(Long id);

    List<Producto> productosPorProveedor(Long proveedorId);
}
