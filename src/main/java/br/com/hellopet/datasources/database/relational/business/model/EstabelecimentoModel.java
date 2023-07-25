package br.com.hellopet.datasources.database.relational.business.model;

import br.com.hellopet.datasources.database.relational.core.model.DiaSemanaModel;
import br.com.hellopet.datasources.database.relational.core.model.EnderecoModel;
import br.com.hellopet.datasources.database.relational.customer.model.TutorModel;
import jakarta.persistence.*;
import lombok.Data;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "ESTABELECIMENTO")
public class EstabelecimentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "estabelecimento_tipo_id", referencedColumnName = "id", nullable = false)
    private EstabelecimentoTipoModel estabelecimentoTipo;

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

    @OneToMany(mappedBy = "estabelecimento")
    private List<ProcedimentoModel> procedimentos;

    @ManyToMany
    @JoinTable(name = "ESTABELECIMENTO_DIA_SEMANA", joinColumns = @JoinColumn(name = "estabelecimento_id"), inverseJoinColumns = @JoinColumn(name = "dia_semana_id"))
    private Set<DiaSemanaModel> diasFuncionamento;

    @ManyToMany
    @JoinTable(name = "ESTABELECIMENTO_PROFISSIONAL", joinColumns = @JoinColumn(name = "estabelecimento_id"), inverseJoinColumns = @JoinColumn(name = "profissional_id"))
    private List<ProfissionalModel> profissionais;

    @ManyToMany
    @JoinTable(name = "ESTABELECIMENTO_TUTOR", joinColumns = @JoinColumn(name = "estabelecimento_id"), inverseJoinColumns = @JoinColumn(name = "tutor_id"))
    private List<TutorModel> tutores;

}