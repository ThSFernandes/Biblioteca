package com.projeto.biblioteca.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PublicoAlvoEnum {
    INFANTIL("Voltado para crianças"),
    JUVENIL("Voltado para adolescentes"),
    ADULTO("Voltado para adultos"),
    ACADEMICO("Conteúdo técnico/científico"),
    GERAL("Indicado para todos os públicos");

    private final String descricao;

}
