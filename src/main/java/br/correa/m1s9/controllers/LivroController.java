package br.correa.m1s9.controllers;

import br.correa.m1s9.entities.Livro;
import br.correa.m1s9.services.LivroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
@RequiredArgsConstructor
public class LivroController {

    private final LivroService livroService;

    @PostMapping
    public Livro post(@RequestBody Livro livro){
        return livroService.create(livro);
    }

    @GetMapping
    public List<Livro> get(){
        return livroService.findAll();
    }

}
