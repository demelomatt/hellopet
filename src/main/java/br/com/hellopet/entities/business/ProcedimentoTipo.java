package br.com.hellopet.entities.business;

import br.com.hellopet.entities.business.enums.ProcedimentoCategoria;
import lombok.Data;

@Data
public class ProcedimentoTipo {
    private Long id;
    private ProcedimentoCategoria categoria;
    private String nome;
}
