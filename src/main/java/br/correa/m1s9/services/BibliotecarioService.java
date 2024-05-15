package br.correa.m1s9.services;

import br.correa.m1s9.entities.Bibliotecario;
import br.correa.m1s9.entities.Visitante;
import br.correa.m1s9.repositories.BibliotecarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BibliotecarioService {

    private final BibliotecarioRepository bibliotecarioRepository;

    public Bibliotecario create(Bibliotecario bibliotecario){
        return bibliotecarioRepository.save(bibliotecario);
    }

    public List<Bibliotecario> findAll(){
        return bibliotecarioRepository.findAll();
    }
}
