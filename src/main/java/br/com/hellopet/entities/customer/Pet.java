package br.com.hellopet.entities.customer;

import br.com.hellopet.entities.core.enums.Genero;
import br.com.hellopet.entities.customer.enums.Especie;

import java.time.LocalDate;

public record Pet(
        Long id,
        Especie especie,
        String numeroIdentificacao,
        String nome,
        Genero genero,
        LocalDate dataNascimento,
        Double peso,
        Boolean castrado,
        Boolean ativo
) {
}