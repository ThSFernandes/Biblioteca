package com.projeto.biblioteca.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ESTANDE")
public class Estande {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ESTANDE")
    @SequenceGenerator(name = "SEQ_ESTANDE", initialValue = 1, sequenceName = "SEQ_ESTANDE")
    @Column(name = "ID_ESTANDE")
    private Long id;

    @Column(name = "CODIGO")
    private Long codigo;

    @Column(name = "LOCALIZACAO")
    private String localizacao;

    @Column(name = "DESCRICAO")
    private String descricao;

    @OneToMany(mappedBy = "estande", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Livro> livros;

}
