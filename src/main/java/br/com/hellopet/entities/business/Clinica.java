package br.com.hellopet.entities.business;

import br.com.hellopet.entities.core.Endereco;
import lombok.Data;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Data
public class Clinica {
    private Long id;
    private String cnpj;
    private String nome;
    private Endereco endereco;
    private String email;
    private String telefone;
    private String celular;
    private LocalDate dataFundacao;
    private LocalDate dataCadastro;
    private LocalTime horarioAbertura;
    private LocalTime horarioFechamento;
    private Set<DayOfWeek> diasFuncionamento;
    private Boolean ativo;
}
