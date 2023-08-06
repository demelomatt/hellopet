package br.com.hellopet.domain.business.entity;

import lombok.Data;

import java.util.List;

@Data
public class ProcedimentoGrupo {
    private Long id;
    private String grupo;
    private ProcedimentoCategoria categoria;
    private List<ProcedimentoTipo> procedimentoTipos;
    private List<Profissional> profissionais;
}
