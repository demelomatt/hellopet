package br.com.hellopet.entities.business.enums;

import lombok.Getter;

@Getter
public enum ProcedimentoCategoria {
    CONSULTA(0),
    EXAME(1),
    CIRURGIA(2),
    VACINA(3);

    private final int id;

    private ProcedimentoCategoria(int id) {
        this.id = id;
    }
}
