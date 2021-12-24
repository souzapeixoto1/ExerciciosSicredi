package com.example.livros.controllers;

import com.example.livros.model.Livro;
import com.example.livros.repository.LivroRepository;
import com.example.livros.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;


@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @Autowired
    private LivroRepository livroRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionaLivro(@RequestBody Livro nome){
        livroService.adicionaLivro(nome);
    }

    @GetMapping()
    public List<Livro> buscaLivros(@RequestParam (required = false) String nome){
        return livroService.buscaLivros(nome);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deletaLivro(@PathVariable int id) {
        livroRepository.deleteById(id);
    }

}

