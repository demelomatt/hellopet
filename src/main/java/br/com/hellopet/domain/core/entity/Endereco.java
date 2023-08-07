package br.com.hellopet.domain.core.entity;

import br.com.hellopet.domain.core.entity.enums.UnidadeFederacao;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Endereco {
    @Size(min = 8, max = 8)
    private String cep;

    private String logradouro;
    private String numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private UnidadeFederacao uf;
}
