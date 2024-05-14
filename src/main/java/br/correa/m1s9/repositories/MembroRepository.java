package br.correa.m1s9.repositories;

import br.correa.m1s9.entities.Membro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembroRepository extends JpaRepository<Membro, Long> {
}
