package com.example.livros.service;

import com.example.livros.model.Editora;
import com.example.livros.model.Livro;
import com.example.livros.repository.EditoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditoraService {

    @Autowired
    EditoraRepository editoraRepository;

    public void adicionaEditora(Editora editora) {
        editoraRepository.save(editora);
    }

    public List<Editora> buscarEditora(String nome) {
        return (nome != null) ? editoraRepository.findBynomeContaining(nome) : editoraRepository.findAll();
    }

    public void deletaEditora(int id){
        editoraRepository.deleteById(id);
    }

}
