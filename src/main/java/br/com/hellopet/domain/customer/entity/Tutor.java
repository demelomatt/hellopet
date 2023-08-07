package br.com.hellopet.domain.customer.entity;

import br.com.hellopet.domain.business.entity.ProcedimentoAgendamento;
import br.com.hellopet.domain.core.entity.Endereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.util.List;

@Data
public class Tutor {

    private Long id;

    @CPF
    private String cpf;

    private String nome;

    @Email
    private String email;

    @Size(min = 10, max = 10)
    private String telefone;

    @Size(min = 11, max = 11)
    private String celular;

    @Valid
    private Endereco endereco;

    private LocalDate dataCadastro;

    private Boolean ativo;

    private List<Pet> pets;

    private List<ProcedimentoAgendamento> agendamentos;
}
