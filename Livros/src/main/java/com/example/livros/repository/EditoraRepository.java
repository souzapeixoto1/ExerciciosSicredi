package com.example.livros.repository;

import com.example.livros.model.Editora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Integer> {
    public List<Editora> findBynomeContaining(String nome);
}
