    package com.example.QuizPapeleria.Servicio;

    import com.example.QuizPapeleria.Modelo.Venta;
    import com.example.QuizPapeleria.Repositorio.VentaRepositorio;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import java.time.LocalDate;
    import java.util.List;
    import java.util.Optional;

    @Service
    public class VentaServicioImpl implements VentaServicio {

        @Autowired
        private VentaRepositorio ventaRepositorio;

        @Override
        public List<Venta> listarVentas() {
            return ventaRepositorio.findAll();
        }

        @Override
        public Optional<Venta> obtenerVentaPorId(Long id) {
            return ventaRepositorio.findById(id);
        }

        @Override
        public Venta guardarVenta(Venta venta) {
            return ventaRepositorio.save(venta);
        }

        @Override
        public Venta actualizarVenta(Long id, Venta venta) {
            if (ventaRepositorio.existsById(id)) {
                venta.setIdVenta(id);
                return ventaRepositorio.save(venta);
            }
            return null;
        }

        @Override
        public void eliminarVenta(Long id) {
            ventaRepositorio.deleteById(id);
        }

        @Override
        public List<Venta> obtenerVentasPorEmpleado(Long empleadoId) {
            return ventaRepositorio.findVentasByEmpleadoWithClientes(empleadoId);
        }

        @Override
        public List<Venta> obtenerVentasPorEmpleadoYFecha(Long empleadoId, LocalDate fecha) {
            return ventaRepositorio.findVentasByEmpleadoAndFecha(empleadoId, fecha);
        }
    }
