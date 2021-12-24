package com.example.livros.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@Entity
public class Editora implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(nullable = false)
    private String nome;

    @OneToMany(mappedBy = "editora", cascade = CascadeType.ALL)
    private Collection<Livro> livros;

    //List<Livro> livros = new ArrayList<>();

}
