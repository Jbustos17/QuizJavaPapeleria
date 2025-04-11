package com.example.QuizPapeleria.Servicio;

import com.example.QuizPapeleria.Modelo.Empleado;
import com.example.QuizPapeleria.Repositorio.EmpleadoRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServicioImpl implements EmpleadoServicio {

    private final EmpleadoRepositorio empleadoRepositorio;

    public EmpleadoServicioImpl(EmpleadoRepositorio empleadoRepositorio) {
        this.empleadoRepositorio = empleadoRepositorio;
    }

    @Override
    public List<Empleado> obtenerTodos() {
        return empleadoRepositorio.findAll();
    }

    @Override
    public Optional<Empleado> obtenerPorId(Long id) {
        return empleadoRepositorio.findById(id);
    }

    @Override
    public Empleado guardar(Empleado empleado) {
        return empleadoRepositorio.save(empleado);
    }

    @Override
    public void eliminar(Long id) {
        empleadoRepositorio.deleteById(id);
    }
}
