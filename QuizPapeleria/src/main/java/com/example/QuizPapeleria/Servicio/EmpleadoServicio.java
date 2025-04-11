package com.example.QuizPapeleria.Servicio;

import com.example.QuizPapeleria.Modelo.Empleado;
import java.util.List;
import java.util.Optional;

public interface EmpleadoServicio {
    List<Empleado> obtenerTodos();
    Optional<Empleado> obtenerPorId(Long id);
    Empleado guardar(Empleado empleado);
    void eliminar(Long id);
}