package com.example.QuizPapeleria.Repositorio;

import com.example.QuizPapeleria.Modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
}
