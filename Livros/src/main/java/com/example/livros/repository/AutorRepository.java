package com.example.livros.repository;

import com.example.livros.model.Autor;
import com.sun.xml.bind.v2.schemagen.episode.SchemaBindings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {
    public List<Autor> findByPrimeiroNomeContaining(String nome);

}
