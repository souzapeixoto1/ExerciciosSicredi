package com.example.livros.controllers;

import com.example.livros.model.Autor;
import com.example.livros.model.Editora;
import com.example.livros.repository.AutorRepository;
import com.example.livros.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @Autowired
    private AutorRepository autorRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void adicionarAutor(@RequestBody Autor autor){
       autorService.adicionaAutor(autor);
    }

    @GetMapping()
    public List<Autor> listarAutores(@RequestParam(required = false) String nome){
        return autorService.buscarAutores(nome);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deletaLivro(@PathVariable int id) {
        autorRepository.deleteById(id);
    }
}
