package com.example.QuizPapeleria.Repositorio;

import com.example.QuizPapeleria.Modelo.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepositorio extends JpaRepository<Proveedor, Long> {
}
