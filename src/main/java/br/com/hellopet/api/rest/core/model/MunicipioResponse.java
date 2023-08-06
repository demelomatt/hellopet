package br.com.hellopet.api.rest.core.model;

public record MunicipioResponse(
        Long id,
        String nome,
        String uf,
        Integer ibge
) {
}
