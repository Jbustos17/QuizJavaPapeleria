package com.example.QuizPapeleria.Servicio;

import com.example.QuizPapeleria.Modelo.DetalleVenta;
import com.example.QuizPapeleria.Repositorio.DetalleVentaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleVentaServicioImpl implements DetalleVentaServicio {

    @Autowired
    private DetalleVentaRepositorio detalleVentaRepositorio;

    @Override
    public List<DetalleVenta> listarDetalles() {
        return detalleVentaRepositorio.findAll();
    }

    @Override
    public Optional<DetalleVenta> obtenerPorId(Long id) {
        return detalleVentaRepositorio.findById(id);
    }

    @Override
    public DetalleVenta guardar(DetalleVenta detalleVenta) {
        return detalleVentaRepositorio.save(detalleVenta);
    }

    @Override
    public DetalleVenta actualizar(Long id, DetalleVenta detalleVenta) {
        if (detalleVentaRepositorio.existsById(id)) {
            detalleVenta.setIdDetalle(id);
            return detalleVentaRepositorio.save(detalleVenta);
        }
        return null;
    }

    @Override
    public void eliminar(Long id) {
        detalleVentaRepositorio.deleteById(id);
    }

    @Override
    public List<DetalleVenta> listarDetallesConClientes() {
        return detalleVentaRepositorio.findAllDetallesConClientes();
    }
}
