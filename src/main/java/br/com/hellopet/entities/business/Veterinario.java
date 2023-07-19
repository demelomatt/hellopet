package br.com.hellopet.entities.business;

import br.com.hellopet.entities.core.Endereco;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class Veterinario {
    private Long id;
    private String cpf;
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
}
