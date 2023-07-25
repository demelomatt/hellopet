package br.com.hellopet.entities.business;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public final class Procedimento {
    private Long id;
    private ProcedimentoTipo procedimentoTipo;
    private Estabelecimento estabelecimento;
    private BigDecimal valor;
    private Integer duracaoMinutos;
    private List<ProcedimentoAgendamento> agendamentos;
}
