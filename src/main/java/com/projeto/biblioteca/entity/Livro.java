package com.projeto.biblioteca.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "LIVRO")
@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_LIVRO")
    @SequenceGenerator(name = "SEQ_LIVRO", initialValue = 1, sequenceName = "SEQ_LIVRO")
    @Column(name = "ID_LIVRO")
    private Long id;

    @Column(name = "TITULO", nullable = false)
    private String titulo;

    @Column(name = "NUMERO_EDICAO", nullable = false)
    private Integer numeroEdicao;

    @Column(name = "EDITORA", nullable = false)
    private String editora;

    @Column(name = "ISBN", nullable = false)
    private Long isbn;

    @Column(name = "NUMERO_PAGINAS", nullable = false)
    private Integer numeroPaginas;

    @Column(name = "IDIOMA", nullable = false)
    private String idioma;

    @Column(name = "ANO_PUBLICACAO",nullable = false)
    private LocalDate anoPublicacao;

    @Column(name = "GENERO", nullable = false)
    private String genero;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUTOR_ID", referencedColumnName = "AUTOR_ID")
    private Autor autor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ESTANDE_ID", referencedColumnName = "ESTANDE_ID")
    private Estande estande;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEMA_ID", referencedColumnName = "TEMA_ID")
    private Tema tema;

}
