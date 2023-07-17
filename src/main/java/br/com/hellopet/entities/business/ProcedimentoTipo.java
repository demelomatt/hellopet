package br.com.hellopet.entities.business;

import br.com.hellopet.entities.business.enums.ProcedimentoCategoria;

public record ProcedimentoTipo(
        ProcedimentoCategoria categoria,
        String nome
) {
}
