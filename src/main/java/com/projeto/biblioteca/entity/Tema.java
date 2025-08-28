package com.projeto.biblioteca.entity;

import com.projeto.biblioteca.enums.ClassificacaoIndicadaEnum;
import com.projeto.biblioteca.enums.PublicoAlvoEnum;
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
@Table(name = "TEMA")
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TEMA")
    @SequenceGenerator(name = "SEQ_TEMA", initialValue = 1, sequenceName = "SEQ_TEMA")
    @Column(name = "ID_TEMA")
    private Long id;

    @Column(name = "NOME_TEMA", nullable = false, unique = true)
    private String nomeTema;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    @Column(name = "PUBLICO_ALVO", nullable = false)
    @Enumerated(EnumType.STRING)
    private PublicoAlvoEnum publicoAlvoEnum;

    @Column(name = "CLASSIFICACAO_INDICADA")
    @Enumerated(EnumType.STRING)
    private ClassificacaoIndicadaEnum classificacaoIndicadaEnum;

    @OneToMany(mappedBy = "tema", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Livro> livro;

}
