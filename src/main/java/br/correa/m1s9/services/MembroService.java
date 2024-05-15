package br.correa.m1s9.services;

import br.correa.m1s9.entities.Livro;
import br.correa.m1s9.entities.Membro;
import br.correa.m1s9.exceptions.NotFoundException;
import br.correa.m1s9.repositories.MembroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MembroService {

    private final MembroRepository membroRepository;

    public Membro create(Membro membro){
        return membroRepository.save(membro);
    }

    public List<Membro> findAll(){
        return membroRepository.findAll();
    }

    public Membro findById(Long id) throws NotFoundException {

        return membroRepository.findById(id).orElseThrow(
                ()-> new NotFoundException(String.format(
                        "Membro com id: %d não inexistente.",
                        id
                )
                )
        );
    }


}
