package com.example.QuizPapeleria.Repositorio;

import com.example.QuizPapeleria.Modelo.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface VentaRepositorio extends JpaRepository<Venta, Long> {


    @Query("SELECT v FROM Venta v JOIN FETCH v.cliente WHERE v.empleado.id = :empleadoId")
    List<Venta> findVentasByEmpleadoWithClientes(@Param("empleadoId") Long empleadoId);


    @Query("SELECT v FROM Venta v WHERE v.empleado.id = :empleadoId AND v.fecha = :fecha")
    List<Venta> findVentasByEmpleadoAndFecha(@Param("empleadoId") Long empleadoId, @Param("fecha") LocalDate fecha);
}
