package br.com.hellopet.datasources.database.relational.business.model;

import br.com.hellopet.datasources.database.relational.core.model.EnderecoModel;
import br.com.hellopet.datasources.database.relational.customer.model.PetModel;
import jakarta.persistence.*;
import lombok.Data;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "CLINICA")
public class ClinicaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cnpj", nullable = false, unique = true)
    private String cnpj;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "celular")
    private String celular;

    @Column(name = "data_fundacao")
    private LocalDate dataFundacao;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDate dataCadastro;

    @Column(name = "horario_abertura", nullable = false)
    private LocalTime horarioAbertura;

    @Column(name = "horario_fechamento", nullable = false)
    private LocalTime horarioFechamento;

    @Column(name = "ativo", nullable = false)
    private Boolean ativo;

    @Embedded
    private EnderecoModel endereco;

    @OneToMany(mappedBy = "clinica")
    private List<ProcedimentoModel> procedimentos;

    @ManyToMany
    @JoinTable(name = "VETERINARIO_CLINICA", joinColumns = @JoinColumn(name = "clinica_id"), inverseJoinColumns = @JoinColumn(name = "veterinario_id"))
    private List<VeterinarioModel> veterinarios;

}
