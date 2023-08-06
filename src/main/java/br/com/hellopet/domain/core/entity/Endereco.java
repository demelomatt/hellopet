package br.com.hellopet.domain.core.entity;

import br.com.hellopet.domain.core.entity.enums.UnidadeFederacao;
import lombok.Data;

@Data
public class Endereco {
    private String cep;
    private String endereco;
    private String numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private UnidadeFederacao uf;
}
