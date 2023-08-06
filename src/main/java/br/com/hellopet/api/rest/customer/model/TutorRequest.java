package br.com.hellopet.api.rest.customer.model;

import br.com.hellopet.api.rest.core.model.EnderecoRequest;

import java.time.LocalDate;

public record TutorRequest(
        Long id,
        String cpf,
        String nome,
        String email,
        String telefone,
        String celular,
        EnderecoRequest endereco,
        LocalDate dataCadastro,
        Boolean ativo
) {
}
