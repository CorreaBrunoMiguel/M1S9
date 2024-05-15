package br.correa.m1s9.services;

import br.correa.m1s9.entities.Emprestimo;
import br.correa.m1s9.entities.Livro;
import br.correa.m1s9.entities.Membro;
import br.correa.m1s9.entities.dto.EmprestimoDTO;
import br.correa.m1s9.exceptions.NotFoundException;
import br.correa.m1s9.repositories.EmprestimoRepository;
import br.correa.m1s9.repositories.LivroRepository;
import br.correa.m1s9.repositories.MembroRepository;
import br.correa.m1s9.repositories.VisitanteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmprestimoService {

    private final EmprestimoRepository emprestimoRepository;
    private final LivroRepository livroRepository;
    private final MembroRepository membroRepository;

    public Emprestimo create(EmprestimoDTO dto){

        Livro livro = livroRepository.findById(dto.livro_id()).get();
        Membro membro = membroRepository.findById(dto.membro_id()).get();

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setLivro(livro);
        emprestimo.setMembro(membro);
        emprestimo.setDataEmprestimo(LocalDate.now());
        emprestimo.setDataDevolucao(emprestimo.getDataEmprestimo().plusDays(7));

        return emprestimoRepository.save(emprestimo);
    }

    public List<Emprestimo> findAll(){
        return emprestimoRepository.findAll();
    }
}
