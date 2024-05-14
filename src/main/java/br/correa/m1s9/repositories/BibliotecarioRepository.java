package br.correa.m1s9.repositories;

import br.correa.m1s9.entities.Bibliotecario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecarioRepository extends JpaRepository<Bibliotecario, Long> {
}
