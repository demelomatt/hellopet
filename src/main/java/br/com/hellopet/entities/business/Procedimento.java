package br.com.hellopet.entities.business;

import lombok.Data;

import java.math.BigDecimal;

@Data
public final class Procedimento {
    private Long id;
    private ProcedimentoTipo procedimentoTipo;
    private Clinica clinica;
    private BigDecimal valor;
    private Integer duracaoMinutos;
}
