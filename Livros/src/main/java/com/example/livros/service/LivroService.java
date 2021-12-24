package com.example.livros.service;

import com.example.livros.model.Autor;
import com.example.livros.model.Livro;
import com.example.livros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    LivroRepository livroRepository;

    public void adicionaLivro(Livro nome) {
        livroRepository.save(nome);
    }

    public List<Livro> buscaLivros(String nome) {
        return (nome != null) ? livroRepository.findBytituloContaining(nome) : livroRepository.findAll();
    }

    public void delete(int id){
        livroRepository.deleteById(id);
    }

}
