package br.com.hellopet.entities.core;

import br.com.hellopet.entities.core.enums.UnidadeFederacao;
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
