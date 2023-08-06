package br.com.hellopet.domain.customer.entity;

import br.com.hellopet.domain.business.entity.ProcedimentoAgendamento;
import br.com.hellopet.domain.core.entity.Endereco;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class Tutor {
    private Long id;
    private String cpf;
    private String nome;
    private String email;
    private String telefone;
    private String celular;
    private Endereco endereco;
    private LocalDate dataCadastro;
    private Boolean ativo;
    private List<Pet> pets;
    private List<ProcedimentoAgendamento> agendamentos;
}
