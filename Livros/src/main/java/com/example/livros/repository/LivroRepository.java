package com.example.livros.repository;

import com.example.livros.model.Autor;
import com.example.livros.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {
    public List<Livro> findBytituloContaining(String nome);

}
