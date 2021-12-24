package com.example.livros.service;

import com.example.livros.model.Autor;
import com.example.livros.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public void adicionaAutor(Autor nome) {
        autorRepository.save(nome);
    }

    public List<Autor> buscarAutores(String nome) {
        return (nome != null) ? autorRepository.findByPrimeiroNomeContaining(nome) : autorRepository.findAll();
    }

    public void deleteAutor(int id){
        autorRepository.deleteById(id);
    }

}




