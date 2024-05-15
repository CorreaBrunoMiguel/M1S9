package br.correa.m1s9.controllers;

import br.correa.m1s9.entities.Visitante;
import br.correa.m1s9.services.VisitanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/visitantes")
public class VisitanteController {

    private final VisitanteService visitanteService;

    @PostMapping
    public Visitante post(@RequestBody Visitante visitante){
        return visitanteService.create(visitante);
    }

    @GetMapping
    public List<Visitante> getAll(){
        return visitanteService.findAll();
    }
}
