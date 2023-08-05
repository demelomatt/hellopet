package br.com.hellopet.entities.customer;

import br.com.hellopet.entities.business.Estabelecimento;
import br.com.hellopet.entities.business.ProcedimentoAgendamento;
import br.com.hellopet.entities.core.Endereco;
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
