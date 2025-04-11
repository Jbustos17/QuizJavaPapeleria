package com.example.QuizPapeleria.Controlador;

import com.example.QuizPapeleria.Modelo.Empleado;
import com.example.QuizPapeleria.Servicio.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoControlador {

    @Autowired
    private EmpleadoServicio empleadoServicio;

    // Crear empleado
    @PostMapping
    public Empleado crearEmpleado(@RequestBody Empleado empleado) {
        return empleadoServicio.guardar(empleado);
    }

    // Obtener todos los empleados
    @GetMapping
    public List<Empleado> obtenerTodos() {
        return empleadoServicio.obtenerTodos();
    }


    @GetMapping("/{id}")
    public Empleado obtenerPorId(@PathVariable Long id) {
        return empleadoServicio.obtenerPorId(id)
                .orElseThrow(() -> new RuntimeException("Empleado no encontrado con ID: " + id));
    }

    // Actualizar un empleado
    @PutMapping("/{id}")
    public Empleado actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado empleado) {
        empleado.setIdEmpleado(id);
        return empleadoServicio.guardar(empleado);
    }

    // Eliminar un empleado
    @DeleteMapping("/{id}")
    public void eliminarEmpleado(@PathVariable Long id) {
        empleadoServicio.eliminar(id);
    }
}
