package br.com.hellopet.domain.core.entity;

import br.com.hellopet.domain.core.entity.enums.UnidadeFederacao;
import lombok.Data;

@Data
public class Municipio {
    private Long id;
    private String nome;
    private UnidadeFederacao uf;
    private Integer ibge;
}