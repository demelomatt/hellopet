package br.com.hellopet.domain.business.entity;

import lombok.Data;

import java.util.List;

@Data
public class ProcedimentoCategoria {
    private Long id;
    private String categoria;
    private List<ProcedimentoGrupo> procedimentoGrupos;
}
