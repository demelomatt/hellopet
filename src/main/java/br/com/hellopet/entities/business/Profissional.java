package br.com.hellopet.entities.business;

import br.com.hellopet.entities.core.Endereco;
import br.com.hellopet.entities.customer.Especie;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
public class Profissional {
    private Long id;
    private String cpf;
    private String cfmv;
    private String crmv;
    private String nome;
    private String email;
    private String telefone;
    private String celular;
    private Endereco endereco;
    private LocalDate dataCadastro;
    private LocalTime inicioExpediente;
    private LocalTime fimExpediente;
    private LocalTime inicioIntervalo;
    private LocalTime fimIntervalo;
    private Boolean ativo;
    private List<ProcedimentoAgendamento> agendamentos;
    private List<Estabelecimento> estabelecimentos;
    private List<Especie> especies;
    private List<ProcedimentoGrupo> procedimentoGrupos;
}
