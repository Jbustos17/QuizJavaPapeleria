package com.example.QuizPapeleria.Repositorio;

import com.example.QuizPapeleria.Modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductoRepositorio extends JpaRepository<Producto, Long> {


    @Query("SELECT p FROM Producto p WHERE p.proveedor.idProveedor = :proveedorId")
    List<Producto> findProductosByProveedorId(@Param("proveedorId") Long proveedorId);
}