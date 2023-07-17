package br.com.hellopet.entities.vet;

import br.com.hellopet.entities.vet.enums.ProcedimentoCategoria;

public record ProcedimentoTipo(
        ProcedimentoCategoria categoria,
        String nome
) {
}
