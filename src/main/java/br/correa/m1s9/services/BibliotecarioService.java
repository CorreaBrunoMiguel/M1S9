package br.correa.m1s9.services;

import br.correa.m1s9.entities.Bibliotecario;
import br.correa.m1s9.repositories.BibliotecarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BibliotecarioService {

    private final BibliotecarioRepository bibliotecarioRepository;

    public Bibliotecario create(Bibliotecario bibliotecario){
        return bibliotecarioRepository.save(bibliotecario);
    }
}
