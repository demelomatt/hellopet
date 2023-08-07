package br.com.hellopet.api.rest.customer.model;

import br.com.hellopet.api.rest.core.model.EnderecoRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record TutorUpdateRequest(
        @NotNull Long id,
        String cpf,
        String nome,
        String email,
        String telefone,
        String celular,
        @Valid EnderecoRequest endereco,
        Boolean ativo
) {
}
