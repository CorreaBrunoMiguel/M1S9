package br.correa.m1s9.services;

import br.correa.m1s9.entities.Visitante;
import br.correa.m1s9.repositories.VisitanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitanteService {

    private final VisitanteRepository visitanteRepository;

    public Visitante create(Visitante visitante){
        return visitanteRepository.save(visitante);
    }

    public List<Visitante> findAll(){
        return visitanteRepository.findAll();
    }
}
