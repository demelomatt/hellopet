package br.com.hellopet.entities.core;

import br.com.hellopet.entities.core.enums.UnidadeFederacao;
import lombok.Data;

@Data
public class Municipio {
    private Long id;
    private String nome;
    private UnidadeFederacao uf;
    private Integer ibge;
}