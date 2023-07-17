package br.com.hellopet.entities.core;

import br.com.hellopet.entities.core.enums.UnidadeFederacao;

public record Endereco(
        String cep,
        String logradouro,
        String numero,
        String bairro,
        String complemento,
        String cidade,
        UnidadeFederacao uf
) {
}
