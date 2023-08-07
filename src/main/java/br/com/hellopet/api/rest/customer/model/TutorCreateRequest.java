package br.com.hellopet.api.rest.customer.model;

import br.com.hellopet.api.rest.core.model.EnderecoRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TutorCreateRequest(
        @NotNull String cpf,
        @NotBlank String nome,
        @NotNull String email,
        String telefone,
        String celular,
        @Valid EnderecoRequest endereco
) {
}
