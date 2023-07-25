package br.com.hellopet.entities.business.enums;

import lombok.Getter;

@Getter
public enum ProcedimentoStatus {
    ATIVO(1),
    CONCLUIDO(2),
    CANCELADO(3);

    private final int id;

    private ProcedimentoStatus(int id) {
        this.id = id;
    }
}