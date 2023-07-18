package br.com.hellopet.entities.business.enums;

import lombok.Getter;

@Getter
public enum ProcedimentoStatus {
    ATIVO(0),
    CONCLUIDO(1),
    CANCELADO(2);

    private final int id;

    private ProcedimentoStatus(int id) {
        this.id = id;
    }
}