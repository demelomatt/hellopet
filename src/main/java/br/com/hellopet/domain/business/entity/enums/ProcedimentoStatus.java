package br.com.hellopet.domain.business.entity.enums;

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

    public static ProcedimentoStatus fromId(int id) {
        for (ProcedimentoStatus status : values()) {
            if (status.getId() == id) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid Status id: " + id);
    }
}