package br.correa.m1s9.controllers;

import br.correa.m1s9.entities.Emprestimo;
import br.correa.m1s9.entities.dto.EmprestimoDTO;
import br.correa.m1s9.exceptions.NotFoundException;
import br.correa.m1s9.services.EmprestimoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/emprestimos")
public class EmprestimoController {

    private final EmprestimoService emprestimoService;

    @PostMapping
    public Emprestimo post(@RequestBody EmprestimoDTO dto){
        return emprestimoService.create(dto);
    }
}
