package br.correa.m1s9.repositories;

import br.correa.m1s9.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
