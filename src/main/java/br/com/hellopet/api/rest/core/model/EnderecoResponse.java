package br.com.hellopet.api.rest.core.model;

public record EnderecoResponse(
        String cep,
        String logradouro,
        String numero,
        String bairro,
        String complemento,
        String cidade,
        String uf
) {
}
