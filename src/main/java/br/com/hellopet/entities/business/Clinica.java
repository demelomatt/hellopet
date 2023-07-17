package br.com.hellopet.entities.business;

import br.com.hellopet.entities.core.Endereco;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public record Clinica(
        Long id,
        String cnpj,
        String nome,
        Endereco endereco,
        String telefone,
        String celular,
        String email,
        LocalDate dataCadastro,
        LocalTime horarioAbertura,
        LocalTime horarioFechamento,
        Set<DayOfWeek> diasFuncionamento,
        Boolean ativo
) {
}
