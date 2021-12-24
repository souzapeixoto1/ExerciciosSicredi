package com.example.livros.controllers;

import com.example.livros.model.Editora;
import com.example.livros.repository.EditoraRepository;
import com.example.livros.repository.LivroRepository;
import com.example.livros.service.EditoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/editoras")
public class EditoraController {

    @Autowired
    private EditoraService editoraService;

    @Autowired
    private EditoraRepository editoraRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionarEditora(@RequestBody Editora nome){
        editoraService.adicionaEditora(nome);
    }

    @GetMapping()
    public List<Editora> listarEditoras(@RequestParam(required = false) String nome){
        return editoraService.buscarEditora(nome);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deletaEditora(@PathVariable int id) {
        editoraRepository.deleteById(id);
    }

}
