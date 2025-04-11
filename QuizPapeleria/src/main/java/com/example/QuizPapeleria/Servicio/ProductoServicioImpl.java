package com.example.QuizPapeleria.Servicio;

import com.example.QuizPapeleria.Modelo.Producto;
import com.example.QuizPapeleria.Repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServicioImpl implements ProductoServicio {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Override
    public List<Producto> listarProductos() {
        return productoRepositorio.findAll();
    }

    @Override
    public Optional<Producto> obtenerPorId(Long id) {
        return productoRepositorio.findById(id);
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return productoRepositorio.save(producto);
    }

    @Override
    public Producto actualizarProducto(Long id, Producto producto) {
        if (productoRepositorio.existsById(id)) {
            producto.setIdProducto(id);
            return productoRepositorio.save(producto);
        }
        return null;
    }

    @Override
    public void eliminarProducto(Long id) {
        productoRepositorio.deleteById(id);
    }

    @Override
    public List<Producto> productosPorProveedor(Long proveedorId) {
        return productoRepositorio.findProductosByProveedorId(proveedorId);
    }
}
