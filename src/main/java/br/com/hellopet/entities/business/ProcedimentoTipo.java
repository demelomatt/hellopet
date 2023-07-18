package br.com.hellopet.entities.business;

import br.com.hellopet.entities.business.enums.ProcedimentoCategoria;

public record ProcedimentoTipo(
        Long id,
        ProcedimentoCategoria categoria,
        String nome
) {
}
