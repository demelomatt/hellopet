package br.com.hellopet.entities.vet;

import java.math.BigDecimal;

public record Procedimento(
        ProcedimentoTipo procedimentoTipo,
        Clinica clinica,
        BigDecimal valor,
        Integer duracaoMinutos
)
{
}
