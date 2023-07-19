package br.com.hellopet.datasources.database.relational.business.model;

import br.com.hellopet.datasources.database.relational.core.model.EnderecoModel;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Entity
@Table(name = "VETERINARIO")
public class VeterinarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "crmv", nullable = false, unique = true)
    private String crmv;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "celular")
    private String celular;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDate dataCadastro;

    @Column(name = "inicio_expediente", nullable = false)
    private LocalTime inicioExpediente;

    @Column(name = "fim_expediente", nullable = false)
    private LocalTime fimExpediente;

    @Column(name = "inicio_intervalo", nullable = false)
    private LocalTime inicioIntervalo;

    @Column(name = "fim_intervalo", nullable = false)
    private LocalTime fimIntervalo;

    @Column(name = "ativo", nullable = false)
    private Boolean ativo;

    @Embedded
    private EnderecoModel endereco;

    @OneToMany(mappedBy = "veterinario")
    private List<ProcedimentoAgendamentoModel> agendamentos;

    @ManyToMany(mappedBy = "veterinarios")
    private List<ClinicaModel> clinicas;

    @ManyToMany
    @JoinTable(name = "VETERINARIO_PROCEDIMENTO", joinColumns = @JoinColumn(name = "veterinario_id"), inverseJoinColumns = @JoinColumn(name = "procedimento_id"))
    private List<ProcedimentoModel> procedimentos;
}
