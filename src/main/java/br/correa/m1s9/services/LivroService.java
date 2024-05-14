package br.correa.m1s9.services;

import br.correa.m1s9.entities.Livro;
import br.correa.m1s9.exceptions.NotFoundException;
import br.correa.m1s9.repositories.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LivroService {

    private final LivroRepository livroRepository;

    public Livro create(Livro livro){
        return livroRepository.save(livro);
    }

    public Livro findById(Long id) throws NotFoundException {

        return livroRepository.findById(id).orElseThrow(
                ()-> new NotFoundException(String.format(
                        "Livro com id: %d não inexistente.",
                        id
                )
                )
    );
    }

}
