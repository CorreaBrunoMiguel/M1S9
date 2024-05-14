package br.correa.m1s9.repositories;

import br.correa.m1s9.entities.Visitante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitanteRepository extends JpaRepository<Visitante, Long> {
}
