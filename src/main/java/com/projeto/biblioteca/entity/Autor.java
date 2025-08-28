package com.projeto.biblioteca.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "AUTOR")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_AUTOR")
    @SequenceGenerator(name = "SEQ_AUTOR", initialValue = 1, sequenceName = "SEQ_AUTOR")
    @Column(name = "AUTOR_ID")
    private Long id;

    @Column(name = "NOME_AUTOR", nullable = false)
    private String nomeAutor;

    @Column(name = "NACIONALIDADE", nullable = false)
    private String nacionalidade;

    @Column(name = "DATA_NASCIMENTO", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Livro> livros = new HashSet<>();
}
