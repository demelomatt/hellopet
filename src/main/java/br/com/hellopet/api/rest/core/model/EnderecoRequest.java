package br.com.hellopet.api.rest.core.model;

public record EnderecoRequest(
        String cep,
        String endereco,
        String numero,
        String bairro,
        String complemento,
        String cidade,
        String uf
) {
}
