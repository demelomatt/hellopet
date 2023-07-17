package br.com.hellopet.entities.tutor;

import br.com.hellopet.entities.core.Endereco;

import java.time.LocalDate;

public record Tutor(
        Long id,
        String cpf,
        String nome,
        String email,
        String telefone,
        String celular,
        Endereco endereco,
        LocalDate dataCadastro,
        Boolean ativo
) {
}
