package br.correa.m1s9.controllers;

import br.correa.m1s9.entities.Membro;
import br.correa.m1s9.services.MembroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/membros")
public class MembroController {

    private final MembroService membroService;

    @PostMapping
    public Membro post(@RequestBody Membro membro){
        return membroService.create(membro);
    }
}
