package br.com.hellopet.datasources.database.relational.business.model;

import br.com.hellopet.datasources.database.relational.core.model.EnderecoModel;
import br.com.hellopet.datasources.database.relational.customer.model.EspecieModel;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Entity
@Table(name = "profissional")
public class ProfissionalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "profissional_tipo_id", referencedColumnName = "id", nullable = false)
    private ProfissionalTipoModel profissionalTipo;

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "cfmv", unique = true)
    private String cfmv;

    @Column(name = "crmv", unique = true)
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

    @OneToMany(mappedBy = "profissional")
    private List<ProcedimentoAgendamentoModel> agendamentos;

    @ManyToMany(mappedBy = "profissionais")
    private List<EstabelecimentoModel> estabelecimentos;

    @ManyToMany
    @JoinTable(name = "PROFISSIONAL_ESPECIE", joinColumns = @JoinColumn(name = "profissional_id"), inverseJoinColumns = @JoinColumn(name = "especie_id"))
    private List<EspecieModel> especies;

    @ManyToMany
    @JoinTable(name = "PROFISSIONAL_PROCEDIMENTO_GRUPO", joinColumns = @JoinColumn(name = "profissional_id"), inverseJoinColumns = @JoinColumn(name = "procedimento_grupo_id"))
    private List<ProcedimentoGrupoModel> procedimentoGrupos;
}
