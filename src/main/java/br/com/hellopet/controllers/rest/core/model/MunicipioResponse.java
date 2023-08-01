package br.com.hellopet.controllers.rest.core.model;

public record MunicipioResponse(
        Long id,
        String nome,
        String uf,
        Integer ibge
) {
}
