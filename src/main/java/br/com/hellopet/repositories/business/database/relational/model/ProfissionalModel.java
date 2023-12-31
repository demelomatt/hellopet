package br.com.hellopet.repositories.business.database.relational.model;

import br.com.hellopet.repositories.core.database.relational.model.EnderecoModel;
import br.com.hellopet.repositories.customer.database.relational.model.EspecieModel;
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

    @Column(name = "cpf", nullable = false, unique = true, length = 11)
    private String cpf;

    @Column(name = "cfmv", unique = true, length = 7)
    private String cfmv;

    @Column(name = "crmv", unique = true, length = 8)
    private String crmv;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "telefone", length = 12)
    private String telefone;

    @Column(name = "celular", length = 13)
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

    @OneToMany(mappedBy = "profissional")
    private List<ProfissionalAusenciaModel> ausencias;

    @ManyToMany(mappedBy = "profissionais")
    private List<EstabelecimentoModel> estabelecimentos;

    @ManyToMany
    @JoinTable(name = "profissional_especie", joinColumns = @JoinColumn(name = "profissional_id"), inverseJoinColumns = @JoinColumn(name = "especie_id"))
    private List<EspecieModel> especies;

    @ManyToMany
    @JoinTable(name = "profissional_procedimento_grupo", joinColumns = @JoinColumn(name = "profissional_id"), inverseJoinColumns = @JoinColumn(name = "procedimento_grupo_id"))
    private List<ProcedimentoGrupoModel> procedimentoGrupos;
}
