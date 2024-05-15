package br.correa.m1s9.controllers;

import br.correa.m1s9.entities.Bibliotecario;
import br.correa.m1s9.entities.Visitante;
import br.correa.m1s9.services.BibliotecarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bibliotecarios")
public class BibliotecarioController {

    private final BibliotecarioService bibliotecarioService;

    @PostMapping
    public Bibliotecario post(@RequestBody Bibliotecario bibliotecario){
        return bibliotecarioService.create(bibliotecario);
    }

    @GetMapping
    public List<Bibliotecario> getAll(){
        return bibliotecarioService.findAll();
    }
}
