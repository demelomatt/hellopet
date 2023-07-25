package br.com.hellopet.entities.business;

import lombok.Data;

import java.util.List;

@Data
public class ProcedimentoTipo {
    private Long id;
    private String tipo;
    private ProcedimentoGrupo grupo;
    private List<Procedimento> procedimentos;
}
