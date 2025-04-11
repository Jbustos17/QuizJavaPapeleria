package com.example.QuizPapeleria.Repositorio;

import com.example.QuizPapeleria.Modelo.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DetalleVentaRepositorio extends JpaRepository<DetalleVenta, Long> {


    @Query("SELECT d FROM DetalleVenta d JOIN FETCH d.venta v JOIN FETCH v.cliente")
    List<DetalleVenta> findAllDetallesConClientes();
}